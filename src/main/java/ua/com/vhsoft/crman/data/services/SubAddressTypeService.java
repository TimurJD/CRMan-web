package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SubAddressTypeRepository;
import ua.com.vhsoft.crman.mvc.models.SubAddressType;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("subAddressTypeService")
public class SubAddressTypeService implements AbstractService<SubAddressType> {

    @Resource
    private SubAddressTypeRepository subAddressTypeRepository;

    @Override
    public SubAddressType addOrUpdate(SubAddressType entity) {
        return subAddressTypeRepository.saveAndFlush(entity);
    }

    @Override
    public List<SubAddressType> findAll(Predicate predicate) {
        return (List<SubAddressType>) subAddressTypeRepository.findAll(predicate);
    }

    @Override
    public List<SubAddressType> findAll() {
        return subAddressTypeRepository.findAll();
    }

    @Override
    public void delete(SubAddressType entity) {
        subAddressTypeRepository.delete(entity);
    }
}

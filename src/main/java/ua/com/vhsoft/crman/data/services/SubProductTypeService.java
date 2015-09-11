package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SubProductTypeRepository;
import ua.com.vhsoft.crman.mvc.models.SubProductType;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("subProductTypeService")
public class SubProductTypeService implements AbstractService<SubProductType> {

    @Resource
    private SubProductTypeRepository subProductTypeRepository;

    @Override
    public SubProductType addOrUpdate(SubProductType entity) {
        return subProductTypeRepository.saveAndFlush(entity);
    }

    @Override
    public List<SubProductType> findAll(Predicate predicate) {
        return (List<SubProductType>) subProductTypeRepository.findAll(predicate);
    }

    @Override
    public List<SubProductType> findAll() {
        return subProductTypeRepository.findAll();
    }

    @Override
    public void delete(SubProductType entity) {
        subProductTypeRepository.delete(entity);
    }
}

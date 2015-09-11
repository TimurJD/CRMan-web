package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SubUnitTypeRepository;
import ua.com.vhsoft.crman.mvc.models.SubUnitType;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("subUnitTypeService")
public class SubUnitTypeService implements AbstractService<SubUnitType> {

    @Resource
    private SubUnitTypeRepository subUnitTypeRepository;

    @Override
    public SubUnitType addOrUpdate(SubUnitType entity) {
        return subUnitTypeRepository.saveAndFlush(entity);
    }

    @Override
    public List<SubUnitType> findAll(Predicate predicate) {
        return (List<SubUnitType>) subUnitTypeRepository.findAll(predicate);
    }

    @Override
    public List<SubUnitType> findAll() {
        return subUnitTypeRepository.findAll();
    }

    @Override
    public void delete(SubUnitType entity) {
        subUnitTypeRepository.delete(entity);
    }
}

package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SubActivityTypeRepository;
import ua.com.vhsoft.crman.mvc.models.SubActivityType;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("subActivityTypeService")
public class SubActivityTypeService implements AbstractService<SubActivityType> {

    @Resource
    private SubActivityTypeRepository subActivityTypeRepository;

    @Override
    public SubActivityType addOrUpdate(SubActivityType entity) {
        return subActivityTypeRepository.saveAndFlush(entity);
    }

    @Override
    public List<SubActivityType> findAll(Predicate predicate) {
        return (List<SubActivityType>) subActivityTypeRepository.findAll(predicate);
    }

    @Override
    public List<SubActivityType> findAll() {
        return subActivityTypeRepository.findAll();
    }

    @Override
    public void delete(SubActivityType entity) {
        subActivityTypeRepository.delete(entity);
    }

    @Override
    public SubActivityType findById(Integer id) {
        return subActivityTypeRepository.findOne(id);
    }

    @Override
    public SubActivityType findOne(Predicate predicate) {
        return subActivityTypeRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        subActivityTypeRepository.delete(id);
    }
}

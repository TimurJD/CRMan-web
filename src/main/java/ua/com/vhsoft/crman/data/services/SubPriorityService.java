package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SubPriorityRepository;
import ua.com.vhsoft.crman.mvc.models.SubPriority;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("subPriorityService")
public class SubPriorityService implements AbstractService<SubPriority> {

    @Resource
    private SubPriorityRepository subPriorityRepository;

    @Override
    public SubPriority addOrUpdate(SubPriority entity) {
        return subPriorityRepository.saveAndFlush(entity);
    }

    @Override
    public List<SubPriority> findAll(Predicate predicate) {
        return (List<SubPriority>) subPriorityRepository.findAll(predicate);
    }

    @Override
    public List<SubPriority> findAll() {
        return subPriorityRepository.findAll();
    }

    @Override
    public void delete(SubPriority entity) {
        subPriorityRepository.delete(entity);
    }

    @Override
    public SubPriority findById(Integer id) {
        return subPriorityRepository.findOne(id);
    }

    @Override
    public SubPriority findOne(Predicate predicate) {
        return subPriorityRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        subPriorityRepository.delete(id);
    }
}

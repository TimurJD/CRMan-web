package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SubActivityResultRepository;
import ua.com.vhsoft.crman.mvc.models.SubActivityResult;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("subActivityResultService")
public class SubActivityResultService implements AbstractService<SubActivityResult> {

    @Resource
    private SubActivityResultRepository subActivityResultRepository;

    @Override
    public SubActivityResult addOrUpdate(SubActivityResult entity) {
        return subActivityResultRepository.saveAndFlush(entity);
    }

    @Override
    public List<SubActivityResult> findAll(Predicate predicate) {
        return (List<SubActivityResult>) subActivityResultRepository.findAll(predicate);
    }

    @Override
    public List<SubActivityResult> findAll() {
        return subActivityResultRepository.findAll();
    }

    @Override
    public void delete(SubActivityResult entity) {
        subActivityResultRepository.delete(entity);
    }

    @Override
    public SubActivityResult findById(Integer id) {
        return subActivityResultRepository.findOne(id);
    }

    @Override
    public SubActivityResult findOne(Predicate predicate) {
        return subActivityResultRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        subActivityResultRepository.delete(id);
    }
}

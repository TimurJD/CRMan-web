package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SubActivityStatusRepository;
import ua.com.vhsoft.crman.mvc.models.SubActivityStatus;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("subActivityStatusService")
public class SubActivityStatusService implements AbstractService<SubActivityStatus> {

    @Resource
    private SubActivityStatusRepository subActivityStatusRepository;

    @Override
    public SubActivityStatus addOrUpdate(SubActivityStatus entity) {
        return subActivityStatusRepository.saveAndFlush(entity);
    }

    @Override
    public List<SubActivityStatus> findAll(Predicate predicate) {
        return (List<SubActivityStatus>) subActivityStatusRepository.findAll(predicate);
    }

    @Override
    public List<SubActivityStatus> findAll() {
        return subActivityStatusRepository.findAll();
    }

    @Override
    public void delete(SubActivityStatus entity) {
        subActivityStatusRepository.delete(entity);
    }

    @Override
    public SubActivityStatus findById(Integer id) {
        return subActivityStatusRepository.findOne(id);
    }

    @Override
    public SubActivityStatus findOne(Predicate predicate) {
        return subActivityStatusRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        subActivityStatusRepository.delete(id);
    }
}

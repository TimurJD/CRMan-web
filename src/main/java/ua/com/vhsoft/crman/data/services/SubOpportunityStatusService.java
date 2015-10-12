package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SubOpportunityStatusRepository;
import ua.com.vhsoft.crman.mvc.models.SubOpportunityStatus;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("subOpportunityStatusService")
public class SubOpportunityStatusService implements AbstractService<SubOpportunityStatus> {

    @Resource
    private SubOpportunityStatusRepository subOpportunityStatusRepository;


    @Override
    public SubOpportunityStatus addOrUpdate(SubOpportunityStatus entity) {
        return subOpportunityStatusRepository.saveAndFlush(entity);
    }

    @Override
    public List<SubOpportunityStatus> findAll(Predicate predicate) {
        return (List<SubOpportunityStatus>) subOpportunityStatusRepository.findAll(predicate);
    }

    @Override
    public List<SubOpportunityStatus> findAll() {
        return subOpportunityStatusRepository.findAll();
    }

    @Override
    public void delete(SubOpportunityStatus entity) {
        subOpportunityStatusRepository.delete(entity);
    }

    @Override
    public SubOpportunityStatus findById(Integer id) {
        return subOpportunityStatusRepository.findOne(id);
    }

    @Override
    public SubOpportunityStatus findOne(Predicate predicate) {
        return subOpportunityStatusRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        subOpportunityStatusRepository.delete(id);
    }
}

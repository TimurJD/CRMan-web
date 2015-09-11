package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SubLeadSourceRepository;
import ua.com.vhsoft.crman.mvc.models.SubLeadSource;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("subLeadSourceService")
public class SubLeadSourceService implements AbstractService<SubLeadSource> {

    @Resource
    private SubLeadSourceRepository subLeadSourceRepository;


    @Override
    public SubLeadSource addOrUpdate(SubLeadSource entity) {
        return subLeadSourceRepository.saveAndFlush(entity);
    }

    @Override
    public List<SubLeadSource> findAll(Predicate predicate) {
        return (List<SubLeadSource>) subLeadSourceRepository.findAll(predicate);
    }

    @Override
    public List<SubLeadSource> findAll() {
        return subLeadSourceRepository.findAll();
    }

    @Override
    public void delete(SubLeadSource entity) {
        subLeadSourceRepository.delete(entity);
    }
}

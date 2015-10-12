package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SubIndustryRepository;
import ua.com.vhsoft.crman.mvc.models.SubIndustry;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("subIndustryService")
public class SubIndustryService implements AbstractService<SubIndustry> {

    @Resource
    private SubIndustryRepository subIndustryRepository;

    @Override
    public SubIndustry addOrUpdate(SubIndustry entity) {
        return subIndustryRepository.saveAndFlush(entity);
    }

    @Override
    public List<SubIndustry> findAll(Predicate predicate) {
        return (List<SubIndustry>) subIndustryRepository.findAll(predicate);
    }

    @Override
    public List<SubIndustry> findAll() {
        return subIndustryRepository.findAll();
    }

    @Override
    public void delete(SubIndustry entity) {
        subIndustryRepository.delete(entity);
    }

    @Override
    public SubIndustry findById(Integer id) {
        return subIndustryRepository.findOne(id);
    }

    @Override
    public SubIndustry findOne(Predicate predicate) {
        return subIndustryRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        subIndustryRepository.delete(id);
    }
}

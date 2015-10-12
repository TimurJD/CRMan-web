package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SubCityRepository;
import ua.com.vhsoft.crman.mvc.models.SubCity;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("subCityService")
public class SubCityService implements AbstractService<SubCity> {

    @Resource
    private SubCityRepository subCityRepository;

    @Override
    public SubCity addOrUpdate(SubCity entity) {
        return subCityRepository.saveAndFlush(entity);
    }

    @Override
    public List<SubCity> findAll(Predicate predicate) {
        return (List<SubCity>) subCityRepository.findAll(predicate);
    }

    @Override
    public List<SubCity> findAll() {
        return subCityRepository.findAll();
    }

    @Override
    public void delete(SubCity entity) {
        subCityRepository.delete(entity);
    }

    @Override
    public SubCity findById(Integer id) {
        return subCityRepository.findOne(id);
    }

    @Override
    public SubCity findOne(Predicate predicate) {
        return subCityRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        subCityRepository.delete(id);
    }
}

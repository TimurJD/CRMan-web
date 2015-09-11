package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SubCountryRepository;
import ua.com.vhsoft.crman.mvc.models.SubCountry;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("subCountryService")
public class SubCountryService implements AbstractService<SubCountry> {

    @Resource
    private SubCountryRepository subCountryRepository;

    @Override
    public SubCountry addOrUpdate(SubCountry entity) {
        return subCountryRepository.saveAndFlush(entity);
    }

    @Override
    public List<SubCountry> findAll(Predicate predicate) {
        return (List<SubCountry>) subCountryRepository.findAll(predicate);
    }

    @Override
    public List<SubCountry> findAll() {
        return subCountryRepository.findAll();
    }

    @Override
    public void delete(SubCountry entity) {
        subCountryRepository.delete(entity);
    }
}

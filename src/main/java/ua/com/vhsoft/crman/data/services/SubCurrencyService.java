package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SubCurrencyRepository;
import ua.com.vhsoft.crman.mvc.models.SubCurrency;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("subCurrencyService")
public class SubCurrencyService implements AbstractService<SubCurrency> {

    @Resource
    private SubCurrencyRepository subCurrencyRepository;

    @Override
    public SubCurrency addOrUpdate(SubCurrency entity) {
        return subCurrencyRepository.saveAndFlush(entity);
    }

    @Override
    public List<SubCurrency> findAll(Predicate predicate) {
        return (List<SubCurrency>) subCurrencyRepository.findAll(predicate);
    }

    @Override
    public List<SubCurrency> findAll() {
        return subCurrencyRepository.findAll();
    }

    @Override
    public void delete(SubCurrency entity) {
        subCurrencyRepository.delete(entity);
    }
}

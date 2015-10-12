package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.TblAccountRepository;
import ua.com.vhsoft.crman.mvc.models.TblAccount;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Timur Berezhnoi
 */
@Service("tblAccountService")
public class TblAccountService implements AbstractService<TblAccount> {

    @Resource
    private TblAccountRepository tblAccountRepository;

    @Override
    public TblAccount addOrUpdate(TblAccount entity) {
        return tblAccountRepository.saveAndFlush(entity);
    }

    @Override
    public List<TblAccount> findAll(Predicate predicate) {
        return (List<TblAccount>) tblAccountRepository.findAll(predicate);
    }

    @Override
    public List<TblAccount> findAll() {
        return tblAccountRepository.findAll();
    }

    @Override
    public void delete(TblAccount entity) {
        tblAccountRepository.delete(entity);
    }

    @Override
    public TblAccount findById(Integer id) {
        return tblAccountRepository.findOne(id);
    }

    @Override
    public TblAccount findOne(Predicate predicate) {
        return tblAccountRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        tblAccountRepository.delete(id);
    }
}

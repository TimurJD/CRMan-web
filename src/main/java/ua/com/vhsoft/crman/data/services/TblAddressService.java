package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.TblAddressRepository;
import ua.com.vhsoft.crman.mvc.models.TblAddress;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Timur Berezhnoi
 */
@Service("tblAddressService")
public class TblAddressService implements AbstractService<TblAddress> {

    @Resource
    private TblAddressRepository tblAddressRepository;

    @Override
    public TblAddress addOrUpdate(TblAddress entity) {
        return tblAddressRepository.save(entity);
    }

    @Override
    public List<TblAddress> findAll(Predicate predicate) {
        return (List<TblAddress>) tblAddressRepository.findAll(predicate);
    }

    @Override
    public List<TblAddress> findAll() {
        return tblAddressRepository.findAll();
    }

    @Override
    public void delete(TblAddress entity) {
        tblAddressRepository.delete(entity);
    }

    @Override
    public TblAddress findById(Integer id) {
        return tblAddressRepository.findOne(id);
    }

    @Override
    public TblAddress findOne(Predicate predicate) {
        return tblAddressRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        tblAddressRepository.delete(id);
    }
}

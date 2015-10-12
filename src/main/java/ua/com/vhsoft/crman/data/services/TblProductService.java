package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.TblProductRepository;
import ua.com.vhsoft.crman.mvc.models.TblProduct;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Timur Berezhnoi
 */
@Service("tblProductService")
public class TblProductService implements AbstractService<TblProduct> {

    @Resource
    private TblProductRepository tblProductRepository;

    @Override
    public TblProduct addOrUpdate(TblProduct entity) {
        return tblProductRepository.save(entity);
    }

    @Override
    public List<TblProduct> findAll(Predicate predicate) {
        return (List<TblProduct>) tblProductRepository.findAll(predicate);
    }

    @Override
    public List<TblProduct> findAll() {
        return tblProductRepository.findAll();
    }

    @Override
    public void delete(TblProduct entity) {
        tblProductRepository.delete(entity);
    }

    @Override
    public TblProduct findById(Integer id) {
        return tblProductRepository.findOne(id);
    }

    @Override
    public TblProduct findOne(Predicate predicate) {
        return tblProductRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        tblProductRepository.delete(id);
    }
}

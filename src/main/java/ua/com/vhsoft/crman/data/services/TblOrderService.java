package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.TblOrderRepository;
import ua.com.vhsoft.crman.mvc.models.TblOrder;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Timur Berezhnoi
 */
@Service("tblOrderService")
public class TblOrderService implements AbstractService<TblOrder> {

    @Resource
    private TblOrderRepository tblOrderRepository;

    @Override
    public TblOrder addOrUpdate(TblOrder entity) {
        return tblOrderRepository.save(entity);
    }

    @Override
    public List<TblOrder> findAll(Predicate predicate) {
        return (List<TblOrder>) tblOrderRepository.findAll(predicate);
    }

    @Override
    public List<TblOrder> findAll() {
        return tblOrderRepository.findAll();
    }

    @Override
    public void delete(TblOrder entity) {
        tblOrderRepository.delete(entity);
    }

    @Override
    public TblOrder findById(Integer id) {
        return tblOrderRepository.findOne(id);
    }

    @Override
    public TblOrder findOne(Predicate predicate) {
        return tblOrderRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        tblOrderRepository.delete(id);
    }
}

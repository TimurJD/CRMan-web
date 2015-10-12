package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SubOrderStatusRepository;
import ua.com.vhsoft.crman.mvc.models.SubOrderStatus;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("subOrderStatusService")
public class SubOrderStatusService implements AbstractService<SubOrderStatus> {

    @Resource
    private SubOrderStatusRepository subOrderStatusRepository;

    @Override
    public SubOrderStatus addOrUpdate(SubOrderStatus entity) {
        return subOrderStatusRepository.saveAndFlush(entity);
    }

    @Override
    public List<SubOrderStatus> findAll(Predicate predicate) {
        return (List<SubOrderStatus>) subOrderStatusRepository.findAll(predicate);
    }

    @Override
    public List<SubOrderStatus> findAll() {
        return subOrderStatusRepository.findAll();
    }

    @Override
    public void delete(SubOrderStatus entity) {
        subOrderStatusRepository.delete(entity);
    }

    @Override
    public SubOrderStatus findById(Integer id) {
        return subOrderStatusRepository.findOne(id);
    }

    @Override
    public SubOrderStatus findOne(Predicate predicate) {
        return subOrderStatusRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        subOrderStatusRepository.delete(id);
    }
}

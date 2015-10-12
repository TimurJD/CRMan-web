package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SubInvoiceStatusRepository;
import ua.com.vhsoft.crman.mvc.models.SubInvoiceStatus;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("subInvoiceStatusService")
public class SubInvoiceStatusService implements AbstractService<SubInvoiceStatus> {

    @Resource
    private SubInvoiceStatusRepository subInvoiceStatusRepository;

    @Override
    public SubInvoiceStatus addOrUpdate(SubInvoiceStatus entity) {
        return subInvoiceStatusRepository.saveAndFlush(entity);
    }

    @Override
    public List<SubInvoiceStatus> findAll(Predicate predicate) {
        return (List<SubInvoiceStatus>) subInvoiceStatusRepository.findAll(predicate);
    }

    @Override
    public List<SubInvoiceStatus> findAll() {
        return subInvoiceStatusRepository.findAll();
    }

    @Override
    public void delete(SubInvoiceStatus entity) {
        subInvoiceStatusRepository.delete(entity);
    }

    @Override
    public SubInvoiceStatus findById(Integer id) {
        return subInvoiceStatusRepository.findOne(id);
    }

    @Override
    public SubInvoiceStatus findOne(Predicate predicate) {
        return subInvoiceStatusRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        subInvoiceStatusRepository.delete(id);
    }
}

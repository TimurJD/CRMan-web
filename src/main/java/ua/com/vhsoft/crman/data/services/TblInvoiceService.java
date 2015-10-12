package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.TblInvoiceRepository;
import ua.com.vhsoft.crman.mvc.models.TblInvoice;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Timur Berezhnoi
 */
@Service("tblInvoiceService")
public class TblInvoiceService implements AbstractService<TblInvoice> {

    @Resource
    private TblInvoiceRepository tblInvoiceRepository;

    @Override
    public TblInvoice addOrUpdate(TblInvoice entity) {
        return tblInvoiceRepository.save(entity);
    }

    @Override
    public List<TblInvoice> findAll(Predicate predicate) {
        return (List<TblInvoice>) tblInvoiceRepository.findAll(predicate);
    }

    @Override
    public List<TblInvoice> findAll() {
        return tblInvoiceRepository.findAll();
    }

    @Override
    public void delete(TblInvoice entity) {
        tblInvoiceRepository.delete(entity);
    }

    @Override
    public TblInvoice findById(Integer id) {
        return tblInvoiceRepository.findOne(id);
    }

    @Override
    public TblInvoice findOne(Predicate predicate) {
        return tblInvoiceRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        tblInvoiceRepository.delete(id);
    }
}

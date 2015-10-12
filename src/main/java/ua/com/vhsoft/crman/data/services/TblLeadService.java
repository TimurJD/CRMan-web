package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.TblLeadRepository;
import ua.com.vhsoft.crman.mvc.models.TblLead;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Timur Berezhnoi
 */
@Service("tblLeadService")
public class TblLeadService implements AbstractService<TblLead> {

    @Resource
    private TblLeadRepository tblLeadRepository;

    @Override
    public TblLead addOrUpdate(TblLead entity) {
        return tblLeadRepository.save(entity);
    }

    @Override
    public List<TblLead> findAll(Predicate predicate) {
        return (List<TblLead>) tblLeadRepository.findAll(predicate);
    }

    @Override
    public List<TblLead> findAll() {
        return tblLeadRepository.findAll();
    }

    @Override
    public void delete(TblLead entity) {
        tblLeadRepository.delete(entity);
    }

    @Override
    public TblLead findById(Integer id) {
        return tblLeadRepository.findOne(id);
    }

    @Override
    public TblLead findOne(Predicate predicate) {
        return tblLeadRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        tblLeadRepository.delete(id);
    }
}

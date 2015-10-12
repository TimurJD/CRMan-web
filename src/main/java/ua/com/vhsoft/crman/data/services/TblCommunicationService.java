package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.TblCommunicationRepository;
import ua.com.vhsoft.crman.mvc.models.TblCommunication;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Timur Berezhnoi
 */
@Service("tblCommunicationService")
public class TblCommunicationService implements AbstractService<TblCommunication> {

    @Resource
    private TblCommunicationRepository tblCommunicationRepository;

    @Override
    public TblCommunication addOrUpdate(TblCommunication entity) {
        return tblCommunicationRepository.save(entity);
    }

    @Override
    public List<TblCommunication> findAll(Predicate predicate) {
        return (List<TblCommunication>) tblCommunicationRepository.findAll(predicate);
    }

    @Override
    public List<TblCommunication> findAll() {
        return tblCommunicationRepository.findAll();
    }

    @Override
    public void delete(TblCommunication entity) {
        tblCommunicationRepository.delete(entity);
    }

    @Override
    public TblCommunication findById(Integer id) {
        return tblCommunicationRepository.findOne(id);
    }

    @Override
    public TblCommunication findOne(Predicate predicate) {
        return tblCommunicationRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        tblCommunicationRepository.delete(id);
    }
}

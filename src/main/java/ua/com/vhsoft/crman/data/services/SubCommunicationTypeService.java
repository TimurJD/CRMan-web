package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SubCommunicationTypeRepository;
import ua.com.vhsoft.crman.mvc.models.SubCommunicationType;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("subCommunicationTypeService")
public class SubCommunicationTypeService implements AbstractService<SubCommunicationType> {

    @Resource
    private SubCommunicationTypeRepository subCommunicationTypeRepository;

    @Override
    public SubCommunicationType addOrUpdate(SubCommunicationType entity) {
        return subCommunicationTypeRepository.saveAndFlush(entity);
    }

    @Override
    public List<SubCommunicationType> findAll(Predicate predicate) {
        return (List<SubCommunicationType>) subCommunicationTypeRepository.findAll(predicate);
    }

    @Override
    public List<SubCommunicationType> findAll() {
        return subCommunicationTypeRepository.findAll();
    }

    @Override
    public void delete(SubCommunicationType entity) {
        subCommunicationTypeRepository.delete(entity);
    }

    @Override
    public SubCommunicationType findById(Integer id) {
        return subCommunicationTypeRepository.findOne(id);
    }

    @Override
    public SubCommunicationType findOne(Predicate predicate) {
        return subCommunicationTypeRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        subCommunicationTypeRepository.delete(id);
    }
}

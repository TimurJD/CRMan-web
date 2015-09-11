package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SubRelationTypeRepository;
import ua.com.vhsoft.crman.mvc.models.SubRelationType;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("SubRelationTypeService")
public class SubRelationTypeService implements AbstractService<SubRelationType> {

    @Resource
    private SubRelationTypeRepository subRelationTypeRepository;

    @Override
    public SubRelationType addOrUpdate(SubRelationType entity) {
        return subRelationTypeRepository.saveAndFlush(entity);
    }

    @Override
    public List<SubRelationType> findAll(Predicate predicate) {
        return (List<SubRelationType>) subRelationTypeRepository.findAll(predicate);
    }

    @Override
    public List<SubRelationType> findAll() {
        return subRelationTypeRepository.findAll();
    }

    @Override
    public void delete(SubRelationType entity) {
        subRelationTypeRepository.delete(entity);
    }
}

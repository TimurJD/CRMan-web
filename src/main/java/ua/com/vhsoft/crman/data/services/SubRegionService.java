package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SubRegionRepository;
import ua.com.vhsoft.crman.mvc.models.SubRegion;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("SubRegionService")
public class SubRegionService implements AbstractService<SubRegion> {

    @Resource
    private SubRegionRepository subRegionRepository;

    @Override
    public SubRegion addOrUpdate(SubRegion entity) {
        return subRegionRepository.saveAndFlush(entity);
    }

    @Override
    public List<SubRegion> findAll(Predicate predicate) {
        return (List<SubRegion>) subRegionRepository.findAll(predicate);
    }

    @Override
    public List<SubRegion> findAll() {
        return subRegionRepository.findAll();
    }

    @Override
    public void delete(SubRegion entity) {
        subRegionRepository.delete(entity);
    }

    @Override
    public SubRegion findById(Integer id) {
        return subRegionRepository.findOne(id);
    }

    @Override
    public SubRegion findOne(Predicate predicate) {
        return subRegionRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        subRegionRepository.delete(id);
    }
}

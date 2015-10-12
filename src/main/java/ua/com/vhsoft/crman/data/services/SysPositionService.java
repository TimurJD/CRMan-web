package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SysPositionRepository;
import ua.com.vhsoft.crman.mvc.models.SysPosition;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("sysPositionService")
public class SysPositionService implements AbstractService<SysPosition> {

    @Resource
    private SysPositionRepository sysPositionRepository;

    @Override
    public SysPosition addOrUpdate(SysPosition entity) {
        return sysPositionRepository.saveAndFlush(entity);
    }

    @Override
    public List<SysPosition> findAll(Predicate predicate) {
        return (List<SysPosition>) sysPositionRepository.findAll(predicate);
    }

    @Override
    public List<SysPosition> findAll() {
        return sysPositionRepository.findAll();
    }

    @Override
    public void delete(SysPosition entity) {
        sysPositionRepository.delete(entity);
    }

    @Override
    public SysPosition findById(Integer id) {
        return sysPositionRepository.findOne(id);
    }

    @Override
    public SysPosition findOne(Predicate predicate) {
        return sysPositionRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        sysPositionRepository.delete(id);
    }
}

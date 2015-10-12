package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SysFilterRepository;
import ua.com.vhsoft.crman.mvc.models.SysFilter;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("sysFilterService")
public class SysFilterService implements AbstractService<SysFilter> {
    
    @Resource
    private SysFilterRepository sysFilterRepository;
    
    @Override
    public SysFilter addOrUpdate(SysFilter entity) {
        return sysFilterRepository.saveAndFlush(entity);
    }

    @Override
    public List<SysFilter> findAll(Predicate predicate) {
        return (List<SysFilter>) sysFilterRepository.findAll(predicate);
    }

    @Override
    public List<SysFilter> findAll() {
        return sysFilterRepository.findAll();
    }

    @Override
    public void delete(SysFilter entity) {
        sysFilterRepository.delete(entity);
    }

    @Override
    public SysFilter findById(Integer id) {
        return sysFilterRepository.findOne(id);
    }

    @Override
    public SysFilter findOne(Predicate predicate) {
        return sysFilterRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        sysFilterRepository.delete(id);
    }

    
}

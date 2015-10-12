package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SysLogRepository;
import ua.com.vhsoft.crman.mvc.models.SysLog;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("sysLogService")
public class SysLogService implements AbstractService<SysLog> {

    @Resource
    private SysLogRepository sysLogRepository;

    @Override
    public SysLog addOrUpdate(SysLog entity) {
        return sysLogRepository.saveAndFlush(entity);
    }

    @Override
    public List<SysLog> findAll(Predicate predicate) {
        return (List<SysLog>) sysLogRepository.findAll(predicate);
    }

    @Override
    public List<SysLog> findAll() {
        return sysLogRepository.findAll();
    }

    @Override
    public void delete(SysLog entity) {
        sysLogRepository.delete(entity);
    }

    @Override
    public SysLog findById(Integer id) {
        return sysLogRepository.findOne(id);
    }

    @Override
    public SysLog findOne(Predicate predicate) {
        return sysLogRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        sysLogRepository.delete(id);
    }

}

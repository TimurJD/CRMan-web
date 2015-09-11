package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SysSettingRepository;
import ua.com.vhsoft.crman.mvc.models.SysSetting;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("sysSettingService")
public class SysSettingService implements AbstractService<SysSetting> {

    @Resource
    private SysSettingRepository sysSettingRepository;

    @Override
    public SysSetting addOrUpdate(SysSetting entity) {
        return sysSettingRepository.saveAndFlush(entity);
    }

    @Override
    public List<SysSetting> findAll(Predicate predicate) {
        return (List<SysSetting>) sysSettingRepository.findAll(predicate);
    }

    @Override
    public List<SysSetting> findAll() {
        return sysSettingRepository.findAll();
    }

    @Override
    public void delete(SysSetting entity) {
        sysSettingRepository.delete(entity);
    }
}

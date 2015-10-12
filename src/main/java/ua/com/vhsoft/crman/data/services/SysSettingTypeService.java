package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SysSettingTypeRepository;
import ua.com.vhsoft.crman.mvc.models.SysSetting;
import ua.com.vhsoft.crman.mvc.models.SysSettingType;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("SysSettingTypeService")
public class SysSettingTypeService implements AbstractService<SysSettingType> {

    @Resource
    private SysSettingTypeRepository sysSettingTypeRepository;

    @Override
    public SysSettingType addOrUpdate(SysSettingType entity) {
        return sysSettingTypeRepository.saveAndFlush(entity);
    }

    @Override
    public List<SysSettingType> findAll(Predicate predicate) {
        return (List<SysSettingType>) sysSettingTypeRepository.findAll(predicate);
    }

    @Override
    public List<SysSettingType> findAll() {
        return sysSettingTypeRepository.findAll();
    }

    @Override
    public void delete(SysSettingType entity) {
        sysSettingTypeRepository.delete(entity);
    }

    @Override
    public SysSettingType findById(Integer id) {
        return sysSettingTypeRepository.findOne(id);
    }

    @Override
    public SysSettingType findOne(Predicate predicate) {
        return sysSettingTypeRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        sysSettingTypeRepository.delete(id);
    }
}

package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SysPermissionRepository;
import ua.com.vhsoft.crman.mvc.models.SysPermission;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("sysPermissionService")
public class SysPermissionService implements AbstractService<SysPermission> {

    @Resource
    private SysPermissionRepository sysPermissionRepository;

    @Override
    public SysPermission addOrUpdate(SysPermission entity) {
        return sysPermissionRepository.saveAndFlush(entity);
    }

    @Override
    public List<SysPermission> findAll(Predicate predicate) {
        return (List<SysPermission>) sysPermissionRepository.findAll(predicate);
    }

    @Override
    public List<SysPermission> findAll() {
        return sysPermissionRepository.findAll();
    }

    @Override
    public void delete(SysPermission entity) {
        sysPermissionRepository.delete(entity);
    }
}

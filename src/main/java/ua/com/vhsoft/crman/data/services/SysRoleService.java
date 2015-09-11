package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import ua.com.vhsoft.crman.data.repositories.SysRoleRepository;
import ua.com.vhsoft.crman.mvc.models.SysRole;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
public class SysRoleService implements AbstractService<SysRole> {

    @Resource
    private SysRoleRepository sysRoleRepository;

    @Override
    public SysRole addOrUpdate(SysRole entity) {
        return sysRoleRepository.saveAndFlush(entity);
    }

    @Override
    public List<SysRole> findAll(Predicate predicate) {
        return (List<SysRole>) sysRoleRepository.findAll(predicate);
    }

    @Override
    public List<SysRole> findAll() {
        return sysRoleRepository.findAll();
    }

    @Override
    public void delete(SysRole entity) {
        sysRoleRepository.delete(entity);
    }
}

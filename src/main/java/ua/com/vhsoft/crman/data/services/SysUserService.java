package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SysUserRepository;
import ua.com.vhsoft.crman.mvc.models.SysUser;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("sysUserService")
public class SysUserService implements AbstractService<SysUser> {

    @Resource
    private SysUserRepository sysUserRepository;

    @Override
    public SysUser addOrUpdate(SysUser entity) {
        return sysUserRepository.saveAndFlush(entity);
    }

    @Override
    public List<SysUser> findAll(Predicate predicate) {
        return (List<SysUser>) sysUserRepository.findAll(predicate);
    }

    @Override
    public List<SysUser> findAll() {
        return sysUserRepository.findAll();
    }

    @Override
    public void delete(SysUser entity) {
        sysUserRepository.delete(entity);
    }
}
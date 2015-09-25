package ua.com.vhsoft.crman.data.manipulators;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import ua.com.vhsoft.crman.data.predicates.SysUserPredicate;
import ua.com.vhsoft.crman.data.services.SysUserService;
import ua.com.vhsoft.crman.mvc.models.SysUser;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Component
public class SysUserManipulator {

    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysUserPredicate sysUserPredicate;

    /**
     * Method for currently logged in user fetching
     *
     * @return currently logged in user or null if nobody is logged in
     */
    public SysUser getCurrentlyLoggedInUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();
        List<SysUser> sysUsers = sysUserService.findAll(sysUserPredicate.filterByName(name));
        if (sysUsers.isEmpty()) {
            return null;
        }
        return sysUsers.get(0);
    }

}

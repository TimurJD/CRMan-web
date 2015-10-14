package ua.com.vhsoft.crman.mvc.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ua.com.vhsoft.crman.data.manipulators.SysFilterManipulator;
import ua.com.vhsoft.crman.data.manipulators.SysUserManipulator;
import ua.com.vhsoft.crman.mvc.models.SysFilter;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@RestController
@RequestMapping("api/filters")
public class SysFilterRESTController implements AbstractRESTController<SysFilter> {

    @Autowired
    private SysFilterManipulator sysFilterManipulator;
    @Autowired
    private SysUserManipulator sysUserManipulator;

    @Override
    public SysFilter getByID(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public @ResponseBody
    List<SysFilter> getAll() {
        return sysFilterManipulator.getFiltersByUser(sysUserManipulator.getCurrentlyLoggedInUser());
    }

    @RequestMapping(value = "/{table}", method = RequestMethod.GET)
    @ResponseBody
    public List<SysFilter> getAll(@PathVariable String table) {
        return sysFilterManipulator.getFiltersByUserAndTable(sysUserManipulator.getCurrentlyLoggedInUser(), table);
    }

    @Override
    public SysFilter createEntry(SysFilter entry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @RequestMapping(value = "/edit")
    public SysFilter editEntry(SysFilter entry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @RequestMapping(value = "/delete/{id}")
    public SysFilter deleteByID(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SysFilter deleteByObject(SysFilter object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

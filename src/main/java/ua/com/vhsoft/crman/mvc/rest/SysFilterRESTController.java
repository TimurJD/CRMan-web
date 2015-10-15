package ua.com.vhsoft.crman.mvc.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

    //TODO refactor merge add and edit into one mrthod /save
    @Override
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public SysFilter createEntry(@RequestBody SysFilter entry) {
        return sysFilterManipulator.persistFilter(entry);
    }

    @Override
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ResponseBody
    public SysFilter editEntry(@RequestBody SysFilter entry) {
        return sysFilterManipulator.persistFilter(entry);
    }

    @Override
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteByID(@PathVariable Integer id) {
        sysFilterManipulator.deleteFilter(id);
    }

    @Override
    public void deleteByObject(SysFilter object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SysFilter> getFilteredData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

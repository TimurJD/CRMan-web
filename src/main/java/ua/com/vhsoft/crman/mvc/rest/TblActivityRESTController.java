package ua.com.vhsoft.crman.mvc.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ua.com.vhsoft.crman.data.manipulators.TblActivityManipulator;
import ua.com.vhsoft.crman.mvc.models.TblActivity;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@RestController
@RequestMapping("/api/activities")
public class TblActivityRESTController implements AbstractRESTController<TblActivity> {

    @Autowired
    private TblActivityManipulator tblActivityManipulator;

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    TblActivity getByID(@PathVariable("id") Integer id) {
        return tblActivityManipulator.getActivityByID(id);
    }

    @Override
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public @ResponseBody
    List<TblActivity> getAll() {
        return tblActivityManipulator.getAllActivities();
    }

    @Override
    @RequestMapping(value = "/filtered", method = RequestMethod.GET)
    public List<TblActivity> getFilteredData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TblActivity createEntry(TblActivity entry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TblActivity editEntry(TblActivity entry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteByID(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteByObject(TblActivity object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

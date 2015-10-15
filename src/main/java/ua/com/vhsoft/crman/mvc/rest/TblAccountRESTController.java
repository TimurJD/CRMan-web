package ua.com.vhsoft.crman.mvc.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ua.com.vhsoft.crman.data.manipulators.TblAccountManipulator;
import ua.com.vhsoft.crman.mvc.models.TblAccount;

/**
 *
 * @author Timur Berezhnoi
 */
@RestController
@RequestMapping("/api/accounts")
public class TblAccountRESTController implements AbstractRESTController<TblAccount> {

    @Autowired
    private TblAccountManipulator tblAccountManipulator;
    
    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody TblAccount getByID(@PathVariable("id") Integer id) {
        return tblAccountManipulator.getAccountByID(id);
    }

    @Override
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public @ResponseBody List<TblAccount> getAll() {
        return tblAccountManipulator.getAllAccounts();
    }

    @Override
    public TblAccount createEntry(TblAccount entry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TblAccount editEntry(TblAccount entry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteByID(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteByObject(TblAccount object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    

    @Override
    public List<TblAccount> getFilteredData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
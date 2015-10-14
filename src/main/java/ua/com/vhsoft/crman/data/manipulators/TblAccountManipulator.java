package ua.com.vhsoft.crman.data.manipulators;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.vhsoft.crman.data.predicates.TblAccountPredicate;
import ua.com.vhsoft.crman.data.services.TblAccountService;
import ua.com.vhsoft.crman.mvc.models.TblAccount;

/**
 * @author Timur Berezhnoi
 */
@Component
public class TblAccountManipulator {

    @Autowired
    private TblAccountService tblAccountService;
    @Autowired
    private TblAccountPredicate tblAccountPredicate;

    /**
     * Fetch object with specified id
     *
     * @param id
     * @return TblAccount object if found or null otherwise
     */
    public TblAccount getAccountByID(Integer id) {
        return tblAccountService.findById(id);
    }

    /**
     * Fetch all activities from DB without filters
     *
     * @return List of TblAccount objects
     */
    public List<TblAccount> getAllAccounts() {
        return tblAccountService.findAll();
    }   
}
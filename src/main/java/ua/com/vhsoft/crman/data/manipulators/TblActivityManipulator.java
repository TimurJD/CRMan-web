package ua.com.vhsoft.crman.data.manipulators;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.vhsoft.crman.data.predicates.TblActivityPredicate;
import ua.com.vhsoft.crman.data.services.TblActivityService;
import ua.com.vhsoft.crman.mvc.models.TblActivity;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Component
public class TblActivityManipulator {

    @Autowired
    private TblActivityService tblActivityService;
    @Autowired
    private TblActivityPredicate tblActivityPredicate;

    /**
     * Fetch object with specified id
     *
     * @param id
     * @return TblActtivity object if found or null otherwise
     */
    public TblActivity getActivityByID(Integer id) {
        return tblActivityService.findById(id);
    }

    /**
     * Fetch all activities from DB without filters
     *
     * @return List of TblActivitiy objects
     */
    public List<TblActivity> getAllActivities() {
        return tblActivityService.findAll();
    }
    
    /**
     * Save activity to DB
     *
     * @return List of TblActivitiy objects
     */
    public TblActivity saveActivity(TblActivity entity) {
    	return tblActivityService.addOrUpdate(entity);
    }
}

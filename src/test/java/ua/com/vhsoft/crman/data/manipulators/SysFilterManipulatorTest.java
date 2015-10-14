package ua.com.vhsoft.crman.data.manipulators;

import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ua.com.vhsoft.crman.config.AbstractSpringContextTest;
import ua.com.vhsoft.crman.mvc.models.SysFilter;
import ua.com.vhsoft.crman.mvc.models.SysUser;

/**
 *
 * @author vasylhoshovsky
 */
public class SysFilterManipulatorTest extends AbstractSpringContextTest {

    @Autowired
    private SysUserManipulator sysUserManipulator;
    @Autowired
    private SysFilterManipulator sysFilterManipulator;

    public SysFilterManipulatorTest() {
    }
 
    /**
     * Test of getFiltersByUser method, of class SysFilterManipulator. Fails if
     * result is empty for user vh
     */
    @Test
    public void testGetFiltersByUser_hasResult() {
        System.out.println("getFiltersByUser");
        SysUser user = sysUserManipulator.getAllUsers().get(0);

        List<SysFilter> result = sysFilterManipulator.getFiltersByUser(user);

        assertNotNull(result);
    }

    /**
     * Test of getFiltersByUser method, of class SysFilterManipulator. Fails if
     * result contains wrong user
     */
    @Test
    public void testGetFiltersByUser_isUserCorrect() {
        System.out.println("getFiltersByUser");
        SysUser user = sysUserManipulator.getAllUsers().get(0);

        List<SysFilter> result = sysFilterManipulator.getFiltersByUser(user);
        SysUser actualUser = result.get(0).getUserId();

        if (!result.isEmpty()) {
            assertEquals(user, actualUser);
        }
    }

    /**
     * Test of getFiltersByUserAndTable method, of class SysFilterManipulator.
     * Fails if result contains wrong user
     */
    @Test
    public void testGetFiltersByUserAndTable_isUserCorrect() {
        System.out.println("getFiltersByUserAndTable");
        String tableName = "activities";
        SysUser user = sysUserManipulator.getAllUsers().get(0);

        List<SysFilter> result = sysFilterManipulator.getFiltersByUserAndTable(user, tableName);
        SysUser actualUser = result.get(0).getUserId();

        if (!result.isEmpty()) {
            assertEquals(user, actualUser);
        }
    }

    /**
     * Test of getFiltersByUserAndTable method, of class SysFilterManipulator.
     * Fails if result contains wrong table
     */
    @Test
    public void testGetFiltersByUserAndTable_isTableCorrect() {
        System.out.println("getFiltersByUserAndTable");
        String tableName = "activities";
        SysUser user = sysUserManipulator.getAllUsers().get(0);

        List<SysFilter> result = sysFilterManipulator.getFiltersByUserAndTable(user, tableName);
        String actualTable = result.get(0).getTableName();

        if (!result.isEmpty()) {
            assertEquals(tableName, actualTable);
        }
    }
}

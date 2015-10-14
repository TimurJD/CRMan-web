package ua.com.vhsoft.crman.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Setting for all tests that are running in Spring context
 * 
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_CLASS)
@ContextConfiguration(classes = {ConfigTest.class},  loader = AnnotationConfigWebContextLoader.class)
public class AbstractSpringContextTest {
    
    /**
     * We need this method to avoid java.lang.Exception: No runnable methods
     */
    @Test
    public void test() {
        
    }
    
}

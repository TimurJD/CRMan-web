package ua.com.vhsoft.crman.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 * @author VH
 */
public class CRManWebAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(CRManMVCConfig.class, CRManJPAConfig.class, CRManSecurityConfig.class);
        ctx.setServletContext(servletContext);
        
        servletContext.addListener(new ContextLoaderListener(ctx));
        
        Dynamic registration = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }
    
    
}
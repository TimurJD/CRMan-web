package ua.com.vhsoft.crman.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Configuration
@EnableWebSecurity
public class CRManSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        System.out.println("SECURITY AUTH");
        auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery("select sys_users.login, password_hash, enabled from sys_users where sys_users.login=?")
                .authoritiesByUsernameQuery("select u.login, x.role_name from sys_users as u inner join\n"
                        + "(select p.user_id, r.role_name from sys_permissions as p inner join\n"
                        + "sys_roles as r on r.role_id = p.role_id) as x\n"
                        + "on x.user_id = u.user_id where login=?;");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        System.out.println("SECURITY CHECK");
        http.authorizeRequests().antMatchers("/activities**").hasAnyRole("ADMIN", "USER")
                .antMatchers("/login**").permitAll()
                .and().formLogin()
                .usernameParameter("username")
                .passwordParameter("password")
                .loginPage("/login")
                .failureUrl("/login?error")
                .and().logout().logoutSuccessUrl("/login?logout")
                .and().exceptionHandling().accessDeniedPage("/error403")
                .and().csrf();

    }

}

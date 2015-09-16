package ua.com.vhsoft.crman.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import ua.com.vhsoft.crman.tools.Cryptographer;

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

        auth.jdbcAuthentication().dataSource(dataSource)
                .passwordEncoder(passwordEncoder())
                .usersByUsernameQuery("select sys_users.login, "
                        + "sys_users.password_hash, sys_users.enabled from sys_users where sys_users.login=?")
                .authoritiesByUsernameQuery("select u.login, x.role_name from sys_users as u inner join\n"
                        + "(select p.user_id, r.role_name from sys_permissions as p inner join\n"
                        + "sys_roles as r on r.role_id = p.role_id) as x\n"
                        + "on x.user_id = u.user_id where login=?;");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        System.out.println("SECURITY CHECK");
        http.authorizeRequests().antMatchers("/activities**").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/register**").permitAll()
                .and().formLogin().defaultSuccessUrl("/index")
                .usernameParameter("j_username")
                .passwordParameter("j_password")
                .and().exceptionHandling().accessDeniedPage("/error403");

    }
    
    @Bean
    public PasswordEncoder passwordEncoder() {
        PasswordEncoder encoder = new Cryptographer();
        return encoder;
    }

}

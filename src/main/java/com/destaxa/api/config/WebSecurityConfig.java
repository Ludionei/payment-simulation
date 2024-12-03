package com.destaxa.api.config;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@Configuration
//@EnableWebSecurity
public class WebSecurityConfig /**extends WebSecurityConfigurerAdapter*/ {

    /*@Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/swagger-ui.html", "/v2/api-docs", "/swagger-resources/**", "/webjars/**").permitAll() // Permite acesso ao Swagger sem autenticação
                .anyRequest().authenticated() // Exige autenticação para outras rotas
                .and()
                .formLogin().permitAll() // Permite o acesso sem autenticação a qualquer página de login
                .and()
                .httpBasic().disable(); // Desativa o HTTP Basic Authentication
    }*/
}

package com.fsdp0.ldapsample.ldap.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.LdapContextSource;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class LdapConfig {

    @Value("${ldap.url}")
    private String url;

    @Value("${ldap.base}")
    private String base;

    @Value("${ldap.username}")
    private String username;

    @Value("${ldap.password}")
    private String password;

    @Bean
    public LdapContextSource ldapContextSource() {
        LdapContextSource contextSource = new LdapContextSource();

        contextSource.setUrl(url);
        contextSource.setBase(base);
        contextSource.setUserDn(username);
        contextSource.setPassword(password);

        return contextSource;
    }

    @Bean
    public LdapTemplate ldapTemplate() {
        return new LdapTemplate(ldapContextSource());
    }


}

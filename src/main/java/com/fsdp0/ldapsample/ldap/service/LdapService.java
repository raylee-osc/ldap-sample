package com.fsdp0.ldapsample.ldap.service;

import org.springframework.ldap.core.AttributesMapper;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.query.LdapQuery;
import org.springframework.ldap.query.LdapQueryBuilder;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class LdapService {
    private final LdapTemplate ldapTemplate;

    public Object find(String email) {
        log.info("테스트");

        LdapQuery query = LdapQueryBuilder.query().where("mail").is("ray.lee@osckorea.com");
        
        Object data = ldapTemplate.search(query, (AttributesMapper<Object>) attrs -> (Object) attrs.getAll());

        return data;
    }
}
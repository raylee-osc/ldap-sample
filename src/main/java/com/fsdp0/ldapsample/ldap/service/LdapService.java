package com.fsdp0.ldapsample.ldap.service;

import org.springframework.ldap.core.AttributesMapper;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class LdapService {
    private final LdapTemplate ldapTemplate;

    public Object find() {
        log.info("테스트");

        ldapTemplate.search("ou=people","uid=Ray", (AttributesMapper<String>) attrs -> (String) attrs.get("cn").get());

        return null;

    }
}
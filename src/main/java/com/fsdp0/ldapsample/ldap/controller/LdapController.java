package com.fsdp0.ldapsample.ldap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.fsdp0.ldapsample.ldap.service.LdapService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class LdapController {
    private final LdapService ldapService;

    @GetMapping("test/{email}")
    public Object test(@PathVariable("email") String email) {
        return this.ldapService.find(email);
    }
}

package com.fsdp0.ldapsample.ldap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fsdp0.ldapsample.ldap.service.LdapService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class LdapController {
    private final LdapService ldapService;

    @GetMapping("test")
    public Object test() {
        return this.ldapService.find();
    }
}

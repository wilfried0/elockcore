package com.assam.elockcore.service.proxy;

import com.assam.elockcore.service.dto.UserDto;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "msuaa", url = "localhost:3333")
public interface UserProxy {

    @GetMapping(value = "/api/users/{id}")
    UserDto getUserById(@PathVariable("id") long id);
}

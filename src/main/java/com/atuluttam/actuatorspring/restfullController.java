package com.atuluttam.actuatorspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class restfullController {
    @Autowired
    UserEntity ue;

    @GetMapping("/data")
    public UserEntity getUe() {
        return ue;
    }
}

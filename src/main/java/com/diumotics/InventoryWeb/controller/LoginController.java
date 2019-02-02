package com.diumotics.InventoryWeb.controller;

import com.diumotics.InventoryWeb.dto.UserDTO;
import com.diumotics.InventoryWeb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping(value="api/v1/login", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean canAuthenticate(@RequestBody UserDTO userDTO){
        System.out.println("login cus controller");
        return userService.canAuthenticate(userDTO.getUserName(), userDTO.getPassword());
    }

}

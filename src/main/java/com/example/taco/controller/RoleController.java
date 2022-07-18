package com.example.taco.controller;

import com.example.taco.dao.RoleDao;
import com.example.taco.model.Role;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/role")
@Validated
public class RoleController {
    private final RoleDao roleDao;

    @Autowired
    public RoleController(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public Role readByID(@PathVariable("id") @Min(1) Long id) {
        return roleDao.findById(id).get();
    }

}

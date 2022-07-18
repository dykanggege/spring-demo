package com.example.taco.dao;

import com.example.taco.model.Role;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RoleDao extends PagingAndSortingRepository<Role, Long> {
}

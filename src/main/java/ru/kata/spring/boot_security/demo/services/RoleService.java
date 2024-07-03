package ru.kata.spring.boot_security.demo.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.repositories.RoleRepository;

import java.util.List;


@Service
@Transactional(readOnly = true)
public class RoleService {

    private final RoleRepository roleRepository;
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }


    public Role getRoleById(long id) {
        return roleRepository.getById(id);
    }

    public RoleRepository getRepositories() {
        return roleRepository;
    }

}

package com.duong.jwtbackecnd.service.roles;

import com.duong.jwtbackecnd.entity.AppRole;
import com.duong.jwtbackecnd.entity.ERole;
import com.duong.jwtbackecnd.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class RoleService implements IRoleService{
    @Autowired
    private IRoleRepository roleRepository;
    @Override
    public Iterable<AppRole> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Optional<AppRole> findById(Long id) {
        return roleRepository.findById(id);
    }

    @Override
    public AppRole save(AppRole appRole) {
        return roleRepository.save(appRole);
    }

    @Override
    public void remove(Long id) {
        roleRepository.deleteById(id);
    }

    @Override
    public Optional<AppRole> findByName(ERole name) {
        return roleRepository.findByName(name);
    }
}

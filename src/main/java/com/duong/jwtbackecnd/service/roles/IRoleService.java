package com.duong.jwtbackecnd.service.roles;

import com.duong.jwtbackecnd.entity.AppRole;
import com.duong.jwtbackecnd.entity.ERole;
import com.duong.jwtbackecnd.service.IGeneralService;

import java.util.Optional;

public interface IRoleService extends IGeneralService<AppRole> {
    Optional<AppRole> findByName(ERole name);
}

package com.duong.jwtbackecnd.service.users;

import com.duong.jwtbackecnd.entity.AppUser;
import com.duong.jwtbackecnd.service.IGeneralService;

import java.util.Optional;

public interface IUserService extends IGeneralService<AppUser> {
    Optional<AppUser> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}

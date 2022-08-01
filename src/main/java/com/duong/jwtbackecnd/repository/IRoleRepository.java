package com.duong.jwtbackecnd.repository;

import com.duong.jwtbackecnd.entity.AppRole;
import com.duong.jwtbackecnd.entity.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRoleRepository extends JpaRepository<AppRole, Long> {
    Optional<AppRole> findByName(ERole name);
}

package com.nbricks.controlcenter.repo;

import com.nbricks.controlcenter.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserInfo, String> {
}

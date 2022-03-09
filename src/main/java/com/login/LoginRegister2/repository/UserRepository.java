package com.login.LoginRegister2.repository;

import com.login.LoginRegister2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

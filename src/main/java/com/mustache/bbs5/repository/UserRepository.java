package com.mustache.bbs5.repository;

import com.mustache.bbs5.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
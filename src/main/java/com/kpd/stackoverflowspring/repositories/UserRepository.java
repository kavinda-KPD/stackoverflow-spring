package com.kpd.stackoverflowspring.repositories;

import com.kpd.stackoverflowspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}

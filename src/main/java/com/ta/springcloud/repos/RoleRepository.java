package com.ta.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ta.springcloud.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}

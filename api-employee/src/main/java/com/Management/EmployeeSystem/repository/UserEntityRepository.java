package com.Management.EmployeeSystem.repository;

import com.Management.EmployeeSystem.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findUserEntityByFirstName(String firstName);
    UserEntity findUserEntityByEmail(String email);
    UserEntity findUserEntityByCPF(String CPF);
}

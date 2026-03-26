package com.Management.EmployeeSystem.service;

import com.Management.EmployeeSystem.dto.UserEntityDTO;
import com.Management.EmployeeSystem.dto.UserEntityDTOCreate;
import com.Management.EmployeeSystem.models.UserEntity;

public interface UserEntityService {
    UserEntityDTO findUserEntityById(Long id);
    UserEntityDTO findUserEntityByFirstName(String firstName);
    UserEntityDTO findUserEntityByCPF(String cpf);
    UserEntityDTO findUserEntityByEmail(String email);

    UserEntityDTO saveUserEntity(UserEntityDTOCreate userEntityDTOCreate);
    UserEntityDTO updateUserEntity(Long id, UserEntityDTOCreate userEntityDTOCreate);

    void deleteUserEntity(Long id);
}

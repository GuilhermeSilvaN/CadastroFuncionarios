package com.Management.EmployeeSystem.service.impl;

import com.Management.EmployeeSystem.dto.UserEntityDTO;
import com.Management.EmployeeSystem.dto.UserEntityDTOCreate;
import com.Management.EmployeeSystem.mapper.UserEntityMapper;
import com.Management.EmployeeSystem.models.UserEntity;
import com.Management.EmployeeSystem.repository.UserEntityRepository;
import com.Management.EmployeeSystem.service.UserEntityService;
import com.Management.EmployeeSystem.service.exception.UserNotFound;
import org.springframework.stereotype.Service;

@Service
public class UserEntityServiceImpl implements UserEntityService {

    private UserEntityRepository userEntityRepository;

    public UserEntityServiceImpl(UserEntityRepository userEntityRepository) {
        this.userEntityRepository = userEntityRepository;
    }

    @Override
    public UserEntityDTO findUserEntityById(Long id) {
        UserEntity userEntity = userEntityRepository.findById(id)
                .orElseThrow(() -> new UserNotFound("User not found"));

        return UserEntityMapper.userEntityToUserEntityDTO(userEntity);
    }

    @Override
    public UserEntityDTO findUserEntityByFirstName(String firstName) {
        UserEntity userEntity = userEntityRepository.findUserEntityByUsername(firstName);

        return UserEntityMapper.userEntityToUserEntityDTO(userEntity);
    }

    @Override
    public UserEntityDTO findUserEntityByCPF(String cpf) {
        UserEntity userEntity = userEntityRepository.findUserEntityByCPF(cpf);

        return UserEntityMapper.userEntityToUserEntityDTO(userEntity);
    }

    @Override
    public UserEntityDTO findUserEntityByEmail(String email) {
        UserEntity userEntity = userEntityRepository.findUserEntityByEmail(email);

        return UserEntityMapper.userEntityToUserEntityDTO(userEntity);
    }

    @Override
    public UserEntityDTO saveUserEntity(UserEntityDTOCreate userEntityDTOCreate) {
        UserEntity userEntitySaved = UserEntityMapper.userEntityDTOCreateToUserEntity(userEntityDTOCreate);
        userEntityRepository.save(userEntitySaved);

        return UserEntityMapper.userEntityToUserEntityDTO(userEntitySaved);
    }

    @Override
    public UserEntityDTO updateUserEntity(Long id, UserEntityDTOCreate userEntityDTOCreate) {
        UserEntity user = userEntityRepository.findById(id)
                .orElseThrow(() -> new UserNotFound("User not found"));

        UserEntityMapper.userUpdateFromDTOCreate(user, userEntityDTOCreate);
        userEntityRepository.save(user);

        return UserEntityMapper.userEntityToUserEntityDTO(user);
    }

    @Override
    public void deleteUserEntity(Long id) {
        UserEntity user = userEntityRepository.findById(id)
                .orElseThrow(() -> new UserNotFound("User not found"));

        userEntityRepository.delete(user);
    }
}

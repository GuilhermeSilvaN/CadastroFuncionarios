package com.Management.EmployeeSystem.dto;

import com.Management.EmployeeSystem.mapper.UserEntityMapper;
import com.Management.EmployeeSystem.models.UserEntity;

public record UserEntityDTO(
        Long id,
        String firstName,
        String lastName,
        String birthday,
        String email,
        String cpf
) {
    public UserEntityDTO(
            Long id,
            String firstName,
            String lastName,
            String birthday,
            String email,
            String cpf
    ){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.email = email;
        this.cpf = cpf;
    }

    public UserEntityDTO(UserEntity userEntity){
        this(
                userEntity.getId(),
                userEntity.getFirstName(),
                userEntity.getLastName(),
                UserEntityMapper.DateToString(userEntity.getBirthDay()),
                userEntity.getEmail(),
                userEntity.getCpf()
        );
    }

}

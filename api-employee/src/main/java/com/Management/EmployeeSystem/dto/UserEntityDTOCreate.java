package com.Management.EmployeeSystem.dto;

import com.Management.EmployeeSystem.mapper.UserEntityMapper;
import com.Management.EmployeeSystem.models.UserEntity;

public record UserEntityDTOCreate(
        String firstName,
        String lastName,
        String birthday,
        String email,
        String cpf
) {
    public UserEntityDTOCreate(
            String firstName,
            String lastName,
            String birthday,
            String email,
            String cpf
    ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.email = email;
        this.cpf = cpf;
    }

    public UserEntityDTOCreate(UserEntity userEntity){
        this(
                userEntity.getFirstName(),
                userEntity.getLastName(),
                UserEntityMapper.DateToString(userEntity.getBirthDay()),
                userEntity.getEmail(),
                userEntity.getCpf()
        );
    }

}

package com.Management.EmployeeSystem.dto;

import com.Management.EmployeeSystem.mapper.UserEntityMapper;
import com.Management.EmployeeSystem.models.UserEntity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

public record UserEntityDTOCreate(
        @NotBlank(message="first name is required")
        String firstName,
        @NotBlank(message="last name is required")
        String lastName,
        @NotBlank(message="birthday is required")
        String birthday,
        @Email(message="Invalid email")
        String email,
        @NotBlank(message="cpf is required")
        String CPF
) {
    public UserEntityDTOCreate(
            String firstName,
            String lastName,
            String birthday,
            String email,
            String CPF
    ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.email = email;
        this.CPF = CPF;
    }

    public UserEntityDTOCreate(UserEntity userEntity){
        this(
                userEntity.getFirstName(),
                userEntity.getLastName(),
                UserEntityMapper.DateToString(userEntity.getBirthDay()),
                userEntity.getEmail(),
                userEntity.getCPF()
        );
    }

}

package com.Management.EmployeeSystem.mapper;

import com.Management.EmployeeSystem.dto.UserEntityDTO;
import com.Management.EmployeeSystem.dto.UserEntityDTOCreate;
import com.Management.EmployeeSystem.models.UserEntity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UserEntityMapper {
    public static UserEntityDTO userEntityToUserEntityDTO(UserEntity userEntity) {
        return new UserEntityDTO(
                userEntity.getId(),
                userEntity.getFirstName(),
                userEntity.getLastName(),
                DateToString(userEntity.getBirthDay()),
                userEntity.getEmail(),
                userEntity.getCPF()
        );
    }

    public static UserEntityDTOCreate userEntityToUserEntityDTOCreate(UserEntity userEntity) {
        return new UserEntityDTOCreate(
                userEntity.getFirstName(),
                userEntity.getLastName(),
                DateToString(userEntity.getBirthDay()),
                userEntity.getEmail(),
                userEntity.getCPF()
        );
    }

    public static UserEntity userEntityDTOCreateToUserEntity(UserEntityDTOCreate userEntityDTOCreate) {
        return new UserEntity(
                userEntityDTOCreate.firstName(),
                userEntityDTOCreate.lastName(),
                StringToDate(userEntityDTOCreate.birthday()),
                userEntityDTOCreate.email(),
                userEntityDTOCreate.CPF()
        );
    }

    public static void userUpdateFromDTOCreate(UserEntity userEntity, UserEntityDTOCreate userEntityDTOCreate) {
        userEntity.setFirstName(userEntityDTOCreate.firstName());
        userEntity.setLastName(userEntityDTOCreate.lastName());
        userEntity.setEmail(userEntityDTOCreate.email());
        userEntity.setCPF(userEntityDTOCreate.CPF());
    }

    public static LocalDate StringToDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return LocalDate.parse(date, formatter);
    }

    public static String DateToString(LocalDate date){
        String data = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return data;
    }

}

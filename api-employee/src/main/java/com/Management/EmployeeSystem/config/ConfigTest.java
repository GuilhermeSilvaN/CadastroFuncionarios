package com.Management.EmployeeSystem.config;

import com.Management.EmployeeSystem.dto.UserEntityDTOCreate;
import com.Management.EmployeeSystem.mapper.UserEntityMapper;
import com.Management.EmployeeSystem.models.UserEntity;
import com.Management.EmployeeSystem.repository.UserEntityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class ConfigTest implements CommandLineRunner {
    private UserEntityRepository userEntityRepository;

    public ConfigTest(UserEntityRepository userEntityRepository) {
        this.userEntityRepository = userEntityRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        UserEntityDTOCreate userEntityDTOCreate = new UserEntityDTOCreate(
                "Ana",
                "Lima Pinheiro",
                "12/02/2004",
                "analima@gmail.com",
                "09534512311"
        );

        UserEntity userEntity = UserEntityMapper.userEntityDTOCreateToUserEntity(userEntityDTOCreate);
        userEntityRepository.save(userEntity);

    }
}

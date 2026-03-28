package com.Management.EmployeeSystem.controller;

import com.Management.EmployeeSystem.dto.UserEntityDTO;
import com.Management.EmployeeSystem.dto.UserEntityDTOCreate;
import com.Management.EmployeeSystem.service.UserEntityService;
import com.Management.EmployeeSystem.service.impl.UserEntityServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserEntityController {

    private UserEntityServiceImpl userEntityServiceImpl;

    public UserEntityController(UserEntityServiceImpl userEntityServiceImpl) {
        this.userEntityServiceImpl = userEntityServiceImpl;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserEntityDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(userEntityServiceImpl.findUserEntityById(id));
    }

    @GetMapping
    public ResponseEntity<List<UserEntityDTO>> findAll() {
        return ResponseEntity.ok().body(userEntityServiceImpl.findAll());
    }

    @PostMapping
    public ResponseEntity<UserEntityDTO> create(@RequestBody @Validated UserEntityDTOCreate userEntityDTOCreate) {
        UserEntityDTO userDTO = userEntityServiceImpl.saveUserEntity(userEntityDTOCreate);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(userDTO.id()).toUri();

        return ResponseEntity.created(uri).body(userDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserEntityDTO> update (@PathVariable Long id, @RequestBody @Validated UserEntityDTOCreate userEntityDTOCreate){
        UserEntityDTO userDTO = userEntityServiceImpl.updateUserEntity(id, userEntityDTOCreate);
        return ResponseEntity.ok().body(userDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        userEntityServiceImpl.deleteUserEntity(id);
        return ResponseEntity.noContent().build();
    }


}

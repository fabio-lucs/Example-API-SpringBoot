package br.com.apiexample.demo.controller;


import br.com.apiexample.demo.model.User;
import br.com.apiexample.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/users")

public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }


    @GetMapping
    public ResponseEntity<List<User>> ListUsers(){
        return ResponseEntity.status(200).body(userService.listUsers());
    }

    @PostMapping()
    public ResponseEntity<User> createUser(@RequestBody User user){
        return ResponseEntity.status(201).body(userService.createUser(user));
    }

    @PutMapping
    public  ResponseEntity<User> editUser(@RequestBody User user){
        return ResponseEntity.status(200).body(userService.editUser(user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
        return ResponseEntity.status(204).build();
    }
}

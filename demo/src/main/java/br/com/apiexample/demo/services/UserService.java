package br.com.apiexample.demo.services;

import br.com.apiexample.demo.model.User;
import br.com.apiexample.demo.repository.IUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public UserService(IUser repository){
    this.repository = repository;
    }
    private IUser repository;

    public List<User> listUsers(){
        List<User> list = repository.findAll();
        return list;
    }

    public User createUser(User user){
        User newUser = repository.save(user);
        return newUser;
    }

    public User editUser(User user){
        User newUser = repository.save(user);
        return newUser;
    }

    public boolean deleteUser(Integer id){
        repository.deleteById(id);
        return true;
    }




}

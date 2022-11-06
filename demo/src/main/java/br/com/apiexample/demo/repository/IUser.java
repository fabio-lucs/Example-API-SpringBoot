package br.com.apiexample.demo.repository;

import br.com.apiexample.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IUser extends JpaRepository<User, Integer> {

}

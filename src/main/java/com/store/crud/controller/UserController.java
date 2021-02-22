package com.store.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.store.crud.service.UserService;
import com.store.crud.dto.UserDto;
import com.store.crud.model.User;
import java.util.List;


@RestController
public class UserController<user> {

	private UserService<User> userService;
	
	@Autowired
	public UserController(UserService<User> userService) {
		this.userService = userService;
	}
	
	//CREATE
    @PostMapping(value = "/users")
    public User create(@RequestBody UserDto userDto) {
        return userService.save(userDto);
    }
    
    //READONE
    @GetMapping(value="/users/{id}")
    public User read(@PathVariable(name="id") int id) {
    	User user = userService.read(id);
    	return user;
    }
    
    //READALL
    @GetMapping(value="/users")
    public List<User> read() {
    	List<User> users = userService.readAll();
        return users;
    }

	//UPDATE
    @PutMapping(value = "/users/{id}")
    public User update(@PathVariable(name = "id") int id, @RequestBody UserDto userDto) {
        return userService.update(id, userDto);
    }
    
    //DELETE
    @DeleteMapping(value = "/users/{id}")
    public void delete(@PathVariable(name = "id") int id) {
        userService.delete(id);
    }
	
}
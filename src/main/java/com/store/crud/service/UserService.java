package com.store.crud.service;

import com.store.crud.dto.UserDto;
import java.util.List;

public interface UserService<User> {
	
	User save(UserDto userDto);
	
	List<User> readAll();
	
	User read(int id);
	
	User update(int id, UserDto userDto);
	
	void delete(int id);

}
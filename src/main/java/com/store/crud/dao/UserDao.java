package com.store.crud.dao;
import org.springframework.data.repository.CrudRepository;

import com.store.crud.model.User;

public interface UserDao extends CrudRepository<User, Integer>{
	
}
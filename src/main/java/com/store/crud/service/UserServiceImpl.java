package com.store.crud.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.store.crud.dao.UserDao;
import com.store.crud.dto.UserDto;
import com.store.crud.model.User;
import java.util.List;

@Service
public class UserServiceImpl implements UserService<User>{

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

	@Override
	public User save(UserDto userDto) {
		User user = new User();
		user.setFirstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		user.setLogin(userDto.getLogin());
		user.setPassword(userDto.getPassword());
		return userDao.save(user);
	}

	@Override
	public List<User> readAll() {
		 return (List<User>) userDao.findAll();
	}
	
	@Override
	public User read(int id) {
		return userDao.findById(id).get();
	}
	
	@Override
	public User update(int id, UserDto userDto) {
//		if(!userDao.exist(id)) {
//			throw new UserNotFoundException(id);
//		}
		User user = new User();
		user.setId(id);
		user.setFirstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		user.setLogin(userDto.getLogin());
		user.setPassword(userDto.getPassword());
		return userDao.save(user);
	}
	
	@Override
	public void delete(int id) {
		userDao.deleteById(id);
	}

}
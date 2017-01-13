package cn.itcast.service.impl;

import java.util.List;

import cn.itcast.dao.UserDao;
import cn.itcast.model.User;
import cn.itcast.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		this.userDao.save(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		this.userDao.update(user);
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		this.userDao.delete(user);
	}

	@Override
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		return this.userDao.findById(id);
	}

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return this.userDao.findAll();
	}

}

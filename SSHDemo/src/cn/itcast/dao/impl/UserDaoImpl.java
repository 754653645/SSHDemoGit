package cn.itcast.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import cn.itcast.dao.UserDao;
import cn.itcast.model.User;

public class UserDaoImpl implements UserDao {
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.delete(user);
	}

	@Override
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.get(User.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from User");
	}

}

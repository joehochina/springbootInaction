package readinglist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import readinglist.domain.User;
import readinglist.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userMapper.findAll();
	}

}

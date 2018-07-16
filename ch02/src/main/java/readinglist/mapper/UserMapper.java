package readinglist.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import readinglist.domain.User;

@Mapper
public interface UserMapper {
	
	public List<User> findAll();

}

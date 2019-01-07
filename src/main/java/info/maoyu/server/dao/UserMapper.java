package info.maoyu.server.dao;

import info.maoyu.server.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Service
public interface UserMapper {
    List<User> findAll();
}

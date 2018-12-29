package info.maoyu.server.mapper;

import org.apache.ibatis.annotations.Mapper;

import info.maoyu.server.model.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

@Mapper
@Service
public interface UserMapper {
    @Select("select * from user where id=#{id}")
    User selectById(int id);

    @Update("update user set password = #{password}")
    void updatePassword(String password);
}

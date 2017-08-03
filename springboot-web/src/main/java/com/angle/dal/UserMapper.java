package com.angle.dal;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.angle.dal.domain.User;

//@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user")
     @Results({ @Result(property = "id", column = "id", javaType = Integer.class),
     @Result(property = "userName", column = "user_name") ,@Result(property="age",column="age",javaType = Integer.class),
               @Result(property = "createTime", column = "create_time", javaType = Date.class)})
    List<User> listAll();

    // int deleteByPrimaryKey(Integer id);
    //
    // int insert(User record);
    //
    // int insertSelective(User record);
    //
    // User selectByPrimaryKey(Integer id);
    //
    // int updateByPrimaryKeySelective(User record);
    //
    // int updateByPrimaryKey(User record);
}

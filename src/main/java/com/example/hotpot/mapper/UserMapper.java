package com.example.hotpot.mapper;

import com.example.hotpot.bean.User;
import com.example.hotpot.comment.MyBaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper extends MyBaseMapper<User> {

    @Select("SELECT * FROM user where id = ${id}")
    User get(@Param("id") long id);
}

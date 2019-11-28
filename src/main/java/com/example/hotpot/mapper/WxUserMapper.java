package com.example.hotpot.mapper;

import com.example.hotpot.bean.User;
import com.example.hotpot.comment.MyBaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface WxUserMapper extends MyBaseMapper<User> {

    @Update("UPDATE user SET status=#{status} WHERE open_id = #{openId}")
    void updateStateByOpenID(@Param("openId") String openId, @Param("status")int status);

    @Select("SELECT * FROM user WHERE open_id = #{openId}")
    User selectUserByOpenId(@Param("openId") String openId);
}

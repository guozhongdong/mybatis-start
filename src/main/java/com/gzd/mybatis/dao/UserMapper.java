package com.gzd.mybatis.dao;

import com.gzd.mybatis.models.User;
import org.apache.ibatis.annotations.Select;

/**
 * @author gzd
 * @create 2018-06-29 16:50
 * @desc
 **/
public interface UserMapper {

    @Select("select * from user where id =#{id} ")
    User getUserByID(Integer id);
}

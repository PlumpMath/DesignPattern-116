package com.business.mapper;

import org.apache.ibatis.annotations.Param;

import com.business.bean.User;

public interface UserMapper {

    public User getUserByUserId(@Param(value = "userId") int userId);
}

package com.phudt.dao;

import com.phudt.entity.User;
import com.phudt.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;


public interface UserInfoDAO{
    public UserInfo findUserInfo(String username);

    public List<String> getUserRoles(String username);
}

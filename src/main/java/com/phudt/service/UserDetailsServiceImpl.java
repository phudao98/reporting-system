package com.phudt.service;

import com.phudt.dao.UserDAO;
import com.phudt.dto.UserDetailsDTO;
import com.phudt.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;


public class UserDetailsServiceImpl implements UserDetailsService {
    private static final Logger log = LoggerFactory.getLogger(UserDetailsServiceImpl.class);
    private UserDAO userDAO;

    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDAO.findById(username).get();

        if(user==null){
            throw new UsernameNotFoundException("User not found.");
        }
        log.info("loadUserByUsername() :" + username);

        return new UserDetailsDTO(user);
    }
}

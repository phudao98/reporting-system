package com.phudt.dao.impl;

import com.phudt.dao.UserInfoDAO;
import com.phudt.entity.User;
import com.phudt.entity.UserRole;
import com.phudt.model.UserInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Transactional
@Repository
public class UserInfoDAOImpl implements UserInfoDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public UserInfoDAOImpl() {
    }

    @Override
    public UserInfo findUserInfo(String username) {
        String sql = "Select new " + UserInfo.class.getName() + "(u.username,u.password) "//
                + " from " + User.class.getName() + " u where u.username = :username ";

        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery(sql);
        query.setParameter("username", username);

        return (UserInfo) query.uniqueResult();
    }

    @Override
    public List<String> getUserRoles(String username) {
        String sql = "Select r.userRole "//
                + " from " + UserRole.class.getName() + " r where r.user.username = :username ";

        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery(sql);
        query.setParameter("username", username);

        List<String> roles = query.list();

        return roles;
    }
}

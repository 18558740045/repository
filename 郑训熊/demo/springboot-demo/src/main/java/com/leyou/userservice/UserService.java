package com.leyou.userservice;

import com.leyou.pojo.User;
import com.leyou.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
    public class UserService {
        @Autowired
        private UserMapper userMapper;

        public User queryById(Long Id){
            return this.userMapper.selectByPrimaryKey(Id);
        }


    }



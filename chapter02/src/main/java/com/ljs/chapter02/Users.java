package com.ljs.chapter02;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author ljs
 * @Description TODO
 * @Date 2019/3/26 17:58
 **/
@Component
@ConfigurationProperties(prefix = "my")
public class Users {
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "Users{" +
                "users=" + users +
                '}';
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}

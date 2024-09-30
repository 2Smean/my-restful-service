package org.hi.myrestfulservice.dao;

import org.hi.myrestfulservice.bean.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int usersCount = 3;

    static {
        users.add(new User(1, "java", new Date()));
        users.add(new User(2, "kotlin", new Date()));
        users.add(new User(3, "study", new Date()));
    }

    // 전체 users 에서 가져오는 findAll method 생성
    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        // id 값은 자동 생성
        if (user.getId() == null) {
            user.setId(++usersCount);
        }
        // 날짜가 채워져 있지 않다면 Date 값을 기본 데이터 값으로 채워줌
        if (user.getJoinDate() == null) {
            user.setJoinDate(new Date());
        }

        users.add(user);

        return user;
    }

    public User findOne(int id) {
        // 아래의 for 문은 데이터가 많으면 속도가 떨어진다
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User deleteById(int id) {
        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext()) {
            User user = iterator.next();

            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }

        return null;
    }
}

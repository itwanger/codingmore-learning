package com.example.codingmorejpa.service;

import com.example.codingmorejpa.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 微信搜索「沉默王二」，回复 Java
 *
 * @author 沉默王二
 * @date 5/6/22
 */
public interface UserService {
    User findById(Integer id);
    List<User> findAll();
    User save(User user);
    void delete(Integer id);

    Page<User> findAll(Pageable pageable);

    List<User> findByNameLike(String name);
}

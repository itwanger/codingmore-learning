package com.example.codingmorejpa.repository;

import com.example.codingmorejpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("select u from User u where u.name like concat('%',?1,'%')")
    List<User> findByNameLike(String name);

    @Query(value = "SELECT * FROM user u WHERE u.name like '%'|| ?1 || '%'",
            nativeQuery = true)
    List<User> findByNameLikeNativeQuery(String name);

    @Query("select u from User u where u.name like concat('%',:name,'%')")
    List<User> findByNameLikeParam(@Param("name")String name);

}
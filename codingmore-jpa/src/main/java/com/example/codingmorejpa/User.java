package com.example.codingmorejpa;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 微信搜索「沉默王二」，回复 Java
 *
 * @author 沉默王二
 * @date 5/6/22
 */
@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    private Integer id;
    private Integer age;
    private String name;
    private String password;
}

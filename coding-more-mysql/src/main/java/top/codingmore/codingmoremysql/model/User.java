package top.codingmore.codingmoremysql.model;

import lombok.Data;

/**
 * 微信搜索「沉默王二」，回复 Java
 *
 * @author 沉默王二
 * @date 5/2/22
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String password;
    private Integer age;
}

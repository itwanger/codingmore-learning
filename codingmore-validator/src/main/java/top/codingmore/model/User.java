package top.codingmore.model;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

/**
 * 和数据库对应的
 */
@Data
@Builder
public class User {
    private Integer id;
    private Integer age;
    private String name;
    private String password;

    @Tolerate
    User() {}
}

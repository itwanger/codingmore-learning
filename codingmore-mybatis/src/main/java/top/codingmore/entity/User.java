package top.codingmore.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Tolerate;

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

package top.codingmore.entity;

import java.util.Date;

import java.util.Map;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Tolerate;

@Data
@Builder
public class Posts {
    private Long postsId;

    private Long postAuthor;

    private String postContent;

    private String postTitle;

    @Tolerate
    Posts() {}
}

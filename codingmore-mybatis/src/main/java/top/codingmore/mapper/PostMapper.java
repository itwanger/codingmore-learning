package top.codingmore.mapper;

import top.codingmore.entity.Posts;
import top.codingmore.entity.User;

import java.util.List;

public interface PostMapper {
    List<Posts> getAll();
    Posts getOne(Long id);
    void insert(Posts post);
    void update(Posts post);
    void delete(Long id);
}

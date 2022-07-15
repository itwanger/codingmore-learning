package top.codingmore.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import top.codingmore.model.User;

import java.util.List;

/**
 * BaseMapper 是 MyBatis-plus 的，也就继承了基本的 CRUD
 */
public interface UserMapper extends BaseMapper<User> {
    @Select("SELECT * FROM user")
    List<User> getAll();
}

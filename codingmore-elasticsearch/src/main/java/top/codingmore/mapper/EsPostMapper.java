package top.codingmore.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import top.codingmore.model.EsPosts;

import java.util.List;

public interface EsPostMapper extends BaseMapper<EsPosts> {
    @Select("SELECT * FROM posts")
    List<EsPosts> getAll();
}

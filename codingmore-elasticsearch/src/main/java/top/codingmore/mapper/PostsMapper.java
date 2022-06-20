package top.codingmore.mapper;

/**
 * 微信搜索「沉默王二」，回复 Java
 *
 * @author 沉默王二
 * @date 6/20/22
 */

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Param;
import top.codingmore.dto.PostsPageQueryParam;
import top.codingmore.model.Posts;
import top.codingmore.vo.PostsVo;

public interface PostsMapper extends BaseMapper<Posts> {
    IPage<PostsVo> findByPage(IPage<PostsVo> page, @Param(Constants.WRAPPER) Wrapper<PostsPageQueryParam> wrapper);
}

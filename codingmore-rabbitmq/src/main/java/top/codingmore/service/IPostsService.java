package top.codingmore.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import top.codingmore.dto.PostsPageQueryParam;
import top.codingmore.model.Posts;
import top.codingmore.vo.PostsVo;

/**
 * 微信搜索「沉默王二」，回复 Java
 *
 * @author 沉默王二
 * @date 6/20/22
 */
public interface IPostsService extends IService<Posts> {
    IPage<PostsVo> findByPage(PostsPageQueryParam postsPageQueryParam);
}

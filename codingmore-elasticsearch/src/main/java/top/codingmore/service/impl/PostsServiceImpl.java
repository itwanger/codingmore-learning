package top.codingmore.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import top.codingmore.dto.PostsPageQueryParam;
import top.codingmore.mapper.PostsMapper;
import top.codingmore.model.Posts;
import top.codingmore.service.IPostsService;
import top.codingmore.vo.PostsVo;

/**
 * 微信搜索「沉默王二」，回复 Java
 *
 * @author 沉默王二
 * @date 6/20/22
 */
@Service
public class PostsServiceImpl extends ServiceImpl<PostsMapper, Posts> implements IPostsService {
    @Override
    public IPage<PostsVo> findByPage(PostsPageQueryParam postsPageQueryParam) {
        QueryWrapper<PostsPageQueryParam> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotEmpty(postsPageQueryParam.getPostTitleKeyword())) {
            queryWrapper.like("post_title", "%" + postsPageQueryParam.getPostTitleKeyword() + "%");
        }

        Page<PostsVo> postsPage = new Page<>(postsPageQueryParam.getPage(), postsPageQueryParam.getPageSize());

        return this.getBaseMapper().findByPage(postsPage, queryWrapper);
    }
}

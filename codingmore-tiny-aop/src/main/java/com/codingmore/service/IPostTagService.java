package com.codingmore.service;

import com.codingmore.dto.PostTagParam;
import com.codingmore.model.PostTag;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 标签表 服务类
 * </p>
 *
 * @author 石磊
 * @since 2021-09-12
 */
public interface IPostTagService extends IService<PostTag> {

    boolean savePostTag(PostTagParam postTagParam);

    /**
     * 获取文章标签
     * @param postId
     * @return
     */
    List<PostTag> getByPostId(Long postId);
}

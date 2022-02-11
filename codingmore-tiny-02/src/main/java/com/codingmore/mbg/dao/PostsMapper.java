package com.codingmore.mbg.dao;

import com.codingmore.mbg.po.Posts;

public interface PostsMapper {
    int deleteByPrimaryKey(Long postsId);

    int insert(Posts record);

    int insertSelective(Posts record);

    Posts selectByPrimaryKey(Long postsId);

    int updateByPrimaryKeySelective(Posts record);

    int updateByPrimaryKeyWithBLOBs(Posts record);

    int updateByPrimaryKey(Posts record);
}
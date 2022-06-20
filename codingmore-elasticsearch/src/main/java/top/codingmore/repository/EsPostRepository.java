package top.codingmore.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import top.codingmore.model.EsPosts;

/**
 * 文章 ES 操作类
 */
public interface EsPostRepository extends ElasticsearchRepository<EsPosts, Long> {

    Page<EsPosts> findByPostTitle(String postTitle, Pageable pageable);
    Page<EsPosts> findByPostTitleOrPostContent(String postTitle,String postContent,Pageable pageable);
}

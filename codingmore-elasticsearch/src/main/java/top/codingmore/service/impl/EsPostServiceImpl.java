package top.codingmore.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import top.codingmore.mapper.EsPostMapper;
import top.codingmore.model.EsPosts;
import top.codingmore.repository.EsPostRepository;
import top.codingmore.service.IEsPostService;

import java.util.Iterator;
import java.util.List;

/**
 * 文章搜索的实现类
 */
@Service
@Slf4j
public class EsPostServiceImpl implements IEsPostService {
    @Autowired
    private EsPostRepository esPostRepository;

    @Autowired
    private EsPostMapper esPostMapper;

    @Override
    public int importAll() {
        log.info("导入所有文章到 ES");
        List<EsPosts> list = esPostMapper.getAll();
        esPostRepository.saveAll(list);
        return list.size();
    }

    @Override
    public void delete(Long id) {
        log.info("删除 id {}",id);
        esPostRepository.deleteById(id);
    }

    @Override
    public EsPosts create(Long id) {
        log.info("新增：{}", id);
        EsPosts post = esPostMapper.selectById(id);
        EsPosts result = esPostRepository.save(post);
        return result;
    }

    @Override
    public Page<EsPosts> search(String keyword, Integer pageNum, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNum, pageSize);
        return esPostRepository.findByPostTitle(keyword,pageable);
    }
}

package top.codingmore.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import top.codingmore.dto.PostsPageQueryParam;
import top.codingmore.service.IPostsService;
import top.codingmore.vo.PostsVo;
import top.codingmore.webapi.ResultObject;

import java.util.HashMap;
import java.util.Map;

/**
 * 微信搜索「沉默王二」，回复 Java
 *
 * @author 沉默王二
 * @date 6/20/22
 */
@Controller
@Api(tags = "文章 ")
@RequestMapping("/posts")
public class PostsController {
    @Autowired
    private IPostsService postsService;

    @RequestMapping(value = "/queryPageable", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation("分页查询")
    public ResultObject<Map<String, Object>> queryPageable(PostsPageQueryParam postsPageQueryParam) {
        Map<String, Object> map = new HashMap<>();
        IPage<PostsVo> postsIPage = postsService.findByPage(postsPageQueryParam);
        map.put("items", postsIPage.getRecords());
        map.put("total", postsIPage.getTotal());
        return ResultObject.success(map);
    }
}

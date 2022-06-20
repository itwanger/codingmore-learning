package top.codingmore.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.codingmore.dto.UserParam;
import top.codingmore.model.EsPosts;
import top.codingmore.service.impl.EsPostServiceImpl;
import top.codingmore.webapi.ResultObject;

/**
 * 搜索文章管理控制器
 */
@RestController
@Api(tags = "搜索文章 ES")
@RequestMapping("/esPost")
public class EsPostController {
    @Autowired
    private EsPostServiceImpl esPostService;

    @ApiOperation(value = "导入所有文章到 ES")
    @RequestMapping(value = "/importAll", method = RequestMethod.POST)
    public ResultObject importAll(@Validated UserParam userParam, BindingResult result) {
        int count = esPostService.importAll();
        return ResultObject.success(count);
    }

    @ApiOperation(value = "简单搜索")
    @RequestMapping(value = "/search/simple", method = RequestMethod.GET)
    public ResultObject<Page<EsPosts>> search(@RequestParam(required = false) String keyword,
                                              @RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                              @RequestParam(required = false, defaultValue = "5") Integer pageSize) {
        Page<EsPosts> page = esPostService.search(keyword,pageNum,pageSize);
        return ResultObject.success(page);
    }
}

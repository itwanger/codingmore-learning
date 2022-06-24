package top.codingmore.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.codingmore.model.MemberReadHistory;
import top.codingmore.service.IMemberReadHistoryService;
import top.codingmore.webapi.ResultObject;

import java.util.List;

@RestController
@Api(tags = "会员文章浏览记录")
@RequestMapping("/member/readHistory")
public class MemberReadHistoryController {
    @Autowired
    private IMemberReadHistoryService memberReadHistoryService;

    @ApiOperation("创建浏览记录")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResultObject create(@RequestBody MemberReadHistory memberReadHistory) {
        int count = memberReadHistoryService.create(memberReadHistory);
        if (count > 0) {
            return ResultObject.success(count);
        } else {
            return ResultObject.failed();
        }
    }

    @ApiOperation("删除浏览记录")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ResultObject delete(@RequestParam("ids") List<String> ids) {
        int count = memberReadHistoryService.delete(ids);
        if (count > 0) {
            return ResultObject.success(count);
        } else {
            return ResultObject.failed();
        }
    }

    @ApiOperation("展示浏览记录")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResultObject<List<MemberReadHistory>> list(Long memberId) {
        List<MemberReadHistory> memberReadHistoryList = memberReadHistoryService.list(memberId);
        return ResultObject.success(memberReadHistoryList);
    }

}

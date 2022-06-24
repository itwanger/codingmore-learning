package top.codingmore.controller;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.codingmore.dto.UserParam;
import top.codingmore.model.User;
import top.codingmore.service.IUserService;
import top.codingmore.webapi.Asserts;
import top.codingmore.webapi.BindingResultAspect;
import top.codingmore.webapi.ResultObject;

/**
 * 用户控制器
 * 从这个接口查询用户
 * @Api @ApiOperation 启用 Swagger 接口
 */
@RestController
@Api(tags = "用户")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    /**
     * 登录
     *
     * @param userParam 前端传递过来的参数
     * @param result 绑定结果的通用接口，
     *               配合 Hibernate Validator 来使用
     *               没有的话无法启用 {@link BindingResultAspect}
     * @return
     */
    @ApiOperation(value = "登录以后返回token")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultObject login(@Validated UserParam userParam, BindingResult result) {
        // MyBatis-Plus 查询
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("name", userParam.getName());
        User user = userService.getOne(wrapper);

        if (ObjectUtil.isEmpty(user)) {
            Asserts.fail("用户不存在");
        }
        return ResultObject.success("ok");
    }
}

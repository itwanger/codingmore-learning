package top.codingmore.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.codingmore.mapper.UserMapper;
import top.codingmore.model.User;
import top.codingmore.service.IUserService;

/**
 * ServiceImpl 是 MyBatis-Plus 的
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}

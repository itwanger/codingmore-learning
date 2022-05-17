package top.codingmore.mpg.service.impl;

import top.codingmore.mpg.entity.Role;
import top.codingmore.mpg.mapper.RoleMapper;
import top.codingmore.mpg.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户角色表 服务实现类
 * </p>
 *
 * @author 沉默王二
 * @since 2022-05-17
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}

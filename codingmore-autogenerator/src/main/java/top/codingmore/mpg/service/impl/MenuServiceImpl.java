package top.codingmore.mpg.service.impl;

import top.codingmore.mpg.entity.Menu;
import top.codingmore.mpg.mapper.MenuMapper;
import top.codingmore.mpg.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台菜单表 服务实现类
 * </p>
 *
 * @author 沉默王二
 * @since 2022-05-17
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}

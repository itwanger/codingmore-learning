package top.codingmore.codingmoretransactional.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.codingmore.codingmoretransactional.entity.User;
import top.codingmore.codingmoretransactional.repository.UserRepository;

import javax.annotation.Resource;
import java.util.List;

/**
 * 微信搜索「沉默王二」，回复 Java
 *
 * @author 沉默王二
 * @date 5/6/22
 */
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserRepository userRepository;

    @Override
    public User findById(Integer id) {
        return userRepository.getById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public List<User> findByNameLike(String name) {
//        return userRepository.findByNameLikeNativeQuery(name);
        return userRepository.findByNameLikeParam(name);
//        return userRepository.findByNameLike(name);
    }

    @Override
    public void update(User user) {
        userRepository.save(user);
        throw new RuntimeException("啊，出现妖怪了！");
    }
}

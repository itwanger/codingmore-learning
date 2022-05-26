package top.codingmore;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.codingmore.entity.PostTag;
import top.codingmore.entity.Posts;
import top.codingmore.entity.User;
import top.codingmore.mapper.PostMapper;
import top.codingmore.mapper.PostTagMapper;
import top.codingmore.mapper.UserMapper;

import java.util.List;

@SpringBootTest
@Slf4j
class CodingmoreMybatisApplicationTests {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private PostTagMapper postTagMapper;


	@Autowired
	private PostMapper postMapper;

	@Test
	void testInsert() {
		userMapper.insert(User.builder().age(18).name("沉默王二").password("123456").build());
		userMapper.insert(User.builder().age(18).name("沉默王三").password("123456").build());
		userMapper.insert(User.builder().age(18).name("沉默王四").password("123456").build());
		log.info("查询所有：{}",userMapper.getAll().stream().toArray());
	}

	@Test
	List<User> testQuery() {
		List<User> all = userMapper.getAll();
		log.info("查询所有：{}",all.stream().toArray());
		return all;
	}

	@Test
	void testUpdate() {
		User one = userMapper.getOne(1);
		log.info("更新前{}", one);
		one.setPassword("654321");
		userMapper.update(one);
		log.info("更新后{}", userMapper.getOne(1));
	}

	@Test
	void testDelete() {
		log.info("删除前{}", userMapper.getAll().toArray());
		userMapper.delete(1);
		log.info("删除后{}", userMapper.getAll().toArray());
	}

	@Test
	void testPostInsert() {
		postMapper.insert(Posts.builder()
				.postAuthor(1L)
				.postTitle("沉默王二")
				.postContent("123456")
				.build());
		log.info("查询所有：{}",postMapper.getAll().stream().toArray());
	}

	@Test
	List<Posts> testPostQuery() {
		List<Posts> all = postMapper.getAll();
		log.info("查询所有：{}",all.stream().toArray());
		return all;
	}

	@Test
	void testPostUpdate() {
		Posts one = postMapper.getOne(1L);
		log.info("更新前{}", one);
		one.setPostContent("沉默王二是沙比");
		postMapper.update(one);
		log.info("更新后{}", postMapper.getOne(1L));
	}

	@Test
	void testPostDelete() {
		log.info("删除前{}", postMapper.getAll().toArray());
		postMapper.delete(1L);
		log.info("删除后{}", postMapper.getAll().toArray());

	}

	@Test
	void testMybatisPlus() {
		List<PostTag> list = postTagMapper.selectList(null);
		list.forEach( e -> log.info("Mybatis-Plus 查询{}",e));
	}

}

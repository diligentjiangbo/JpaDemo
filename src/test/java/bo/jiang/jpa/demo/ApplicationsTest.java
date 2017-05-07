package bo.jiang.jpa.demo;

import bo.jiang.jpa.demo.entity.EnvironmentInfo;
import bo.jiang.jpa.demo.entity.User;
import bo.jiang.jpa.demo.repository.EnvironmentInfoRepository;
import bo.jiang.jpa.demo.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author shumpert.jiang
 * @date 2017/4/21 0021 16:07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationsTest {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private EnvironmentInfoRepository environmentInfoRepository;

  @Test
  public void testUser() {
    userRepository.save(new User("bbb", 10));
//    User user = userRepository.findUser("aaa");
//    System.out.println(user);
  }

  @Test
  public void testEnv() {
    EnvironmentInfo env = environmentInfoRepository.findByName("test_env");
    System.out.println(env);
//    EnvironmentInfo env = new EnvironmentInfo();
//    env.setName("hello");
//    environmentInfoRepository.save(env);
  }

  @Test
  public void testQueryAll() {
    List<User> list = userRepository.findAll();
    for (User user : list) {
      System.out.println(user);
    }
  }

  @Test
  public void testUnionKey() {
    EnvironmentInfo env = new EnvironmentInfo();
    env.setName("hello");
    env.setIntr("world");
    environmentInfoRepository.save(env);
  }


}

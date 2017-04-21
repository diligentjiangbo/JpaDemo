package bo.jiang.jpa.demo;

import bo.jiang.jpa.demo.entity.User;
import bo.jiang.jpa.demo.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author shumpert.jiang
 * @date 2017/4/21 0021 16:07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationsTest {

  @Autowired
  private UserRepository userRepository;

  @Test
  public void Test() {
    //userRepository.save(new User("aaa", 10));
    User user = userRepository.findByName("aaa");
    System.out.println(user);
  }
}

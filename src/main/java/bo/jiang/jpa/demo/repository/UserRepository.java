package bo.jiang.jpa.demo.repository;

import bo.jiang.jpa.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author shumpert.jiang
 * @date 2017/4/21 0021 16:02
 */
public interface UserRepository extends JpaRepository<User, Long> {
  User findByName(String name);

  User findByNameAndAge(String name, Integer age);

  @Query("from User u where u.name=:name")
  User findUser(@Param("name") String name);
}

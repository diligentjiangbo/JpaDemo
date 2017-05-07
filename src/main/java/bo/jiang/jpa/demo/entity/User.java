package bo.jiang.jpa.demo.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;


/**
 * @author shumpert.jiang
 * @date 2017/4/21 0021 15:44
 */
@Entity
public class User {

  @javax.persistence.Id
  @GeneratedValue
  private Long id;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(nullable = false)
  private Integer age;

  public User() {
  }

  public User(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}

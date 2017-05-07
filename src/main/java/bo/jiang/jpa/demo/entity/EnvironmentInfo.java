package bo.jiang.jpa.demo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@IdClass(EnvironmentInfoKey.class)
@Table(name = "environment_info3")
public class EnvironmentInfo {

  @Id
  @Column(name = "ENV_NAME")
  private String name;

  @Id
  @Column(name = "ENV_INTR")
  private String intr;


  public void setName(String name) {
    this.name = name;
  }

  public void setIntr(String intr) {
    this.intr = intr;
  }
}

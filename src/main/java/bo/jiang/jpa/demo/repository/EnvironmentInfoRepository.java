package bo.jiang.jpa.demo.repository;


import bo.jiang.jpa.demo.entity.EnvironmentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by lazhiyuanmin on 2017/4/19.
 */
public interface EnvironmentInfoRepository extends JpaRepository<EnvironmentInfo,String> {
  EnvironmentInfo findByName(String name);

  @Query("from EnvironmentInfo env where env.name=:name")
  EnvironmentInfo findEnv(@Param("name") String name);
}

package club.longyi.asf_helper.module.base.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * Created by:
 * zhushuai.net@gmail.com
 * 2018/4/18 14:01
 * https://github.com/ZhuShuai1992
 */
@NoRepositoryBean
public interface CommonDao<T,PK extends Serializable>  extends JpaRepository<T,PK> , JpaSpecificationExecutor<T>{
}

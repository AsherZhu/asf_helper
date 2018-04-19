package club.longyi.asf_helper.dao;

import club.longyi.asf_helper.entity.UserEntity;
import club.longyi.asf_helper.module.base.dao.CommonDao;
import org.apache.catalina.User;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by:
 * zhushuai.net@gmail.com
 * 2018/4/19 15:45
 * https://github.com/ZhuShuai1992
 */
public interface UserDao extends CommonDao<UserEntity, Long> {
    /**
     * @param username
     * @param password
     * @return
     */
    UserEntity findUserEntityByUserNameAndPassword(String username, String password);

    boolean existsByEmail(String email);

    boolean existsByUserName(String name);



}

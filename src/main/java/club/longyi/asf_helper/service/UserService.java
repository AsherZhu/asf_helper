package club.longyi.asf_helper.service;

import club.longyi.asf_helper.dao.UserDao;
import club.longyi.asf_helper.entity.UserEntity;
import club.longyi.asf_helper.module.base.service.CommonService;
import club.longyi.asf_helper.type.ReturnType;
import club.longyi.asf_helper.utils.RealIpUtils;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by:
 * zhushuai.net@gmail.com
 * 2018/4/19 14:06
 * https://github.com/ZhuShuai1992
 */
@Service
public class UserService extends CommonService<UserEntity, Long> {

    @Autowired
    private UserDao userDao;


    @Override
    public void save(UserEntity entity) {
        entity.setCreateTime(new Date());
        entity.setValidFlag(ReturnType.SUCCESS.getKey());
        userDao.save(entity);
    }

    @Override
    public void delete(Long id) {
        userDao.deleteById(id);
    }


    public boolean existsByUserName(String userName) {
        return userDao.existsByUserName(userName);
    }

    public boolean existsByEmail(String email) {
        return userDao.existsByEmail(email);
    }

}

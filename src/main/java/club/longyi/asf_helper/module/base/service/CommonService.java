package club.longyi.asf_helper.module.base.service;

import club.longyi.asf_helper.module.base.dao.CommonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;


import java.io.Serializable;
import java.util.List;

/**
 * Created by:
 * zhushuai.net@gmail.com
 * 2018/4/19 14:13
 * https://github.com/ZhuShuai1992
 */
public abstract class CommonService<T, PK extends Serializable> {

    @Autowired
    protected CommonDao<T, PK> commonDao;

    public abstract void save(final T entity);

    public abstract void delete(final PK id);

    public List<T> findAll() {
        return commonDao.findAll();
    }

    public List<T> findAll(Sort sort) {
        return commonDao.findAll(sort);
    }

    public List<T> findAllById(Iterable<PK> pks) {
        return commonDao.findAllById(pks);
    }

    public <S extends T> List<S> saveAll(Iterable<S> entities) {
        return commonDao.saveAll(entities);
    }

    public void flush() {
        commonDao.flush();
    }

    public <S extends T> S saveAndFlush(S entity) {
        return commonDao.saveAndFlush(entity);
    }

    public void deleteInBatch(Iterable<T> entities) {
        commonDao.deleteInBatch(entities);
    }

    public void deleteAllInBatch() {
        commonDao.deleteAllInBatch();
    }

    public T getOne(PK pk) {
        return commonDao.getOne(pk);
    }

    public <S extends T> List<S> findAll(Example<S> example) {
        return commonDao.findAll(example);
    }

    public <S extends T> List<S> findAll(Example<S> example, Sort sort) {
        return commonDao.findAll(example, sort);
    }
}

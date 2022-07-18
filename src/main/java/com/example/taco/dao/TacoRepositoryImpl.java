package com.example.taco.dao;

import com.example.taco.model.Taco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

// 将其看做Component加载，且将抛出的异常封装为Spring的数据库访问异常
@Repository
public class TacoRepositoryImpl implements TacoRepository {

    private JdbcTemplate jdbc;

    @Autowired // 自动注入JdbcTemplate对象
    public TacoRepositoryImpl(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public Iterable<Taco> findAll() {
        return null;
    }

    @Override
    public Taco findOne(long id) {
        return null;
    }

    @Override
    public Taco save(Taco taco) {
        return taco;
    }


}

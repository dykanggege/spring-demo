package com.example.taco.dao;

import com.example.taco.model.Taco;

public interface TacoRepository {
    Iterable<Taco> findAll();
    Taco findOne(long id);
    Taco save(Taco taco);
}


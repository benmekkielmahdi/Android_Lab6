package com.example.android_lab6.dao;


import java.util.List;

import java.util.List;

public interface IDao<T> {
    T create(T t);
    T update(T t);
    boolean delete(long id);
    T findById(long id);
    List<T> findAll();
}
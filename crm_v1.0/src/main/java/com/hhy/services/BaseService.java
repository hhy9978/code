package com.hhy.services;

import java.util.List;

/**
 * @author hhy
 * @code 2023-03-01 9:27
 */
public interface BaseService<T,I> {

    List<T> getAll();

    T getById(I i);

    Integer deleteById(I i);

    Integer add(T t);

    Integer update(T t);

}

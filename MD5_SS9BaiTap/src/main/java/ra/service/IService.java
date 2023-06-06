package ra.service;

import java.util.List;

public interface IService<T , E> {
    List<T> findAll();
    T save (T t);
    T findById(E e);
    void delete(E e);
}

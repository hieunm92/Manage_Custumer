package service;

import java.util.List;

public interface ICustommer<T> {
    List<T> findAll();
}

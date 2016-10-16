package lesson8.homework;

import java.util.List;

/**
 * Created by AFedosov on 16.10.2016.
 */
public interface AbstractDAO <T> {

    T save(T t);
    void delete(T t);
    void deleteAll(List<T> T);
    void saveAll(List<T> T);
    List<T> getList();
    void deleteById(long id);
    T get(long id);

}

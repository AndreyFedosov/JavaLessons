package lesson8.homework;

import java.util.*;
import java.util.List;

/**
 * Created by AFedosov on 16.10.2016.
 */
public class AbstactDAOImlp<T> implements AbstractDAO<T> {
    List<T> list = new ArrayList<>();

    @Override
    public T save(T t) {
        list.add(t);
        return t;
    }

    @Override
    public void delete(T t) {
        list.remove(t);
    }

    @Override
    public void deleteAll(List<T> t) {
        list.removeAll(t);
    }

    @Override
    public void saveAll(List<T> t) {
        list.addAll(t);
    }

    @Override
    public List<T> getList() {
            return list;
    }

    @Override
    public  void deleteById(long id) {
        list.remove(id);
    }

    @Override
    public T get(long id) {
        return list.get((int)id);
    }
}

package app.repositories;

import app.models.Employee;

import java.util.HashMap;
import java.util.List;

public interface GenericRepository<T> {

    public void initializeSchema(String entity,List<T> rows);

    public void save(String entity,List<T> rows);

    public List<T> getAll(String entity);

    public T findById(String entity, Integer id);

    public T findByName(String entity, String name);

}

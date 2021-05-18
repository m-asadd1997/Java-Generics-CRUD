package app.services;

import java.util.List;

public interface GenericService<T>{

    public void save(String entity, List<T> rows);

    public List<T> getAll(String entity);

    public void displayData(List<T> rows);

    public T findEmployeeById(String entity,Integer id);

    public T findEmployeeByName(String entity,String Name);
}

package app.services;

import app.models.Developer;
import app.models.HumanResources;

import java.util.List;

public interface GenericService<T>{

    public void save(String entity, List<T> rows);

    public List<T> getAll(String entity);

    public void update(String entity,Integer id,T updatedObj);

    public void displayData(List<T> rows);

    public T findEmployeeById(String entity,Integer id);

    public T findEmployeeByName(String entity,String Name);

    public void saveHRs(String entity, List<HumanResources> rows);

    public void saveDevelopers(String entity, List<Developer> rows);

}

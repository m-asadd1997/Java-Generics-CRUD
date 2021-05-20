package app.controllers;

import app.models.Developer;
import app.models.Employee;
import app.models.HumanResources;

import java.util.List;

public interface GenericController<T> {

    public void save(String entity,List<T> rows);

    public List<T> getAll(String entity);

    public void updateRecord(String entity,Integer id,T updatedObj);

    public T getEmployeeById(String entity,Integer id);

    public T getEmployeeByName(String entity, String name);

    public void displayData(List<T> rows);

    public void saveHRs(String entity, List<HumanResources> rows);

    public void saveDevelopers(String entity, List<Developer> rows);

}

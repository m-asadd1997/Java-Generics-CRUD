package app.controllers;

import app.models.Employee;

import java.util.List;

public interface GenericController<T> {

    public void save(String entity,List<T> rows);

    public List<T> getAll(String entity);

    public T getEmployeeById(String entity,Integer id);

    public T getEmployeeByName(String entity, String name);

    public void displayData(List<T> rows);

}

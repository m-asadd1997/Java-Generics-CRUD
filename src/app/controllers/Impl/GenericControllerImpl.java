package app.controllers.Impl;

import app.controllers.GenericController;
import app.models.Employee;
import app.services.GenericService;
import app.services.Impl.GenericServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class GenericControllerImpl<T> implements GenericController<T> {

    //TO USE BUSINESS LOGICS FROM SERVICE
    GenericService service = new GenericServiceImpl();


    @Override
    public void save(String entity,List<T> rows){
        service.save(entity,rows);
    }

    @Override
    public List<T> getAll(String entity){

        return service.getAll(entity);
    }

    @Override
    public void updateRecord(String entity,Integer id,T updatedObj){
        service.update(entity,id,updatedObj);
    }

    @Override
    public void displayData(List<T> rows){
        service.displayData(rows);
    }

    @Override
    public T getEmployeeById(String entity,Integer id){
        return (T) service.findEmployeeById(entity,id);
    }

    @Override
    public T getEmployeeByName(String entity,String name){
        return (T) service.findEmployeeByName(entity, name);
    }


}

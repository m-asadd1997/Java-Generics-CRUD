
package app.services.Impl;

import app.constants.Constants;
import app.repositories.GenericRepository;
import app.repositories.impl.GenericRepositoryImpl;
import app.services.GenericService;
import database.InMemoryDB;

import java.util.List;
import java.util.Optional;

public class GenericServiceImpl<T> implements GenericService<T> {

    //PROVIDES ALL REPOSITORY METHODS
    GenericRepository repository = new GenericRepositoryImpl();

   @Override
    public void save(String entity, List<T> rows){
       try{
                repository.save(entity,rows);
                System.out.println(Constants.SAVED);
       }
       catch (Exception e){
           System.out.println(Constants.SAVE_ERROR + e);
       }
   }

   @Override
    public List<T> getAll(String entity){
       try{
           System.out.println(Constants.GET);
           return repository.getAll(entity);
       }
       catch(Exception e){
           System.out.println(Constants.GET_ERROR + e);
       }
       return null;
   }

   @Override
   public void update(String entity,Integer id,T updatedObj){
       T obj = findEmployeeById(entity, id);
       if(obj != null){
           List rows = InMemoryDB.DB.get(entity);
           rows.set(rows.indexOf(obj),updatedObj);
       }
   }


   @Override
   public T findEmployeeById(String entity, Integer id){
    try{
        System.out.println(Constants.GET);
        return (T) repository.findById(entity,id);

    }
    catch (Exception e){
        System.out.println(Constants.GET_ERROR);
    }
       return null;
   }

   @Override
   public T findEmployeeByName(String entity, String name){

       try{
           System.out.println(Constants.GET);
           return (T) repository.findByName(entity, name);
       }
       catch (Exception e){
           System.out.println(Constants.GET_ERROR);
       }
       return null;
   }

   @Override
    public void displayData(List<T> rows){
       rows.forEach(row->{
           System.out.println(row);
       });
       System.out.println();
   }

}

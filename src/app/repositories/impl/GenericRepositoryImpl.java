package app.repositories.impl;



import app.models.Employee;
import app.repositories.GenericRepository;
import database.InMemoryDB;


import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenericRepositoryImpl<T> implements GenericRepository<T> {



    //TO INITIALIZE NEW ENTITY IN DATABASE

    @Override
    public void initializeSchema(String entity,List<T> rows)
    {
            rows = new ArrayList<T>();
            InMemoryDB.DB.put(entity,rows);

    }

    //TO SAVE THE DATA IN DATABASE
    @Override
    public void save(String entity, List<T> rows){
            InMemoryDB.DB.put(entity,rows);
    }

    //TO GET ALL THE DATA AGAINST ENTITY NAME

    @Override
    public List getAll(String entity){

        return InMemoryDB.DB.get(entity);

    }

    //GET ALL THE DATA AGAINST ID FOR EACH ENTITY
    @Override
    public T findById(String entity,Integer id){
        return (T) InMemoryDB.DB.get(entity)
                .stream()
                .filter(filterId(id))
                .findFirst().orElse(null);

    }

    //GET ALL THE DATA AGAINST NAME FOR EACH ENTITY
    @Override
    public T findByName(String entity,String name){
        return (T) InMemoryDB.DB.get(entity)
                .stream()
                .filter(filterName(name))
                .findFirst().orElse(null);
    }


    public Predicate<Employee> filterName(String name){
        return emp->emp.getName().equalsIgnoreCase(name);
    }

    public Predicate<Employee> filterId(Integer id){
        return emp->emp.getId() == id;
    }

//    private String getGenericName()
//    {
//        return ((Class<T>) ((ParameterizedType) getClass()
//                .getGenericSuperclass()).getActualTypeArguments()[0]).getTypeName();
//    }
//
//    private String getEntityName(){
//        String entityName = getGenericName();
//        System.out.println("HELOOOOOO"+entityName);
//        if(entityName.equals("HumanResources"))
//        {
//
//            return "HR";
//        }
//        else if(entityName.equals("Developer")){
//            return "DEV";
//        }
//
//        return null;
//    }


}

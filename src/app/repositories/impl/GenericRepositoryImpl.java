package app.repositories.impl;



import app.models.Employee;
import app.repositories.GenericRepository;
import database.InMemoryDB;


import java.util.ArrayList;
import java.util.List;
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
                .filter(x->((Employee) x).getId() == id)
                .findFirst().orElse(null);

    }

    //GET ALL THE DATA AGAINST NAME FOR EACH ENTITY
    @Override
    public T findByName(String entity,String name){
        return (T) InMemoryDB.DB.get(entity)
                .stream()
                .filter(x->((Employee) x).getName().equals(name))
                .findFirst().orElse(null);

    }


}

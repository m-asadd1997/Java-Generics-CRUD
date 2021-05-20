package app.repositories.impl;

import app.models.Developer;
import database.InMemoryDB;

import java.util.ArrayList;
import java.util.List;

public class DeveloperRepositoryImpl extends GenericRepositoryImpl<Developer>{

    @Override
    public void save(String entity, List<Developer> rows){
        rows.add(new Developer(1,"Ahmed",29,"Java","Backend Developer",true));
        rows.add(new Developer(2,"Ahsan",20,"Java & Jquery","Full Stack Developer",false));
        rows.add(new Developer(3,"Ali",26,"Android","Mobile App Developer",true));
        InMemoryDB.DB.put(entity,rows);
    }

}

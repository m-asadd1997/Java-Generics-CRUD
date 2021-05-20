package app.repositories.impl;

import app.models.HumanResources;
import database.InMemoryDB;

import java.util.List;

public class HumanResourcesRepositoryImpl extends GenericRepositoryImpl<HumanResources>{

    @Override
    public void save(String entity, List<HumanResources> rows){
        rows.add(new HumanResources(1,"Asad",23,"Trainee",10,"Good"));
        rows.add(new HumanResources(2,"Amer",25,"Junior",55,"Average"));
        rows.add(new HumanResources(3,"Ibrahim",26,"Senior",90,"Excellent"));

        InMemoryDB.DB.put(entity,rows);
    }

}

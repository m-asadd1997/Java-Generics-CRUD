package app.controllers;

import app.controllers.Impl.GenericControllerImpl;
import app.models.Developer;
import app.models.Employee;
import app.models.HumanResources;
import com.sun.tools.jconsole.JConsoleContext;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainController {



    public static void main(String[] args) {
        //HERE WE'RE CALLING OUR CONTROLLER TO PERFORM ACTIONS
        GenericController controller = new GenericControllerImpl();

        //save HR's
        List<HumanResources> hrList = new ArrayList<>();
        controller.saveHRs("HR",hrList);


        //save Developers
        List<Developer> developerList = new ArrayList<>();
        controller.saveDevelopers("DEV",developerList);

        List<Developer> DATA = controller.getAll("DEV");

        HumanResources hr =  (HumanResources) controller.getEmployeeByName("HR","Amer");
        Developer developer = (Developer) controller.getEmployeeById("DEV",1);

//        System.out.println("GET BY NAME : " + hr);
        System.out.println("GET BY ID : " + developer);

        //UPDATE RECORD
//        controller.updateRecord("DEV",1,new Developer(1,"Bashir",28,"Node Js","Backend Developer",false));

//        developer = (Developer) controller.getEmployeeById("DEV",1);

//        System.out.println("UPDATED DATA : " + developer);
        //GET ALL DATA
//

        DATA.sort((e1, e2) -> e1.getAge()- e2.getAge());
        System.out.println("\n"+"SORT DATA BY AGE"+"\n");System.out.println();
        controller.displayData(DATA);

        DATA.sort((e1,e2)-> e1.getName().compareTo(e2.getName()));
        System.out.println("\n" +"SORT DATA BY NAME" + "\n");
        controller.displayData(DATA);


        Comparator<Developer> compareById = Comparator.comparing(dev->dev.getId());
        DATA.sort(compareById.reversed());
        System.out.println("\n" +"SORT DATA BY ID" + "\n");
        controller.displayData(DATA);

    }
}

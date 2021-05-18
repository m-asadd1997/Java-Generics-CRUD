package app.controllers;

import app.controllers.Impl.GenericControllerImpl;
import app.models.Developer;
import app.models.Employee;
import app.models.HumanResources;
import com.sun.tools.jconsole.JConsoleContext;

import java.util.ArrayList;
import java.util.List;

public class MainController {



    public static void main(String[] args) {
        //HERE WE'RE CALLING OUR CONTROLLER TO PERFORM ACTIONS
        GenericController controller = new GenericControllerImpl();

        //save HR's
        List<HumanResources> hrList = new ArrayList<>();
        hrList.add(new HumanResources(1,"Asad",23,"Trainee",10,"Good"));
        hrList.add(new HumanResources(2,"Amer",25,"Junior",55,"Average"));
        hrList.add(new HumanResources(3,"Ibrahim",26,"Senior",90,"Excellent"));

        controller.save("HR",hrList);


        //save Developers
        List<Developer> developerList = new ArrayList<>();
        developerList.add(new Developer(1,"Ahmed",28,"Java","Backend Developer",true));
        developerList.add(new Developer(2,"Ahsan",28,"Java & Jquery","Full Stack Developer",false));
        developerList.add(new Developer(3,"Ali",28,"Android","Mobile App Developer",true));

        controller.save("DEVELOPER",developerList);

        List<? extends Employee> DATA = controller.getAll("DEVELOPER");

        HumanResources hr =  (HumanResources) controller.getEmployeeByName("HR","Asad");

        System.out.println(hr);

        //get Employees
//        controller.displayData(DATA);


    }
}

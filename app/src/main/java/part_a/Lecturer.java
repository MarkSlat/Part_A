package part_a;

import java.util.ArrayList;
import java.util.List;

public class Lecturer {
    
    private String name;
    private int age;
    private String DOB;
    private String ID;
    private List<Module> modulesTeaching = new ArrayList<Module>();

    public Lecturer(String name, int age, String dOB, String id) {
        this.name = name;
        this.age = age;
        this.DOB = dOB;
        this.ID = id;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDOB() {
        return DOB;
    }

    public String getID() {
        return ID;
    }

    public List<Module> modulesTeaching() {
        return modulesTeaching;
    }

    public void addModules(Module module) {
        modulesTeaching.add(module);
    }

    public String getUsername() {
        return name + Integer.toString(age);
    }
    
}

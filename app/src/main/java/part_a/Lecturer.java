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

    public String getmMdulesTeachingNames() {
        String s = "";
        for (int i = 0; i < modulesTeaching.size(); i++) {
            s += modulesTeaching.get(i).getName() + " ";
        }
        return s;
    }

    public String getUsername() {
        return name + Integer.toString(age);
    }

    @Override
    public String toString() {
        return "Lecturer: " + name + "\nID: " + ID + "\nUsername: " + getUsername() + "\nModules teaching: " + getmMdulesTeachingNames();
    }
    
}

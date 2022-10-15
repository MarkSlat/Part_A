package part_a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    String name;
    int age;
    String DOB;
    int ID;
    List<CourseProgramme> courses = new ArrayList<CourseProgramme>();
    List<Module> modules = new ArrayList<Module>();

    public Student(String name, int age, String dOB, int iD) {
        this.name = name;
        this.age = age;
        DOB = dOB;
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public List<CourseProgramme> getCourses() {
        return courses;
    }

    public void addCourses(CourseProgramme course) {
        courses.add(course);
    }
    
    public String getCoursesNames() {
        String s = "";
        for (int i = 0; i < courses.size(); i++) {
            s += courses.get(i).getName() + " ";
        }
        return s;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void addModules(Module module) {
        modules.add(module);
    }

    public String getModulesNames() {
        String s = "";
        for (int i = 0; i < modules.size(); i++) {
            s += modules.get(i).getName() + " ";
        }
        return s;
    }

    public String getUsername() {
        return name + Integer.toString(age);
    }

    @Override
    public String toString() {
        return "Student: " + name + "\nID: " + ID + "\nUsername: " + getUsername() + "\nCourses: " + getCoursesNames() + "\nModules: " + getModulesNames();
    }

}

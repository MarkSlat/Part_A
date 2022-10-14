package part_a;

import java.util.ArrayList;
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

    public List<CourseProgramme> getCourses() {
        return courses;
    }

    public void addCourses(CourseProgramme course) {
        courses.add(course);
    }

    public List<Module> getModules() {
        return modules;
    }

    public void addModules(Module module) {
        modules.add(module);
    }

    public String getUsername() {
        return name + Integer.toString(age);
    }

    @Override
    public String toString() {
        return "Student: " + name + "\nID: " + ID + "\nCourses: " + courses + "\nModules: " + modules;
    }

}

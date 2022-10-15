package part_a;

import java.util.ArrayList;
import java.util.List;

public class Module {
    
    String name;
    String moduleID;
    Lecturer lecturerResponsible;
    List<CourseProgramme> courses = new ArrayList<CourseProgramme>();

    List<Student> students = new ArrayList<Student>();

    public Module(String name, String moduleID, Lecturer lecturerResponsible) {
        this.name = name;
        this.moduleID = moduleID;
        this.lecturerResponsible = lecturerResponsible;
    }    

    public String getName() {
        return name;
    }

    public String getModuleID() {
        return moduleID;
    }

    public String getCoursesNames() {
        String s = "";
        for (int i = 0; i < courses.size(); i++) {
            s += courses.get(i).getName() + " ";
        }
        return s;
    }

    public Lecturer getLecturerResponsible() {
        return lecturerResponsible;
    }

    public List<CourseProgramme> getCourses() {
        return courses;
    }

    public void addCourses(CourseProgramme course) {
        courses.add(course);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public String getStudentsNames() {
        String s = "";
        for (int i = 0; i < students.size(); i++) {
            s += students.get(i).getName() + " ";
        }
        return s;
    }

    @Override
    public String toString() {
        return "Module: " + name + "\nModule ID: " + moduleID + "\nLecturer: " + lecturerResponsible.getName()
                + "\nCourses: " + getCoursesNames() + "\nStudents: " + getStudentsNames();
    }

}
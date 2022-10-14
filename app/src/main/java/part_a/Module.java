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

    @Override
    public String toString() {
        return "Module: " + name + "\nModule ID:" + moduleID + "\nLecturer" + lecturerResponsible
                + "\nCourses:" + courses + "\nStudents:" + students;
    }

}
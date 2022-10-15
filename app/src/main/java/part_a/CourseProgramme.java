package part_a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// import org.joda.time.DateTime;
// import org.joda.time.LocalDate;
import org.joda.time.*;

public class CourseProgramme {
    
    private String name;
    private List<Module> modules =  new ArrayList<Module>();
    private DateTime startDate;
    private DateTime endDate;
    private List<Student> students = new ArrayList<Student>();
    
    public CourseProgramme(String name, DateTime startDate, DateTime endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public String getName() {
        return name;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
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


    public String getInfo() {
        return "Course Programme: " + name + "\nModules: " + getModulesNames() + "\nStarting date: " + startDate + "\tEnd date: "
                + endDate + "\nList of students enrolled:" + students;
    }

    @Override
    public String toString() {
        return "Course Programme: " + name + "\nModules: " + getModulesNames() + "\nStarting date: " + startDate + "\tEnd date: "
                + endDate + "\nList of students enrolled: " + getStudentsNames();
    }

}

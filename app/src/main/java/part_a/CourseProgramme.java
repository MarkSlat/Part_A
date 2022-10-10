package part_a;

import java.util.ArrayList;
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


    

    // DateTime startDate;

}

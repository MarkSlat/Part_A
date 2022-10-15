/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package part_a;

import org.joda.time.*;

public class App {

    private Student Mark;
    private CourseProgramme ECE;
    private Lecturer Schukat;
    private Module SoftwareEngineering_III;

    public App (){
        // create();
    // }

    // public void create() {
        // System.out.println(DateTime.now());
        Mark = new Student("Mark", 21, "11/09/2001", 19459946);
        ECE = new CourseProgramme("ECE", DateTime.parse("2022-09-5T11:00"), DateTime.parse("2022-03-31T15:00"));
        Schukat = new Lecturer("Michael Schukat", 1, "29/09/2022", "IT402");
        SoftwareEngineering_III = new Module("Software engineering III", "CT417", Schukat);
        Mark.addCourses(ECE);
        Mark.addModules(SoftwareEngineering_III);
        Schukat.addModules(SoftwareEngineering_III);
        ECE.addStudents(Mark);
        ECE.addModules(SoftwareEngineering_III);
        SoftwareEngineering_III.addStudents(Mark);
        SoftwareEngineering_III.addCourses(ECE);

        // System.out.println(ECE);
        // System.out.println(SoftwareEngineering_III);
    }


    public String getStudentUsername(Student s) {
        return s.getUsername();
    }

    public String getLectureUsername(Lecturer l) {
        return l.getUsername();
    }  

    public Student getMark() {
        return Mark;
    }

    public Lecturer getSchukat() {
        return Schukat;
    }

    public static void main(String[] args) {
        new App();
    }
}
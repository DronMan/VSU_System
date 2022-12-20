import model.*;
import model.AdministrativePersonal;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        AdministrativePersonal administrativePersonal = new AdministrativePersonal("Nikita", 123, "Nikita@mail.nikita");

        Course course = new Course(2, "Course", 144);

        Lecturer lecturer = new Lecturer(111, "Vlad", "Vlad@gmail.al");
        lecturer.setFieldOfResearch("Math");
        lecturer.addCourse(course);

        Research research = new Research(5, "Maxim", "Maxim@mail.ru");
        research.setFieldOfResearch("Biology");

        Institute institute = new Institute("Institute", "Voronezh, VSU, 1",
                new ArrayList<>(List.of(lecturer)));
        Institute institute1 = new Institute("Institute1", "Voronezh, VSU, 1",
                new ArrayList<>(List.of(research)));

        Dean mathDean = new Dean(112, "Andrey", "Andrey@mail.com");
        Faculty faculty = new Faculty("Faculty", new ArrayList<>(Arrays.asList(institute, institute1)), mathDean);
        University university = new University(new ArrayList<>(Collections.singletonList(faculty)));

        Project project = new Project("StudyingOfProject", new Date(2022, Calendar.DECEMBER, 15), new Date(2022, Calendar.DECEMBER, 30));
        Participation participation1 = new Participation(1, research, project);
        Participation participation2 = new Participation(2, lecturer, project);

        System.out.printf(String.format("University is %s. \nAdministrative Personal is %s. \nResearchers participations are %s, \n%s",
                university, administrativePersonal, participation1, participation2));
    }
}

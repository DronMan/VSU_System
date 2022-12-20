package model;

public class AdministrativePersonal extends Employee {

    public AdministrativePersonal(String name, int ssNumber, String email) {
        super(ssNumber, name, email);
        setNumberOfEmployees(getNumberOfEmployees() + 1);
    }

    public Participation addResearch(Project project, Research research) {
        return new Participation(12, research, project);
    }
}
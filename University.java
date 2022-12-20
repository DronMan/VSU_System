package model;

import java.util.List;

public class University {
    private List<Faculty> faculties;

    public University(List<Faculty> faculties) {
        this.faculties = faculties;
    }


    public List<Faculty> getFaculties() {
        return this.faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public String toString() {
        return "University{" +
                "Faculties=" + faculties +
                '}';
    }
}
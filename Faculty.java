package model;

import java.util.List;

public class Faculty {
    private String name;
    private List<Institute> institutes;
    private Dean dean;

    public Faculty(String name, List<Institute> institutes, Dean dean) {
        this.name = name;
        this.institutes = institutes;
        this.dean = dean;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Institute> getInstitutes() {
        return this.institutes;
    }

    public void setInstitutes(List<Institute> institutes) {
        this.institutes = institutes;
    }

    public Dean getDean() {
        return this.dean;
    }

    public void setDean(Dean dean) {
        this.dean = dean;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", Institutes=" + institutes +
                ", dean=" + dean +
                '}';
    }
}
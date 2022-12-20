package model;

public class Research extends Employee {

    private String fieldOfResearch;

    public Research(int ssNumber, String name, String email) {
        super(ssNumber, name, email);
    }

    public String getFieldOfResearch() {
        return this.fieldOfResearch;
    }

    public void setFieldOfResearch(String fieldOfResearch) {
        this.fieldOfResearch = fieldOfResearch;
    }

    @Override
    public String toString() {
        return "Research{" +
                "fieldOfResearch='" + fieldOfResearch + '\'' +
                '}';
    }
}
package model;

import java.util.List;

public class Institute {

    private String name;
    private String address;
    private List<Research> researchList;

    public Institute(String name, String address, List<Research> researchList) {
        this.name = name;
        this.address = address;
        this.researchList = researchList;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Research> getResearchList() {
        return this.researchList;
    }

    public void setResearchList(List<Research> researchList) {
        this.researchList = researchList;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", researchList=" + researchList +
                "}\n";
    }
}
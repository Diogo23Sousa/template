package com.project.model;

import java.util.List;
import java.util.Objects;

public class Template {

    private String name;
    private int year;

    private List<Information> informationList;

    public Template() {}

    public Template(String name, int year, List<Information> informationList) {
        this.name = name;
        this.year = year;
        this.informationList = informationList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Information> getInformationList() {
        return informationList;
    }

    public void setInformationList(List<Information> informationList) {
        this.informationList = informationList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Template template)) return false;
        return getYear() == template.getYear() && Objects.equals(getName(), template.getName()) && Objects.equals(getInformationList(), template.getInformationList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getYear(), getInformationList());
    }
}

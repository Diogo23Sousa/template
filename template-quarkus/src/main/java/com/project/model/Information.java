package com.project.model;

import java.util.Objects;

public class Information {

    private String informationTitle;
    private String details;
    private int year;
    private int month;
    private int day;

    public Information() {}
    public Information(String informationTitle, String details, int year, int month, int day) {
        this.informationTitle = informationTitle;
        this.details = details;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getInformationTitle() {
        return informationTitle;
    }

    public void setInformationTitle(String informationTitle) {
        this.informationTitle = informationTitle;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Information that)) return false;
        return getYear() == that.getYear() && getMonth() == that.getMonth() && getDay() == that.getDay() && Objects.equals(getInformationTitle(), that.getInformationTitle()) && Objects.equals(getDetails(), that.getDetails());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInformationTitle(), getDetails(), getYear(), getMonth(), getDay());
    }
}

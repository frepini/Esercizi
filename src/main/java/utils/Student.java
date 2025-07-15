package utils;

import java.util.Objects;

public class Student {
    private String name;
    private double average;

    public Student(String name, double average) {
        this.name = name;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(average, student.average) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, average);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", average=" + average +
                '}';
    }
}

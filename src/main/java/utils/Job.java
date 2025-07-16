package utils;

import java.util.Objects;

public class Job {
    private String title;
    private String description;
    private double salary;

    public Job(String title, String description, double salary) {
        this.title = title;
        this.description = description;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return Double.compare(salary, job.salary) == 0 && Objects.equals(title, job.title) && Objects.equals(description, job.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, salary);
    }

    @Override
    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", salary=" + salary +
                '}';
    }
}

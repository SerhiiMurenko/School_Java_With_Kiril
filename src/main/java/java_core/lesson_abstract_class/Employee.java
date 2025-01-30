package java_core.lesson_abstract_class;

import java.math.BigDecimal;

public abstract class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }



    public int getSalary() {
        return salary;
    }

    abstract BigDecimal calculateBonus();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}


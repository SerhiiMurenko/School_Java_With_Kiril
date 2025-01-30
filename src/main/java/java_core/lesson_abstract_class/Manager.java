package java_core.lesson_abstract_class;

import java.math.BigDecimal;

public class Manager extends Employee {

    public Manager(String name, int salary) {
        super(name, salary);

    }

    @Override
    public BigDecimal calculateBonus() {
        return getSalary().multiply(BigDecimal.valueOf(0.15));

    }


    }


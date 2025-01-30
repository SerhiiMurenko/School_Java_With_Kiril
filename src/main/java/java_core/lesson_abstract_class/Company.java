package java_core.lesson_abstract_class;

public class Company {
    public static void main(String[] args) {



        Employee employee1 = new Manager("Bob",5000);
        Employee employee2 = new Manager("John",3000);


        Employee employee3 = new Developer("Maria", 6000);
        Employee employee4 = new Developer("Oskar", 8000);

        Employee [] employees = {employee1,employee2,employee3,employee4};


       for (Employee employee : employees){
                  System.out.println(employee);
       }

    }
}

package org.example.collections;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {

    private int id;
    private String name;
    private String dept;
    private double salary;

    private String company;

    public Employee(int id, String name, String dept, double salary, String company) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee(1,"venu","developer",1222.2,"ML"));
        employee.add(new Employee(2,"akhil","IT-stack-all-round-developer",10000000.2,"ML"));
        employee.add(new Employee(3,"vishal","backup support",199922.2,"ML"));
        employee.add(new Employee(4,"ram","architect",12200902.2,"ML"));
        employee.add(new Employee(5,"teja","java-react-vaujs",122222.2,"INFO"));
        employee.add(new Employee(6,"maturi","developer",1222222.2,"INFO"));
        System.out.println("-------------------------------");


        Map<String, List<Employee>> emp_comapny = employee
                .stream()
                .collect(Collectors.groupingBy(Employee::getCompany));

        emp_comapny.forEach((company,emplist)->{
            List<Employee> emp_dept = emplist.stream()
                    .sorted(Comparator.comparingDouble(Employee::getSalary))
                    .limit(2)
                    .toList();
            System.out.println("company "+company);
            emp_dept.forEach(System.out::println);
        });

        System.out.println("++++++++++++++++++++++");

        List<String> company = employee.stream()
                .map(Employee::getCompany)
                .collect(Collectors.toList());
        System.out.println(company);

        List<String> name = employee.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(name);
      List<String>starsWithV= name.stream().filter(i->i.startsWith("v")).collect(Collectors.toList());



    }
}


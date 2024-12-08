package pro.sky.HomeWork26.domain;


public class Employee {
    private final String firstName;
    private final String lastName;
    private int departament;
    private int salary;

    public Employee(String firstName, String lastName, String departament, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departament = departament;
        this.salary = salary;

    }

    public String getfirstName() {

        return firstName;
    }

    public String getlastName() {

        return firstName;
    }

    public int getDepartament() {

        return departament;
    }


    public int getSalary() {
        return salary;

    }

    @Override
    public int hashcode() {
        final int prime = 31;
        int result = 1;
        result = prime + result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime + result + ((firstName == null) ? 0 : lastName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
            if (lastName == null) {
                return other.lastName == null;
            } else return lastName.equals(other.lastName);
        }


    }
}
























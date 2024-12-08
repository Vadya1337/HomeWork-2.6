package pro.sky.HomeWork26.service;

import org.springframework.stereotype.Service;
import pro.sky.HomeWork26.domain.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Service
public class EmployeeService {
    private Map<String, Employee> employees;

    public EmployeeService() {
        employees = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        String fullName = employee.getfirstName() + " " + employee.getlastName();
        employees.put(fullName, employee);
    }


    public void removeEmployee(String firstName, String lastName) {
        String fullName = firstName + lastName;
        employees.remove(fullName);
    }

    public void findEmployee(String firstName, String lastName) {
        String fullName = firstName + lastName;
        employees.get(fullName);
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees.values());
    }

    public void addTestData() {
        employees.put("Некифоров Некита Анатольевич ", 2, 12000);
        employees.put("Серебряков Анатолий Павлович ", 2, 12000);
        employees.put("Прохоров Сергей Петрович ", 3, 16000);
        employees.put("Афонин Андрей Владимирович ", 1, 32000);
        employees.put("Ангаборов Виталий Степановий ", 4, 45000);

    }
}
























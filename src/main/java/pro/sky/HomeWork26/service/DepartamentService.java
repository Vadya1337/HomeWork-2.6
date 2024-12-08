package pro.sky.HomeWork26.service;

import org.springframework.stereotype.Service;
import pro.sky.HomeWork26.domain.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DepartamentService
{
private EmployeeService employeeService;

public DepartamentService(EmployeeService employeeService){
    this.employeeService = employeeService;
}
public Employee getEmployeeWithMaxSalaryByDepartament(String departament){
    List<Employee> employees = employeeService.getAllEmployees();
    return  employees.stream()
            .filter(employee -> employee.getDepartament().equals(departament))
            .max(Comparator.comparingInt(Employee::getSalary))
            .orElse(null);
}
    public Employee getEmployeeWithMinSalaryByDepartament(String departament){
        List<Employee> employees = employeeService.getAllEmployees();
        return  employees.stream()
                .filter(employee -> employee.getDepartament().equals(departament))
                .max(Comparator.comparingInt(Employee::getSalary))
                .orElse(null);
    }
    public Map<String, List<Employee>> getAllEmployeesByDepartament(String departament) {
        List<Employee> employees = employeeService.getAllEmployees();
        return  employees.stream()
                .filter(employee -> employee.getDepartament().equals(departament))
                .collect(Collectors.groupingBy(Employee::getDepartament));
}
    public Map<String, List<Employee>> getAllEmployeesByDepartaments() {
        List<Employee> employees = employeeService.getAllEmployees();
        return  employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartament)) ;
    }
    }
































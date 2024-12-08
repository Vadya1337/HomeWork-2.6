package pro.sky.HomeWork26.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.HomeWork26.domain.Employee;
import pro.sky.HomeWork26.service.DepartamentService;
import pro.sky.HomeWork26.service.EmployeeService;

import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/departament")
public class DepartamentController {
    private final DepartamentService departamentService;
    private final EmployeeService employeeService;

    public DepartamentController(DepartamentService departamentService, EmployeeService employeeService){
        this.departamentService = departamentService;
        this.employeeService = employeeService;
    }
    @GetMapping("/add-data")
    public  void addTestData() {
        employeeService.addTestData();
        return;
    }
    @GetMapping("/max-salary")
    public Employee getEmployeeWithMaxSalaryByDepartament(@RequestParam("departamentId") String departamentId){
        return  departamentService.getEmployeeWithMaxSalaryByDepartament(departamentId);
    }
    public Employee getEmployeeWithMinSalaryByDepartament(@RequestParam("departamentId") String departamentId){
        return  departamentService.getEmployeeWithMinSalaryByDepartament(departamentId);
    }
@GetMapping("/all")
    public Map<String, List<Employee>> getAllEmployeesByDepartament(@RequestParam(value = "departamentId",required = false)
                                                                    String departamentId) {
        if (departamentId == null) {
            return departamentService.getAllEmployeesByDepartaments();
        }
        return departamentService.getAllEmployeesByDepartament(departamentId);

    }
}



































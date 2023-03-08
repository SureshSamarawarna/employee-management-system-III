package lk.ijse.dep9.employeemanagementsystemIII.service;

import lk.ijse.dep9.employeemanagementsystemIII.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface EmployeeService {
    void save(Employee employee);
    void update(Employee employee);
    void delete(Long id);
    Employee findById(Long id);
    List<Employee> getAllEmployee(String key);
    List<Employee> findEmployeeById(List<Long> id);
    Map<Long, Employee> getAll();
}

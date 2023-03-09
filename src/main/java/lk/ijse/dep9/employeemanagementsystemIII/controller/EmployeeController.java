package lk.ijse.dep9.employeemanagementsystemIII.controller;

import lk.ijse.dep9.employeemanagementsystemIII.model.Employee;
import lk.ijse.dep9.employeemanagementsystemIII.service.EmployeeService;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class EmployeeController {

    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping(value = "save")
    public ResponseEntity<Object> save(@RequestBody Employee employee){
        try{
            employeeService.save(employee);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception e){
            log.error("Save failed.");
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PostMapping(value = "update")
    public ResponseEntity<Object> update(@RequestBody Employee employee){
        try{
            Employee currentEmployee = employeeService.findById(employee.getId());
            if (null != currentEmployee){
                employeeService.update(employee);
                return new ResponseEntity<>(HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }catch (Exception e){
            log.error("Save failed.");
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

    @DeleteMapping(value = "delete")
    public ResponseEntity<Object> delete(@RequestParam("id") Long id){
        try{
            Employee currentEmployee = employeeService.findById(employee.getId());
            if (null != currentEmployee){
                employeeService.delete(id);
                return new ResponseEntity<>(HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }catch (Exception e){
            log.error("Can't delete");
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }
}

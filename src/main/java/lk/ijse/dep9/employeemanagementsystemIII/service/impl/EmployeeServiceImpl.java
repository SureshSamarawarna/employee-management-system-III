package lk.ijse.dep9.employeemanagementsystemIII.service.impl;

import lk.ijse.dep9.employeemanagementsystemIII.model.Employee;
import lk.ijse.dep9.employeemanagementsystemIII.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final String EMPLOYEE_KEY = "Employee";

    private final RedisTemplate<String, Object> redisTemplate;
    private HashOperations<String, Long, Employee> hashOperations;

    public EmployeeServiceImpl(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @PostConstruct
    public void init(){
        hashOperations = redisTemplate.opsForHash();
    }


    @Override
    public void save(Employee employee) {

    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Employee findById(Long id) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployee(String key) {
        return null;
    }

    @Override
    public List<Employee> findEmployeeById(List<Long> id) {
        return null;
    }

    @Override
    public Map<Long, Employee> getAll() {
        return null;
    }
}

package com.wyx.springboot_03.dao;

import com.wyx.springboot_03.pojo.Department;
import com.wyx.springboot_03.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther wyx
 * @date 2021-06-08-15:43
 */
@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;

    @Autowired
    private DepartmentDao departmentDao;
    static {
        employees = new HashMap<Integer, Employee>();
        employees.put(1, new Employee(1, "wyx", "3216ww@qq,com", 1, new DepartmentDao().getDepartmentById(1)));
        employees.put(1, new Employee(2, "zyy", "3216aa@qq,com", 0, new DepartmentDao().getDepartmentById(2)));
        employees.put(1, new Employee(3, "cmy", "3216ss@qq,com", 1, new DepartmentDao().getDepartmentById(3)));
        employees.put(1, new Employee(4, "dpg", "3216ee@qq,com", 0, new DepartmentDao().getDepartmentById(4)));
        employees.put(1, new Employee(5, "awe", "3216ax@qq,com", 1, new DepartmentDao().getDepartmentById(5)));
    }

    private static Integer initId = 10086;

    public void save(Employee employee){
        if(employee.getId() == null){
            employee.setId(initId++);
        }

        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        employees.put(employee.getId(),employee);
    }

    public Collection<Employee> getAll(){
        return employees.values();
    }

    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }

    public void deleteById(Integer id){
        employees.remove(id);
    }
}

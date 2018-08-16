package cn.gezhi.service;

import cn.gezhi.po.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface EmployeeService {
    int addEmployee(Employee employee);
    List<Employee> getAllEmploee();
    Employee getById(int id);
    int update(Employee employee);
    PageInfo<Employee> showeEmployee(int pageNo ,int pageSize);
}

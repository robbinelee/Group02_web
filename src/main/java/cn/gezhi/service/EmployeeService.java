package cn.gezhi.service;

import cn.gezhi.po.Employee;

import java.util.List;

public interface EmployeeService {
    int addEmployee(Employee record);
    List<Employee> selectAll();
    Employee selectById(int id);
    int deleteById(int id);
    int update(Employee record);
}

package cn.gezhi.service;

import cn.gezhi.po.Employee;

public interface EmployeeService {
    int addEmployee(Employee record);
    int selectAll();
}

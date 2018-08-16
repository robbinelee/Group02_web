package cn.gezhi.service.impl;

import cn.gezhi.dao.EmployeeMapper;
import cn.gezhi.po.Employee;
import cn.gezhi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper mapper;

    @Override
    public int addEmployee(Employee record) {
        return mapper.insert(record);
    }

    @Override
    public List<Employee> selectAll() {
        return mapper.selectAllEmployee();
    }


    @Override
    public Employee selectById(int id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteById(int id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Employee record) {
        return mapper.updateByPrimaryKeySelective(record);
    }
}

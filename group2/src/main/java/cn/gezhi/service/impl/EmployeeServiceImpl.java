package cn.gezhi.service.impl;

import cn.gezhi.mapper.EmployeeMapper;
import cn.gezhi.po.Employee;
import cn.gezhi.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper mapper;
    //新增员工数据
    @Override
    public int addEmployee(Employee employee) {
        return mapper.insert(employee);
    }
    //查找所有员工数据
    @Override
    public List<Employee> getAllEmploee() {
        return mapper.selectAllEmployee();
    }
    //根据id查找员工数据
    @Override
    public Employee getById(int id) {
        return mapper.selectByPrimaryKey(id);
    }
    //更新员工数据
    @Override
    public int update(Employee employee) {
        return mapper.updateByPrimaryKeySelective(employee);
    }
    /**
     *  分页显示员工信息列表
     * @param pageNo    当前页数
     * @param pageSize  每页显示数据条数
     */
    @Override
    public PageInfo<Employee> showeEmployee(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Employee> list = mapper.selectAllEmployee();
        PageInfo<Employee> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

}

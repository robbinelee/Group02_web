package cn.gezhi.controller;

import cn.gezhi.po.Employee;
import cn.gezhi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class EmployeeHandler {
    @Autowired
    private EmployeeService service;
    @Autowired
    private HttpServletRequest request;

    @RequestMapping("/employee")
    public ModelAndView getEmployee(int id){
        ModelAndView mav = new ModelAndView();
        Employee employee = service.getById(id);
        mav.addObject("employee",employee);
        return mav;
    }

}

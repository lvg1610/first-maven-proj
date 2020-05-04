package com.lvg.mvc.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.lvg.mvc.entity.Employee;
import com.lvg.mvc.service.EmployeeService;
@Controller
public class EmployeeController 
{
    @Autowired
    EmployeeService eservice;
    public void setEservice(EmployeeService eservice)
    {
    	this.eservice=eservice;
    }
    @RequestMapping("/addEmployee")
    public void addEmployee()
    {
    	eservice.insertEmployee(new Employee(101,"Ajay Saxena",1000));
    }
}

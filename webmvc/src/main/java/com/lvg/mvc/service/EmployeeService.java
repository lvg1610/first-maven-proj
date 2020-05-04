package com.lvg.mvc.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.lvg.mvc.dao.EmployeeDAO;
import com.lvg.mvc.entity.Employee;
@Service
public class EmployeeService 
{
   @Autowired
   EmployeeDAO edao;
   public void setEdao(EmployeeDAO edao)
   {
	   this.edao=edao;
   }
   @Transactional
   public void insertEmployee(Employee emp)
   {
	   edao.save(emp);
   }
}

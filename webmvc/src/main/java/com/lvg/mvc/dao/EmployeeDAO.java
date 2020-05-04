package com.lvg.mvc.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.lvg.mvc.entity.Employee;
@Repository
public interface EmployeeDAO extends CrudRepository<Employee,Integer>
{
    
}

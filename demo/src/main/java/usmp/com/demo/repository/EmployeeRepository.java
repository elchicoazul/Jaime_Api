package usmp.com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import usmp.com.demo.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

    
}
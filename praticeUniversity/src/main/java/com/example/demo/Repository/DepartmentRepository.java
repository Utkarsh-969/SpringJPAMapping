package com.example.demo.Repository;

import com.example.demo.dbo.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}

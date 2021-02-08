package com.example.demo.Repository;

import com.example.demo.dbo.Staff;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface StaffRepository extends PagingAndSortingRepository<Staff,Integer> {
	
}

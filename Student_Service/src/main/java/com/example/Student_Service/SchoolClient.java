package com.example.Student_Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "SCHOOLSERVICE")
public interface SchoolClient {
	 
	@GetMapping("/school/{id}")
	 School getSchoolById(@PathVariable Long id);
	
}

package com.example.bootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bootdemo.dto.EntityProject;
import com.example.bootdemo.repository.ProjectRepository;

@RestController
public class ProjectController 
{
	@Autowired
	ProjectRepository epr;
	
	@PostMapping("/postdata")
	public String savedata(@RequestBody EntityProject ep)
	{
		epr.save(ep);
		return "Data saved";
	}
	
	@GetMapping("/readingdata")
	public List<EntityProject> findById(@RequestParam int id)
	{
		return epr.findById(id);
	}
	
	@PutMapping("/putdata")
	public String dataUpadate(@RequestBody EntityProject project)
	{
		epr.save(project);
		return "Data updated";
	}
	
	@DeleteMapping("/erase")
	public String deleteData(@RequestParam int id)
	{
		epr.deleteById(id);
		return "Data dleted";
	}
}
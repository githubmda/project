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

import com.example.bootdemo.dto.Bus;
import com.example.bootdemo.repository.BusRepository;

@RestController
public class BusController 
{
	@Autowired
	BusRepository bus;
	
	@PostMapping("/stored")
	public String busCreation(@RequestBody Bus b)
	{
		bus.save(b);
		return "Bus Created succesfully";
	}
	
	@PutMapping("/updation")
	public String updateData(@RequestBody Bus bus1)
	{
		bus.save(bus1);
		return "Data updated";
	}
	
	@GetMapping("/getdata")
	public List<Bus> findById(@RequestParam int id)
	{
		return bus.findById(id);
	}
	
	@DeleteMapping("/remove")
	public String deletedata(@RequestParam int id)
	{
		bus.deleteById(id);
		return "Data deleted succesfully";
	}
}
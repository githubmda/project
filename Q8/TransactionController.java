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

import com.example.bootdemo.dto.Transaction;
import com.example.bootdemo.repository.TransactionRepository;

@RestController
public class TransactionController 
{
	@Autowired
	TransactionRepository tr;
	
	@PostMapping("/savetran")
	public String saveTransaction(@RequestBody Transaction tran)
	{
		tr.save(tran);
		return "Data saved";
	}
	
	@GetMapping("/reading")
	public List<Transaction> findById(@RequestParam int id)
	{
		return tr.findById(id);
	}
	
	@PutMapping("/update11")
	public String updateData(@RequestBody Transaction transac)
	{
		tr.save(transac);
		return "Value updated";
	}
	
	@DeleteMapping("/removed")
	public String deletedata(@RequestParam int id)
	{
		tr.deleteById(id);
		return "Deleted succesfully";
	}
}
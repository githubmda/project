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

import com.example.bootdemo.dto.BookStore;
import com.example.bootdemo.repository.BookStoreRepository;

@RestController
public class BookStoreController 
{
	@Autowired
	BookStoreRepository bsr;
	
	@PostMapping("/postdata12")
	public String savedata(@RequestBody BookStore bs)
	{
		bsr.save(bs);
		return "Data saved";
	}
	
	@GetMapping("/readingdata12")
	public List<BookStore> findById(@RequestParam int id)
	{
		return bsr.findById(id);
	}
	
	@PutMapping("/putdata12")
	public String dataUpadate(@RequestBody BookStore bst)
	{
		bsr.save(bst);
		return "Data updated";
	}
	
	@DeleteMapping("/erase12")
	public String deleteData(@RequestParam int id)
	{
		bsr.deleteById(id);
		return "Data dleted";
	}
}
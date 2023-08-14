package com.example.bootdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bootdemo.dto.BookStore;

public interface BookStoreRepository extends JpaRepository<BookStore, Integer>
{
	List<BookStore> findById(int id);
}
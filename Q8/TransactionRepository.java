package com.example.bootdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bootdemo.dto.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>
{
	List<Transaction> findById(int id);
}
package com.example.bootdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bootdemo.dto.Bus;

public interface BusRepository extends JpaRepository<Bus, Integer>
{
	List<Bus> findById(int id);
}
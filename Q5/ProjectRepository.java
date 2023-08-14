package com.example.bootdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bootdemo.dto.EntityProject;

public interface ProjectRepository extends JpaRepository<EntityProject, Integer>
{
	List<EntityProject> findById(int id);
}
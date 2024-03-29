package com.snj.snjback.repositories;

import com.snj.snjback.documents.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ProjectRepository extends JpaRepository<Project, Long> {
}

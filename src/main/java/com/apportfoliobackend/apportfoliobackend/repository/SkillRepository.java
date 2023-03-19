package com.apportfoliobackend.apportfoliobackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apportfoliobackend.apportfoliobackend.model.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long> {

}

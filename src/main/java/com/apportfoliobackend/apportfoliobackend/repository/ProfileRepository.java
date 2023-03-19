package com.apportfoliobackend.apportfoliobackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apportfoliobackend.apportfoliobackend.model.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}

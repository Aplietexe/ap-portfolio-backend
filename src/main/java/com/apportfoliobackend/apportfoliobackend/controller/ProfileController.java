package com.apportfoliobackend.apportfoliobackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apportfoliobackend.apportfoliobackend.model.Profile;
import com.apportfoliobackend.apportfoliobackend.service.IProfileService;

@RestController
@RequestMapping("/profile")
public class ProfileController {
    @Autowired
    private IProfileService profileService;

    @PutMapping("/")
    public void updateProfile(@RequestBody Profile profile) {
        profileService.updateProfile(profile);
    }

    @GetMapping("/")
    public Profile getProfile() {
        return profileService.getProfile();
    }
}

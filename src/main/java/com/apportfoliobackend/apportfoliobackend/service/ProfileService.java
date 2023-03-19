package com.apportfoliobackend.apportfoliobackend.service;

import org.springframework.stereotype.Service;

import com.apportfoliobackend.apportfoliobackend.model.Profile;
import com.apportfoliobackend.apportfoliobackend.repository.ProfileRepository;

@Service
public class ProfileService implements IProfileService {
    public final ProfileRepository profileRepository;

    ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public void updateProfile(Profile profile) {
        profileRepository.save(profile);
    }

    @Override
    public Profile getProfile() {
        return profileRepository.findAll().get(0);
    }

}

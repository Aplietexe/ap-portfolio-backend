package com.apportfoliobackend.apportfoliobackend.service;

import com.apportfoliobackend.apportfoliobackend.model.Profile;

public interface IProfileService {
    void updateProfile(Profile profile);

    Profile getProfile();
}

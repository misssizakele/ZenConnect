package com.example.ZenConnect.profile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, String> {
    Profile findByUser_Id(String userId);
    List<Profile> findAll();
}

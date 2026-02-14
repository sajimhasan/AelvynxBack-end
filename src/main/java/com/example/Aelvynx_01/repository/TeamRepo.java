package com.example.Aelvynx_01.repository;

import com.example.Aelvynx_01.entity.TeamDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepo extends JpaRepository<TeamDetails,Long> {
}

package com.example.Aelvynx_01.repository;

import com.example.Aelvynx_01.dto.TeamPub;
import com.example.Aelvynx_01.entity.TeamDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepo extends JpaRepository<TeamDetails,Long> {

}

package com.example.Aelvynx_01.service;

import com.example.Aelvynx_01.entity.TeamDetails;
import com.example.Aelvynx_01.repository.TeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    private TeamRepo teamRepo;

    public List<TeamDetails> GetallDetailsOfteam(){
        return teamRepo.findAll();
    }

    public TeamDetails postMem(TeamDetails details){
        return teamRepo.save(details);
    }
}

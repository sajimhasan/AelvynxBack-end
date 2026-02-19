package com.example.Aelvynx_01.service;

import com.example.Aelvynx_01.dto.TeamPub;
import com.example.Aelvynx_01.entity.TeamDetails;
import com.example.Aelvynx_01.repository.TeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    @Autowired
    private TeamRepo teamRepo;

    public List<TeamDetails> GetallDetailsOfteam(){
        System.out.println("Team repo called");
        return teamRepo.findAll();
    }

    public List<TeamPub> getDetails() {
        return teamRepo.findAll()
                .stream()
                .map(details -> new TeamPub(
                        details.getUsersId(),
                        details.getFullName(),
                        details.getPosition(),
                        details.getImage()
                ))
                .toList();
    }

    public TeamDetails postMem(TeamDetails details){
        return teamRepo.save(details);
    }

    public TeamDetails UpdateDetails(Long id,TeamDetails details){
        Optional<TeamDetails> optionalDetails= teamRepo.findById(id);
        if(optionalDetails.isPresent()){
            TeamDetails details1= optionalDetails.get();
            details1.setFullName(details.getFullName());
            details1.setAddress(details.getAddress());
            details1.setBloodGroup(details.getBloodGroup());
            details1.setFatherName(details.getFatherName());
            details1.setContact(details.getContact());
            details1.setEmail(details.getEmail());
            details1.setImage(details.getImage());
            details1.setEdBg(details.getEdBg());
            details1.setPosition(details.getPosition());
            return teamRepo.save(details1);
        }
        return null ;
    }
}

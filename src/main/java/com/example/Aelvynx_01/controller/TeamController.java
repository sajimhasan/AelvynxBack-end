package com.example.Aelvynx_01.controller;

import com.example.Aelvynx_01.dto.TeamPub;
import com.example.Aelvynx_01.entity.TeamDetails;
import com.example.Aelvynx_01.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/team")
@CrossOrigin("*")
public class TeamController {
    @Autowired
    private TeamService service;

    @GetMapping("/whole")
    public List<TeamPub> getAll(){
        System.out.println("whole details called");
        return service.getDetails();
    }

    @PostMapping("/add")
    public TeamDetails AddMem( @RequestBody TeamDetails details){
        return service.postMem(details);
    }

    @PutMapping("/world/{id}")
    public TeamDetails changing(@PathVariable  Long id , @RequestBody TeamDetails details){
        return service.UpdateDetails(id,details);
    }
}

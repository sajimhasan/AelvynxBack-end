package com.example.Aelvynx_01.controller;

import com.example.Aelvynx_01.entity.TeamDetails;
import com.example.Aelvynx_01.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/team")
public class TeamController {
    @Autowired
    private TeamService service;

    @GetMapping("/whole")
    public List<TeamDetails> getAll(){
        return service.GetallDetailsOfteam();
    }

    @PostMapping("/add")
    public TeamDetails AddMem( @RequestBody TeamDetails details){
        return service.postMem(details);
    }
}

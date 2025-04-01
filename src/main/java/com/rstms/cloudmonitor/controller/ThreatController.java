package com.rstms.cloudmonitor.controller;

import com.rstms.cloudmonitor.model.*;
import com.rstms.cloudmonitor.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/threats")
@CrossOrigin("*")
public class ThreatController {

    @Autowired
    private ThreatRepository threatRepository;

    @GetMapping("/getallthreats")
    public List<Threat> getAllThreats() {
        return threatRepository.findAll();
    }

    @PostMapping
    public Threat addThreat(@RequestBody Threat threat) {
        return threatRepository.save(threat);
    }
}

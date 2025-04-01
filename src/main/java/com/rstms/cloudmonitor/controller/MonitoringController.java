package com.rstms.cloudmonitor.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/logs")
@CrossOrigin("*")
public class MonitoringController {

    @GetMapping("/getalllogs")
    public List<Map<String, Object>> getLogs() {
        List<Map<String, Object>> logs = new ArrayList<>();
        logs.add(Map.of("name", "CPU Usage", "count", 45));
        logs.add(Map.of("name", "Memory Usage", "count", 70));
        logs.add(Map.of("name", "Network Traffic", "count", 20));
        return logs;
    }
}

package com.rstms.cloudmonitor.model;

import jakarta.persistence.*;

@Entity
@Table(name = "threats")
public class Threat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String severity;

    public Threat() {}

    public Threat(String name, String severity) {
        this.name = name;
        this.severity = severity;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getSeverity() { return severity; }
}

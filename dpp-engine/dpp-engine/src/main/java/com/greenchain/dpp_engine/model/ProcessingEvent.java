package com.greenchain.dpp_engine.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "processing_events")
@Data
public class ProcessingEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    private String location; // e.g., "Mumbai Port", "Farm 55"

    @Enumerated(EnumType.STRING)
    private EventType eventType; // HARVESTING, TRANSPORT, etc.

    private String details; // Extra notes like "Temperature: 25C"

    // --- THE CRITICAL LINK ---
    // Many events belong to One Product
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    @JsonIgnore // Prevents infinite loops when printing JSON
    private Product product;
}
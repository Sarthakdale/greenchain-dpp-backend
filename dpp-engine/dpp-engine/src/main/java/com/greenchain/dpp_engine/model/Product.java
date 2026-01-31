package com.greenchain.dpp_engine.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "products") // This links to your SQL table
@Data // Lombok: Writes all the hidden code for us
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING) // Tells Java to send the text 'RAW_MATERIAL' to SQL
    private ProductType type;

    private Double baseCo2Impact; // Only for raw materials

    private String description;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
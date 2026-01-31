package com.greenchain.dpp_engine.controller;

import com.greenchain.dpp_engine.model.ProcessingEvent;
import com.greenchain.dpp_engine.model.Product;
import com.greenchain.dpp_engine.repository.ProcessingEventRepository;
import com.greenchain.dpp_engine.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private ProcessingEventRepository eventRepository;

    @Autowired
    private ProductRepository productRepository;

    // 1. Add an event to a product (POST)
    // URL example: http://localhost:8080/api/events?productId=1
    @PostMapping
    public ProcessingEvent createEvent(@RequestParam Long productId, @RequestBody ProcessingEvent event) {
        // Find the product (like the Cotton Bale)
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found!"));

        // Link the event to that product
        event.setProduct(product);
        event.setTimestamp(LocalDateTime.now()); // Automatically set the time

        return eventRepository.save(event);
    }

    // 2. Get the history of a product (GET)
    // URL example: http://localhost:8080/api/events?productId=1
    @GetMapping
    public List<ProcessingEvent> getProductHistory(@RequestParam Long productId) {
        return eventRepository.findByProductId(productId);
    }
}
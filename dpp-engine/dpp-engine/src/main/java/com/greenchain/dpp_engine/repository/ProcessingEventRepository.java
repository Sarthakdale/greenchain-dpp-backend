package com.greenchain.dpp_engine.repository;

import com.greenchain.dpp_engine.model.ProcessingEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProcessingEventRepository extends JpaRepository<ProcessingEvent, Long> {
    // This allows us to find all events for a specific product
    // SQL equivalent: SELECT * FROM processing_events WHERE product_id = ?
    List<ProcessingEvent> findByProductId(Long productId);
}
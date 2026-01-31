package com.greenchain.dpp_engine.controller;

import com.greenchain.dpp_engine.model.Product;
import com.greenchain.dpp_engine.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    // 1. Get all products (GET)
    @GetMapping
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    // 2. Create a new product (POST)
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return repository.save(product);
    }
    // --- NEW: Generate QR Code ---
    // URL: GET /api/products/1/qr
    @GetMapping(value = "/{id}/qr", produces = org.springframework.http.MediaType.IMAGE_PNG_VALUE)
    public byte[] generateQRCode(@PathVariable Long id) throws Exception {
        // 1. Find the product
        Product product = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        // 2. Create the data string (What happens when you scan it)
        // For now, let's put the Product Name and ID inside the code
        String qrContent = "Product ID: " + product.getId() + "\nName: " + product.getName() + "\nType: " + product.getType();

        // 3. Generate the Image (200x200 pixels)
        return com.greenchain.dpp_engine.util.QRCodeGenerator.generateQRCode(qrContent, 200, 200);
    }
}
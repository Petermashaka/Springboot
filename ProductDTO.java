package com.example.springbootpostgresqlcrud.model;

public record ProductDTO(Long id, String name, String description, double price) {}
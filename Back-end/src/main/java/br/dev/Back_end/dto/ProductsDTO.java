package br.dev.Back_end.dto;

public record ProductsDTO(
        Long id,
        String productName,
        Double price,
        Integer rate,
        String review
)
{ }

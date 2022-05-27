package com.tintachina84.api.core.product;

public record Product(
    int productId,
    String name,
    int weight,
    String serviceAddress
) {}

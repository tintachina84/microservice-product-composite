package com.tintachina84.api.composite.product;

public record RecommendationSummary(
    int recommendationId,
    String author,
    int rate
) {}

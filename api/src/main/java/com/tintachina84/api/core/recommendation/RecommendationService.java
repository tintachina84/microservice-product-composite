package com.tintachina84.api.core.recommendation;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RecommendationService {

    @PostMapping(
            value    = "/recommendation",
            consumes = "application/json",
            produces = "application/json")
    Mono<Recommendation> createRecommendation(@RequestBody Recommendation body);

    @GetMapping(
            value = "/recommendation",
            produces = "application/json"
    )
    Flux<Recommendation> getRecommendations(
            @RequestParam(value = "productId", required = true) int productId);

    @DeleteMapping(value = "/recommendation")
    Mono<Void> deleteRecommendations(@RequestParam(value = "productId", required = true)  int productId);
}

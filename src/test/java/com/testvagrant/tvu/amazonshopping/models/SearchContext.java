package com.testvagrant.tvu.amazonshopping.models;

import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class SearchContext implements Entity<SearchContext> {
    private String query;

    @Override
    public SearchContext init() {
        return this.toBuilder().query("Nikon 5300")
                .build();
    }
}

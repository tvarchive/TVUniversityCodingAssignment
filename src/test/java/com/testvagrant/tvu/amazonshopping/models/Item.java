package com.testvagrant.tvu.amazonshopping.models;

import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Item implements Entity<Item> {
    private String name;
    private String description;
    private String quantity;
    private String price;
    private String seller;

    @Override
    public Item init() {
        return this.toBuilder()
                .build();
    }
}

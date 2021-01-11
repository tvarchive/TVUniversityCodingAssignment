package com.testvagrant.tvu.amazonshopping.models;

import lombok.*;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Cart implements Entity<Cart> {
    private List<Item> items;
    private double subTotal;


    @Override
    public Cart init() {
        return this.toBuilder()
                .items(Arrays.asList(Item.builder().build().init()))
                .build();
    }
}


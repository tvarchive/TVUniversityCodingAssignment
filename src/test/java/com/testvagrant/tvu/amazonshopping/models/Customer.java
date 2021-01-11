package com.testvagrant.tvu.amazonshopping.models;

import lombok.*;

@Getter @Setter @Builder(toBuilder = true)
@NoArgsConstructor @AllArgsConstructor
public class Customer implements Entity<Customer> {
    private String name;
    private String email;
    private Cart cart;

    @Override
    public Customer init() {
        return this.toBuilder()
                .name(faker.name().firstName())
                .email(faker.internet().emailAddress())
                .cart(new Cart().init())
                .build();
    }
}

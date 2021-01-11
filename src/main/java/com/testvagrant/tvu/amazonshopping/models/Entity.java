package com.testvagrant.tvu.amazonshopping.models;


import com.github.javafaker.Faker;

public interface Entity<Entity> {

    /**
     * Creates entity with random date for test parallelism.
     * Implement only for entities that needs radomness;
     * @return
     */
    default Entity random() { throw new UnsupportedOperationException();}

    Entity init();

    Faker faker = new Faker();
}

package com.testvagrant.tvu.amazonshopping;


import com.testvagrant.tvu.amazonshopping.properties.SystemProperties;

public enum Toggles {
    TIMELINE(SystemProperties.TIMELINE);

    private Boolean active;

    Toggles(Boolean active) {
        this.active = active;
    }

    public Boolean isActive() {
        return active;
    }
}

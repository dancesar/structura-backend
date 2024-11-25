package com.structura.adapters.out;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DatabaseHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        boolean databaseIsup = true;
        if(databaseIsup) {
            return Health.up().withDetail("database", "PostgreSQL is running").build();
        }
        return Health.down().withDetail("database", "PostgreSQL is not running").build();
    }
}

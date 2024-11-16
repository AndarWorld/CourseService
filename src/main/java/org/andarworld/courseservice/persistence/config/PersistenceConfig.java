package org.andarworld.courseservice.persistence.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "org.andarworld.courseservice.persistence.repository")
@EntityScan(basePackages = "org.andarworld.courseservice.persistence.model")
public class PersistenceConfig {
}

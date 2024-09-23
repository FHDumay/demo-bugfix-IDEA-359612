package com.example.demo.defs.repositories;

import com.example.demo.defs.entities.StandardEntity;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.UUID;

@NoRepositoryBean
public interface StandardRepository<T extends StandardEntity<T>> extends AuditedEntityRepository<T, UUID, String, Long> {
}

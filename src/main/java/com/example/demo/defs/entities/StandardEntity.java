package com.example.demo.defs.entities;

import jakarta.persistence.MappedSuperclass;
import org.hibernate.envers.Audited;

import java.util.UUID;

@Audited
@MappedSuperclass
public abstract class StandardEntity<T extends AuditedEntity<T, UUID, String>> extends AuditedEntity<T, UUID, String> {
}

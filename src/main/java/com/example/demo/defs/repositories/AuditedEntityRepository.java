package com.example.demo.defs.repositories;

import com.example.demo.defs.entities.AuditedEntity;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.history.RevisionRepository;

import java.io.Serializable;

@NoRepositoryBean
@SuppressWarnings("java:S119")
public interface AuditedEntityRepository<
        T extends AuditedEntity<T, ID, U>,
        ID extends Serializable, U extends Serializable, N extends Number & Comparable<N>>
        extends BaseEntityRepository<T, ID>, RevisionRepository<T, ID, N> {
}

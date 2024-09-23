package com.example.demo.defs.entities;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.LocalDateTime;


@Audited
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@SuppressWarnings("java:S119")
@Getter
public abstract class AuditedEntity<T extends AuditedEntity<T, ID, U>, ID extends Serializable, U extends Serializable>
        extends BaseEntity<T, ID> {
    @CreatedBy
    private U createdBy;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedBy
    private U lastModifiedBy;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    @Version
    private Integer version;
}

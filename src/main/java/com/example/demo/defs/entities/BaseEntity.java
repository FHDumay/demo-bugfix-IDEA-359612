package com.example.demo.defs.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@MappedSuperclass
@SuppressWarnings("java:S119")
@Getter
@Setter
public abstract class BaseEntity<T, ID extends Serializable> implements Serializable {

    @Transient
    private Class<T> entityClass;

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private ID id;
}

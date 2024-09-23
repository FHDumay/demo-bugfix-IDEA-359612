package com.example.demo.defs.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@MappedSuperclass
@SuppressWarnings("java:S119")
@Getter
@Setter
public abstract class BaseEntity<T extends BaseEntity<T, ID>, ID extends Serializable> implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private ID id;
}

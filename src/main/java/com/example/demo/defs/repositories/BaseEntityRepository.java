package com.example.demo.defs.repositories;

import com.example.demo.defs.entities.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
@SuppressWarnings("java:S119")
public interface BaseEntityRepository<T extends BaseEntity<T, ID>, ID extends Serializable> extends JpaRepository<T, ID> {
}

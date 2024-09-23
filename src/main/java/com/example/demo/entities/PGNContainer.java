package com.example.demo.entities;

import com.example.demo.defs.entities.StandardEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.envers.Audited;
import org.hibernate.type.SqlTypes;

import java.net.URI;
import java.util.LinkedHashSet;
import java.util.Set;

@Audited
@Getter
@Setter
@Entity
@Table(name = "pgn_containers")
public class PGNContainer extends StandardEntity<PGNContainer> {

    @Column(name = "SOURCE_URI", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private URI sourceURI;

    @OneToMany(mappedBy = "pgnContainer", orphanRemoval = true)
    private Set<PGNGame> pgnGame = new LinkedHashSet<>();

}
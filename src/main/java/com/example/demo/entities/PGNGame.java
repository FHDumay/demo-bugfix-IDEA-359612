package com.example.demo.entities;

import com.example.demo.defs.entities.StandardEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

@Audited
@Getter
@Setter
@Entity
@Table(name = "PGN_GAMES")
public class PGNGame extends StandardEntity<PGNGame> {

    @Column(name = "PGN_EVENT_NAME")
    private String event;

    @ManyToOne
    @JoinColumn(name = "PGN_CONTAINER_ID")
    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    private PGNContainer pgnContainer;
}
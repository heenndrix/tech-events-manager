package dev.hendrix.tech.events.manager.domain.address;

import dev.hendrix.tech.events.manager.domain.event.Event;
import jakarta.persistence.*;

import java.util.UUID;

@Table(name = "addresses")
@Entity

public class Address {

    @Id
    @GeneratedValue
    private UUID id;
    private String city;
    private String uf;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;


}

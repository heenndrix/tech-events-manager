package dev.hendrix.tech.events.manager.repository;

import dev.hendrix.tech.events.manager.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {

}

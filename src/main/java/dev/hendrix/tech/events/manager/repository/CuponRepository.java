package dev.hendrix.tech.events.manager.repository;

import dev.hendrix.tech.events.manager.domain.cupon.Cupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CuponRepository extends JpaRepository<Cupon, UUID> {
}

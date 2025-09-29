package com.rtech.eventos.repository;

import com.rtech.eventos.domain.Event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
}

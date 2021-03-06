package com.alexchern.rentahouse.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface BaseRepository<ENTITY> extends JpaRepository <ENTITY, Long> {

    Optional<ENTITY> findById(long entityId);
}

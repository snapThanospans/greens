package com.greens.greens_backend.repository;

import com.greens.greens_backend.entity.MicroGreens;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MicroGreensRepository extends JpaRepository<MicroGreens, Long> {
}

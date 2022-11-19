package com.cibertec.huellitas.repository;

import com.cibertec.huellitas.model.Locales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalesRepository extends JpaRepository<Locales, Long> {
}

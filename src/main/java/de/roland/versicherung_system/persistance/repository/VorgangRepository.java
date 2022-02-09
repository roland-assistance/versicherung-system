package de.roland.versicherung_system.persistance.repository;

import de.roland.versicherung_system.persistance.entity.VorgangEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VorgangRepository extends JpaRepository<VorgangEntity, Long> {
}

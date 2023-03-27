package ru.mycompany.smarthome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mycompany.smarthome.model.SmartKettle;

@Repository
public interface SmartKettleRepository extends JpaRepository<SmartKettle, Long> {
}

package com.devsuperior.crud.repositories;

import com.devsuperior.crud.etities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

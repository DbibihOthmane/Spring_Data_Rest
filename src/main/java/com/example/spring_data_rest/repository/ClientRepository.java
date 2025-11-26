package com.example.spring_data_rest.repository;



import com.example.spring_data_rest.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

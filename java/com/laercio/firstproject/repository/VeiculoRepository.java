package com.laercio.firstproject.repository;

import com.laercio.firstproject.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo , Long> {

    List<Veiculo> findByidusuario (Long idusuario);
}

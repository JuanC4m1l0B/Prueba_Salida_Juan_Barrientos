package model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.entity.Factura;

public interface IFacturaRepository extends JpaRepository<Factura, Integer>{

}

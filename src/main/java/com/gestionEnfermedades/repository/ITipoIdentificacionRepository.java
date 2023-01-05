package com.gestionEnfermedades.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionEnfermedades.model.TipoIdentificacion;

@Repository
public interface ITipoIdentificacionRepository  extends JpaRepository<TipoIdentificacion, Integer>{

}

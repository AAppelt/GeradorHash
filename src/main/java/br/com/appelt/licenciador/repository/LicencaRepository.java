package br.com.appelt.licenciador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.appelt.licenciador.model.Licenca;

public interface LicencaRepository extends JpaRepository<Licenca, Integer> {

}
package br.com.appelt.licenciador.service;

import java.security.NoSuchAlgorithmException;

import br.com.appelt.licenciador.model.Licenca;

public interface LicencaService {

    Licenca gerarLicenca(String cnpj) throws NoSuchAlgorithmException;

}
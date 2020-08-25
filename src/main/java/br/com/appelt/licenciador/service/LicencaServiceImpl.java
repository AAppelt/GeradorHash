package br.com.appelt.licenciador.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;

import javax.xml.bind.DatatypeConverter;

import org.springframework.stereotype.Service;

import br.com.appelt.licenciador.model.Licenca;

@Service
public class LicencaServiceImpl implements LicencaService {

    @Override
    public Licenca gerarLicenca(String cnpj) throws NoSuchAlgorithmException {

        LocalDate date = LocalDate.now().plusDays(30);
        String cnpjdata = cnpj + '-' + date;

        final MessageDigest mDigest = MessageDigest.getInstance("MD5");
        mDigest.update(cnpjdata.getBytes());
        byte[] digest = mDigest.digest();
        String myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();

        Licenca licenca = new Licenca();
        licenca.setId(1);
        licenca.setVencimento(date);
        licenca.setHash(myHash);

        return licenca;

    }

}
package br.com.appelt.licenciador.service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class LicencaServiceImpl implements LicencaService {

    @Override
    public void gerarLicenca() {

        String originalString;

        final MessageDigest digest = MessageDigest.getInstance(SHA3_256);
        final byte[] hashbytes = digest.digest(originalString.getBytes(StandardCharsets.UTF_8));
        String sha3_256hex = bytesToHex(hashbytes);

    }

}
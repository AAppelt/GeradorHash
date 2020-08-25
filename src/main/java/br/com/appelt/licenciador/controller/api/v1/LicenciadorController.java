package br.com.appelt.licenciador.controller.api.v1;

import java.security.NoSuchAlgorithmException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.appelt.licenciador.model.Licenca;
import br.com.appelt.licenciador.service.LicencaService;

@RestController
@RequestMapping(path = "/v1/licenciador")
public class LicenciadorController {

    private final LicencaService licencaService;

    public LicenciadorController(LicencaService licencaService) {
        this.licencaService = licencaService;
    }

    @GetMapping
    public Licenca buscarLicenca(@RequestParam(name = "cnpj", required = true) String cnpj,
            @RequestParam(name = "razao", required = false) String razao) {
        Licenca licenca = new Licenca();

        try {
            licenca = this.licencaService.gerarLicenca(cnpj);
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return licenca;

    }

}
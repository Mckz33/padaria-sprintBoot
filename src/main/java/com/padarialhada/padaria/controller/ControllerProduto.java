package com.padarialhada.padaria.controller;

import com.padarialhada.padaria.service.ServiceProduto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/programa")

public class ControllerProduto {
    final ServiceProduto serviceProduto;

    public ControllerProduto(ServiceProduto serviceProduto) {
        this.serviceProduto = serviceProduto;
    }
}

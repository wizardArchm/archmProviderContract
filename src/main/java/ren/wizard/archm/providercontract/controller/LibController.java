package ren.wizard.archm.providercontract.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lib")
public interface LibController {

    @GetMapping("/")
    String testLibGet();
}

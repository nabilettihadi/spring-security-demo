package ma.nabil.spring_security_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/public/test")
    public String publicEndpoint() {
        return "Accès public";
    }

    @GetMapping("/admin/test")
    public String adminEndpoint() {
        return "Accès admin uniquement";
    }

    @GetMapping("/user/test")
    public String userEndpoint() {
        return "Accès utilisateur authentifié";
    }
} 
package br.com.fateczonasul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {

    @Autowired
    @Qualifier("appNome")
    private String appNome;

    @Autowired
    @Qualifier("appEmail")
    private String appEmail;

    @Autowired
    @Qualifier("appTelefone")
    private String appTelefone;

    @GetMapping("/")
    public String index(){
        return "Projeto com Configuration e IoC";
    }

    @GetMapping("/rota1")
    public String rota1(){
        return appNome;
    }

    @GetMapping("/rota2")
    public String rota2(){
        return appEmail;
    }

    @GetMapping("/rota3")
    public String rota3(){
        return appTelefone;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
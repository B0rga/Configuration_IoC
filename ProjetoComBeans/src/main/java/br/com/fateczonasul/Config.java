package br.com.fateczonasul;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(name = "appNome")
    public String appNome(){
        return "Beatriz";
    }

    @Bean(name = "appEmail")
    public String appEmail(){
        return "beadograu@gmail.com";
    }

    @Bean(name = "appTelefone")
    public String appTelefone(){
        return "(11)98733-3214";
    }
}
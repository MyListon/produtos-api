package com.soulcode.produtosapi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
//    @RequestMapping(value = "/elastech", method = RequestMethod.GET)
//    @ResponseBody
//    public String paginaelastech(@RequestParam String nome, @RequestParam int idade) {
//        if (idade >= 18) {
//            return "Ola " + nome + " você tem " + idade + ", você pode participar do processo seletivo.";
//        } else {
//            return "Ola " + nome + " você tem " + idade + ", você não pode participar do processo seletivo.";
//        }
//    }

    @RequestMapping(value = "/elastech", method = RequestMethod.POST)
    public String paginaelastech(@RequestParam String nome , @RequestParam int idade , Model model){
        if(idade >= 18){
            model.addAttribute("nome", nome);
            model.addAttribute("idade", idade);
            return "maior-idade";
        }else{
            int anosRestantes = 18 - idade;
            model.addAttribute("nome", nome);
            model.addAttribute("idade", idade);
            model.addAttribute("anosRestantes", anosRestantes);
            return "menor-idade";
        }
    }

    @GetMapping ("/soulcode")
    @ResponseBody
    public String paginasoulcode(){
        return "SoulCode pagina teste";
    }

    @GetMapping ("/cadastro-produto")
    public String cadastroproduto(){
        return "cadastro";
    }

    @GetMapping ("/cadastro-usuario")
    public String cadastrousuario(){
        return "cadastro-usuario";
    }

    @GetMapping ("/menu")
    public String menu(){
        return "menu";
    }

}

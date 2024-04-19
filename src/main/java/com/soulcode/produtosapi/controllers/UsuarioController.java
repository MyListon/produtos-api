package com.soulcode.produtosapi.controllers;

import com.soulcode.produtosapi.models.Usuario;
import com.soulcode.produtosapi.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @RequestMapping(value = "/usuario", method = RequestMethod.GET)
    public Usuario save() {
        Usuario u = new Usuario();
        u.setNome("Myriam");
        u.setEmail("myriam.perdiza@gmail.com");
        u.setIdade(10);
        u = this.usuarioRepository.save(u);
        return u;
    }


}

package com.example.sesijwt.Controller;

import com.example.sesijwt.Entities.Usuario;
import com.example.sesijwt.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> listarUsuarios() {return usuarioRepository.findAll();}

    @PostMapping
    public ResponseEntity<Usuario> adicionarUsuario(@RequestBody Usuario usuario) {
    Usuario usuarioSalvo = usuarioRepository.save(usuario);
        return ResponseEntity.ok(usuarioSalvo);
    }

}

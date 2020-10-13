package com.projet.grh.services;

import com.projet.grh.models.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.projet.grh.repository.UtilisateurRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest/users")
public class UtilisateursService {
    @Autowired
    UtilisateurRepository utilisateurRepository;

    @GetMapping("/all")
    public List<Utilisateur> getAll(){
        return utilisateurRepository.findAll();
    }
    @GetMapping("/one=={id}")
    public Optional<Utilisateur> getOne(@PathVariable int id){
        return utilisateurRepository.findById(id);
    }

    @PostMapping ("/load")
    public List<Utilisateur> saveUser(@RequestBody final Utilisateur user){
        utilisateurRepository.save(user);
        return utilisateurRepository.findAll();
    }
}

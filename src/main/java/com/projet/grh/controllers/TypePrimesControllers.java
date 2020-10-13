package com.projet.grh.controllers;

import com.projet.grh.services.ServicesInterfaces.TypePrimesService;
import com.projet.grh.models.TypePrimes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TypePrimesControllers {
    @Autowired
    private TypePrimesService typePrimesService;

    //creer
    @PostMapping("/api/typePrime-create")
    public ResponseEntity<?> createTypePrimes(@RequestBody TypePrimes typePrimes){
        return new ResponseEntity<>(typePrimesService.saveTypePrimes(typePrimes), HttpStatus.CREATED);
    }

    //modifier
    @PutMapping("/api/typePrime-update")
    public ResponseEntity<?> updateTypePrimes(@RequestBody TypePrimes typePrimes){
        return new ResponseEntity<>(typePrimesService.updateTypePrimes(typePrimes), HttpStatus.CREATED);
    }

    //supprimer
    @PostMapping("/api/typePrime-delete")
    public ResponseEntity<?> deleteTypePrimes(@RequestBody TypePrimes typePrimes){
        typePrimesService.deleteTypePrimes(typePrimes.getId());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //afficher
    @GetMapping("/api/typePrime-all")
    public ResponseEntity<?> findAllTypePrimess(){
        return new ResponseEntity<>(typePrimesService.findAllTypePrimes(), HttpStatus.OK);
    }

}

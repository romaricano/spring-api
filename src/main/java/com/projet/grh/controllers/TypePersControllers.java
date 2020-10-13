package com.projet.grh.controllers;

import com.projet.grh.models.TypePers;
import com.projet.grh.services.ServicesInterfaces.TypePersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TypePersControllers {
    @Autowired
    private TypePersService typePersService;

    //creer
    @PostMapping("/api/typePers")
    public ResponseEntity<?> createTypePers(@RequestBody TypePers typePers){
        return new ResponseEntity<>(typePersService.saveTypePers(typePers), HttpStatus.CREATED);
    }

    //modifier
    @PutMapping("/api/typePers")
    public ResponseEntity<?> updateTypePers(@RequestBody TypePers typePers){
        return new ResponseEntity<>(typePersService.updateTypePers(typePers), HttpStatus.CREATED);
    }

    //supprimer
    @DeleteMapping("/api/typePers")
    public ResponseEntity<?> deleteTypePers(@RequestBody TypePers typePers){
        typePersService.deleteTypePers(typePers.getId());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //afficher
    @GetMapping("/api/typePers")
    public ResponseEntity<?> findAllTypePers(){
        return new ResponseEntity<>(typePersService.findAllTypePers(), HttpStatus.OK);
    }

}



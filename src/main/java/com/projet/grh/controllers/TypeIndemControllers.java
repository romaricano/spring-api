package com.projet.grh.controllers;

import com.projet.grh.models.TypeIndem;
import com.projet.grh.services.ServicesInterfaces.TypeIndemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TypeIndemControllers {
    @Autowired
    private TypeIndemService typeIndemService;

    //creer
    @PostMapping("/api/typeIndem-create")
    public ResponseEntity<?> createTypeIndem(@RequestBody TypeIndem typeIndem){
        return new ResponseEntity<>(typeIndemService.saveTypeIndem(typeIndem), HttpStatus.CREATED);
    }

    //modifier
    @PutMapping("/api/typeIndem-update")
    public ResponseEntity<?> updateTypeIndem(@RequestBody TypeIndem typeIndem){
        return new ResponseEntity<>(typeIndemService.updateTypeIndem(typeIndem), HttpStatus.CREATED);
    }

    //supprimer
    @PostMapping("/api/typeIndem-delete")
    public ResponseEntity<?> deleteTypeIndem(@RequestBody TypeIndem typeIndem){
        typeIndemService.deleteTypeIndem(typeIndem.getId());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //afficher
    @GetMapping("/api/typeIndem-all")
    public ResponseEntity<?> findAllTypeIndem(){
        return new ResponseEntity<>(typeIndemService.findAllTypeIndem(), HttpStatus.OK);
    }

}


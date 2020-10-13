package com.projet.grh.controllers;

import com.projet.grh.models.TypeMessage;
import com.projet.grh.services.ServicesInterfaces.TypeMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TypeMessageControllers {

    @Autowired
    private TypeMessageService typeMessageService;

    //creer
    @PostMapping("/api/typeMessage-create")
    public ResponseEntity<?> createTypeMessage(@RequestBody TypeMessage typeMessage){
        return new ResponseEntity<>(typeMessageService.saveTypeMessage(typeMessage), HttpStatus.CREATED);
    }

    //modifier
    @PutMapping("/api/typeMessage-update")
    public ResponseEntity<?> updateTypeMessage(@RequestBody TypeMessage typeMessage){
        return new ResponseEntity<>(typeMessageService.updateTypeMessage(typeMessage), HttpStatus.CREATED);
    }

    //supprimer
    @PostMapping("/api/typeMessage-delete")
    public ResponseEntity<?> deleteTypeMessage(@RequestBody TypeMessage typeMessage){
        typeMessageService.deleteTypeMessage(typeMessage.getId());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //afficher
    @GetMapping("/api/typeMessage-all")
    public ResponseEntity<?> findAllTypeMessage(){
        return new ResponseEntity<>(typeMessageService.findAllTypeMessage(), HttpStatus.OK);
    }

}

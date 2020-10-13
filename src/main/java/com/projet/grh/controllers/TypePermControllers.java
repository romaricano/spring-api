package com.projet.grh.controllers;

import com.projet.grh.models.TypePerm;
import com.projet.grh.services.ServicesInterfaces.TypePermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TypePermControllers {
    @Autowired
    private TypePermService typePermService;

    //creer
    @PostMapping("/api/typePerm")
    public ResponseEntity<?> createTypePerm(@RequestBody TypePerm typePerm){
        return new ResponseEntity<>(typePermService.saveTypePerm(typePerm), HttpStatus.CREATED);
    }
    //modifier
    @PutMapping("/api/typePerm")
    public ResponseEntity<?> updateTypePerm(@RequestBody TypePerm typePerm){
        return new ResponseEntity<>(typePermService.updateTypePerm(typePerm), HttpStatus.CREATED);
    }

    //supprimer
//    @DeleteMapping("/api/typePerm")
//    public void deleteTypePerm(@RequestBody long id){
//        typePermService.deleteTypePerm(id);
//    }

    @DeleteMapping("/api/typePerm")
    public ResponseEntity<?> deleteTypePerm(@RequestBody TypePerm typePerm){
        typePermService.deleteTypePerm(typePerm.getId());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //afficher
    @GetMapping("/api/typePerm")
    public ResponseEntity<?> findAllTypePerm(){
        return new ResponseEntity<>(typePermService.findAllTypePerm(), HttpStatus.OK);
    }

}

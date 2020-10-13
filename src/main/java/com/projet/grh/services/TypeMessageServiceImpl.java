package com.projet.grh.services;

import com.projet.grh.services.ServicesInterfaces.TypeMessageService;
import com.projet.grh.models.TypeMessage;
import com.projet.grh.repository.TypeMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeMessageServiceImpl implements TypeMessageService {

    @Autowired
    private TypeMessageRepository typeMessageRepository;

    @Override
    public TypeMessage saveTypeMessage(final TypeMessage TypeMessage){
        typeMessageRepository.save(TypeMessage);
        return TypeMessage;
    }

    @Override
    public TypeMessage updateTypeMessage(final TypeMessage typemessage){
        return typeMessageRepository.save(typemessage);
    }

    @Override
    public void deleteTypeMessage(final Long TypeMessageId){
        typeMessageRepository.deleteById(TypeMessageId);
    }

    @Override
    public List<TypeMessage> findAllTypeMessage(){
        return typeMessageRepository.findAll();
    }

    @Override
    public Long nombreTypeMessage(){
        return typeMessageRepository.count();
    }

}


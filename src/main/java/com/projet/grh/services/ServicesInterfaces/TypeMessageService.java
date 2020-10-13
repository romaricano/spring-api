package com.projet.grh.services.ServicesInterfaces;

import com.projet.grh.models.TypeMessage;

import java.util.List;

public interface TypeMessageService {
    TypeMessage saveTypeMessage(TypeMessage typemessage);

    TypeMessage updateTypeMessage(TypeMessage typemessage);

    void deleteTypeMessage(Long TypeMessageId);

    List<TypeMessage> findAllTypeMessage();

    Long nombreTypeMessage();
}


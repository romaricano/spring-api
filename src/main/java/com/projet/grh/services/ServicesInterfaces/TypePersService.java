package com.projet.grh.services.ServicesInterfaces;

import com.projet.grh.models.TypePers;

import java.util.List;

public interface TypePersService {
    TypePers saveTypePers(TypePers typePers);

    TypePers updateTypePers(TypePers typepers);

    void deleteTypePers(long TypePersId);

    List<TypePers> findAllTypePers();

    Long nombreTypePers();
}

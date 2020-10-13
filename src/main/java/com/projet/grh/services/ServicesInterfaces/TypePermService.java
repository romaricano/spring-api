package com.projet.grh.services.ServicesInterfaces;

import com.projet.grh.models.TypePerm;

import java.util.List;

public interface TypePermService {

    TypePerm saveTypePerm(TypePerm typeperm);

    TypePerm updateTypePerm(TypePerm typeperm);

    void deleteTypePerm(Long TypePermId);

    List<TypePerm> findAllTypePerm();

    Long nombreTypePerm();
}


package com.projet.grh.services.ServicesInterfaces;

import com.projet.grh.models.TypePrimes;

import java.util.List;

public interface TypePrimesService {
    TypePrimes saveTypePrimes(TypePrimes typeprimes);

    TypePrimes updateTypePrimes(TypePrimes typeprimes);

    void deleteTypePrimes(Long TyepPrimesId);

    List<TypePrimes> findAllTypePrimes();

    Long nombreTypePrimes();
}

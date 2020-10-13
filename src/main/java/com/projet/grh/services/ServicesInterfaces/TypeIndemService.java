package com.projet.grh.services.ServicesInterfaces;

import com.projet.grh.models.TypeIndem;

import java.util.List;

public interface TypeIndemService {
    TypeIndem saveTypeIndem(TypeIndem typeIndem);

    TypeIndem updateTypeIndem(TypeIndem typeIndem);

    void deleteTypeIndem(Long TypeIndemId);

    List<TypeIndem> findAllTypeIndem();

    Long nombreTypeIndem();

}


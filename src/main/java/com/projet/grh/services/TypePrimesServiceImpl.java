package com.projet.grh.services;
import com.projet.grh.models.TypePrimes;
import com.projet.grh.services.ServicesInterfaces.TypePrimesService;
import com.projet.grh.repository.TypePrimesRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypePrimesServiceImpl implements TypePrimesService {

    @Autowired
    private TypePrimesRespository typePrimesRespository;

    @Override
    public TypePrimes saveTypePrimes(final TypePrimes typeprimes){
        typePrimesRespository.save(typeprimes);
        return typeprimes;
    }

    @Override
    public TypePrimes updateTypePrimes(final TypePrimes typeprimes){
        return typePrimesRespository.save(typeprimes);
    }

    @Override
    public void deleteTypePrimes(final Long TyepPrimesId){
        typePrimesRespository.deleteById(TyepPrimesId);
    }

    @Override
    public List<TypePrimes> findAllTypePrimes(){
        return typePrimesRespository.findAll();
    }

    @Override
    public Long nombreTypePrimes(){
        return typePrimesRespository.count();
    }

}

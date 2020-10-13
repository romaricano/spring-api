package com.projet.grh.services;

import com.projet.grh.services.ServicesInterfaces.TypeIndemService;
import com.projet.grh.models.TypeIndem;
import com.projet.grh.repository.TypeIndemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeIndemServiceImpl implements TypeIndemService {

    @Autowired
    private TypeIndemRepository typeIndemRepository;

    @Override
    public TypeIndem saveTypeIndem(final TypeIndem typeIndem){
        typeIndemRepository.save(typeIndem);
        return typeIndem;
    }

    @Override
    public TypeIndem updateTypeIndem(final TypeIndem typeIndem){
        return typeIndemRepository.save(typeIndem);
    }

    @Override
    public void deleteTypeIndem(final Long TypeIndemId){
        typeIndemRepository.deleteById(TypeIndemId);
    }

    @Override
    public List<TypeIndem> findAllTypeIndem(){
        return typeIndemRepository.findAll();
    }

    @Override
    public Long nombreTypeIndem(){
        return typeIndemRepository.count();
    }

}


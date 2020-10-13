package com.projet.grh.services;

import com.projet.grh.services.ServicesInterfaces.TypePermService;
import com.projet.grh.models.TypePerm;
import com.projet.grh.repository.TypePermRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypePermServiceImpl implements TypePermService {

    @Autowired
    private TypePermRepository typePermRespository;

    @Override
    public TypePerm saveTypePerm(final TypePerm typeperm) {
        return typePermRespository.save(typeperm);
    }

    @Override
    public TypePerm updateTypePerm(TypePerm typeperm) {
        return typePermRespository.save(typeperm);
    }

    @Override
    public void deleteTypePerm(Long TypePermId) {
        typePermRespository.deleteById(TypePermId);
    }

    @Override
    public List<TypePerm> findAllTypePerm() {
        return typePermRespository.findAll();
    }

    @Override
    public Long nombreTypePerm() {
        return typePermRespository.count();
    }
}


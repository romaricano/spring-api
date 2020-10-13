package com.projet.grh.services;

import com.projet.grh.models.TypePers;
import com.projet.grh.repository.TypePersRepository;
import com.projet.grh.services.ServicesInterfaces.TypePersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypePersServiceImpl implements TypePersService {

    @Autowired
    private TypePersRepository typePersRespository;

    @Override
    public TypePers saveTypePers(final TypePers typepers){
        typePersRespository.save(typepers);
        return typepers;
    }

    @Override
    public TypePers updateTypePers(TypePers typepers) {
        return typePersRespository.save(typepers);
    }

    @Override
    public void deleteTypePers(long TypePersId) {
        typePersRespository.deleteById(TypePersId);
    }

    @Override
    public List<TypePers> findAllTypePers() {
        return typePersRespository.findAll();
    }

    @Override
    public Long nombreTypePers(){
        return typePersRespository.count();
    }

}

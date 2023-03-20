package com.HIITENFA.dynamoss.service;

import com.HIITENFA.dynamoss.model.Pctools;
import com.HIITENFA.dynamoss.repository.PctoolsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PctoolsService {
    private final PctoolsRepository pctools;

    public void save(Pctools data) {
        pctools.save(data);
    }

    public List<Pctools> findAll(){
        return pctools.findAll();
    }

    public Optional<Pctools> findById(String id){
        return pctools.findById(id);
    }

    public void deleteById(String id){
        pctools.deleteById(id);
    }

    public Pctools findByField(String cod) {

        Pctools data = new Pctools();

        try {

            for (Pctools pc: this.findAll()){
                if(pc.getCod().equals(cod.toUpperCase())){
                    data.setCod(pc.getCod());
                    data.setDescripcion(pc.getDescripcion());
                    data.setFamilia(pc.getFamilia());
                    data.setNombre_corto(pc.getNombre_corto());
                    data.setPvp(pc.getPvp());
                    data.setStock(pc.getStock());
                    data.set_id(pc.get_id());
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return data;
    }

}

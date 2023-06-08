package com.HIITENFA.dynamoss.controller;

import com.HIITENFA.dynamoss.model.Pctools;
import com.HIITENFA.dynamoss.service.PctoolsService;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class PctoolsControllerTest {

    @InjectMocks
    PctoolsController demo;

    @Mock
    PctoolsService pctoolsService;

    List<Pctools> pclist;

    @BeforeEach
    void Inicializar(){
        MockitoAnnotations.openMocks(this);

        pclist = new ArrayList<>();
        Pctools pctools = new Pctools();

        pctools.set_id(new ObjectId());
        pctools.setCod("");
        pctools.setStock("");
        pctools.setFamilia("");
        pctools.setPvp("");
        pctools.setDescripcion("");
        pctools.setNombre_corto("");

        pclist.add(pctools);

        when(pctoolsService.findAll()).thenReturn(pclist);
    }

    @Test
    void findAllTest(){
        List<Pctools> result = demo.findAll();
        assertEquals(result,pclist);
    }
}

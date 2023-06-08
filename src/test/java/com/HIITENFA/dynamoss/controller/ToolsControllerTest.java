package com.HIITENFA.dynamoss.controller;

import com.HIITENFA.dynamoss.model.Pctools;
import com.HIITENFA.dynamoss.service.PctoolsService;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ToolsControllerTest {

    @InjectMocks
    PctoolsController demo;

    @Mock
    PctoolsService pctoolsService;

    List<Pctools> plist;

    @BeforeEach
    void initializer(){
        MockitoAnnotations.openMocks(this);

        plist = new ArrayList<>();
        Pctools pctools = new Pctools();

        pctools.set_id(new ObjectId());
        pctools.setCod("");
        pctools.setStock("");
        pctools.setFamilia("");
        pctools.setPvp("");
        pctools.setDescripcion("");
        pctools.setNombre_corto("");

        plist.add(pctools);

        when(pctoolsService.findAll()).thenReturn(plist);
    }

    @Test
    void findAllTest(){
        List<Pctools> result = demo.findAll();
        assertEquals(result, plist);
    }
}

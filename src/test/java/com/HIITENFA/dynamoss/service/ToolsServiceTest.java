package com.HIITENFA.dynamoss.service;

import com.HIITENFA.dynamoss.model.Pctools;
import com.HIITENFA.dynamoss.repository.PctoolsRepository;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class ToolsServiceTest {
    @InjectMocks
    PctoolsService demo;

    @Mock
    PctoolsRepository toolsRepository;

    Pctools toolsMock = mock(Pctools.class);

    List<Pctools> plist;

    Pctools pctools;

    @BeforeEach
    void initializer(){
        MockitoAnnotations.openMocks(this);

        plist = new ArrayList<>();
        pctools = new Pctools();

        pctools.set_id(new ObjectId());
        pctools.setCod("");
        pctools.setStock("");
        pctools.setFamilia("");
        pctools.setPvp("");
        pctools.setDescripcion("");
        pctools.setNombre_corto("");

        plist.add(pctools);

        when(toolsRepository.findAll()).thenReturn(plist);
        when(toolsRepository.findById(anyString())).thenReturn(Optional.ofNullable(pctools));
    }

    @Test
    void findAllTest(){
        List<Pctools> result = demo.findAll();
        assertEquals(plist, result);
    }

    @Test
    void findByIdTest(){
        Optional<Pctools> result = demo.findById("");
        assertEquals(Optional.ofNullable(pctools), result);
    }

    @Test
    void findByFieldTest() {
        Pctools result = demo.findByField("");
        assertEquals(pctools, result);
    }

    @Test
    void saveTest(){
        demo.save(toolsMock);
        verify(toolsRepository,times(1)).save(toolsMock);
    }

    @Test
    void deleteTest(){
        demo.deleteById("");
        verify(toolsRepository,times(1)).deleteById(anyString());
    }



}

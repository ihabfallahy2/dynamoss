package com.HIITENFA.dynamoss.controller;

import com.HIITENFA.dynamoss.model.Pctools;
import com.HIITENFA.dynamoss.service.PctoolsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class PctoolsController {

    private final PctoolsService pctoolsService;

    @PostMapping("/pctools")
    public void save(Pctools data){
        pctoolsService.save(data);
    }

    @GetMapping("/pctools")
    public List<Pctools> findAll(){
        return pctoolsService.findAll();
    }

    @GetMapping("/pctools/cod/{cod}")
    public Pctools findByCod(@PathVariable String cod){return pctoolsService.findByField(cod);}

    @DeleteMapping("/pctools/{id}")
    public void deleteById(@PathVariable String id){
        pctoolsService.deleteById(id);
    }
}

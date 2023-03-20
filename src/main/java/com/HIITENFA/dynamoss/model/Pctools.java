package com.HIITENFA.dynamoss.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "PCTOOLS")
@Data
public class Pctools {

    @Id
    private ObjectId _id;
    private String cod;
    private String descripcion;
    private String familia;
    private String nombre_corto;
    private String pvp;
    private String stock;
}

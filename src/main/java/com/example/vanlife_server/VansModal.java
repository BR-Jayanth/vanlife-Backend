package com.example.vanlife_server;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vans")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VansModal {

    @Id
    private ObjectId id;
    private String name;
    private int price;
    private String description;
    private String imageUrl;
    private String type;
    private String hostId;
    private String vanId;

}

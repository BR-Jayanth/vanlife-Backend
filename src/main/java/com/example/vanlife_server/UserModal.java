package com.example.vanlife_server;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import java.util.Collections;

@Document(collection = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModal {
    @Id
    private ObjectId id;
    private  String email;
    private String password;
    private String name;
    private String hostId;
}

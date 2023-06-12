package model;



import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class User {

    private final UUID id = UUID.fromString("id");
    private String pseudo;
    private String email;
    private Date dateNaissance;
    private String password;
    private String tel;
}

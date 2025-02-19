package arabianLogistics.ArabianLogistics.data.model;


import arabianLogistics.ArabianLogistics.data.constants.Role;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.FetchType.EAGER;

@Setter
@Getter
@Entity
@Table(name = "_users")
public class User{
    @Id
    @GeneratedValue
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private String imageUrl;
    @ElementCollection(fetch=EAGER)
    @Enumerated(STRING)
    private Set<Role> roles;
    @Setter(AccessLevel.NONE)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime createdAt;

    @Setter(AccessLevel.NONE)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime updatedAt;
    
}
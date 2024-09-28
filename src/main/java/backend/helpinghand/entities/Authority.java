package backend.helpinghand.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name="authorities")
public class Authority {
    @Id
    //ola
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Nuevo
    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "authorities")
    private List<User> users;
}

package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Cliente {

    private String dni;
    private String nombre;
    private String telefono;
    private String email;
}

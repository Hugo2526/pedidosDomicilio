package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Plato {

    private Integer id;
    private String nombre;
    private double precio;
    private String descripcion;

}

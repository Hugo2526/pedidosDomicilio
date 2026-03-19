package entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Pedido {

    private static long count = 0;

    private Long id;
    private Cliente cliente;
    private String direccion;
    private LocalDate fecha;
    private EstadoPedido estado;
    private List<Plato> platos;

    public Pedido(Cliente cliente, String direccion) {
        this.cliente = cliente;
        this.direccion = direccion;
        this.id = count++;
        this.fecha = LocalDate.now();
        this.estado = EstadoPedido.PENDIENTE;
        this.platos = new ArrayList<>();
    }

    public String mostrarPedido() {
        StringBuffer sb = new StringBuffer();
        sb.append("Pedido: ").append(id).append("\n");
        sb.append("Cliente: ").append(cliente.getNombre()).append("\n");
        sb.append("Dirección: ").append(direccion).append("\n");
        sb.append("Fecha: ").append(fecha).append("\n");
        sb.append("Platos del pedido: \n");
        double total = 0;
        for (Plato plato : platos) {
            sb.append(plato.getNombre()).append(" - ").append(plato.getPrecio()).append("€\n");
            total += plato.getPrecio();
        }
        sb.append("Precio total: ").append(total).append("€\n");
        return sb.toString();
    }
    public void agregarPlato(Plato plato){
        platos.add(plato);
    }
}

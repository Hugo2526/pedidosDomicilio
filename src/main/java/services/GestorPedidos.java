package services;

import entities.Pedido;

import java.util.*;

public class GestorPedidos {

    private String nombreRestaurante;
    private Map<String, Pedido> pedidos;

    public GestorPedidos(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
        this.pedidos = new HashMap<>();
    }

    /**
     * Agregar pedido a pedidos
     * @param pedido
     */
    public void agregarPedido(Pedido pedido){
        this.pedidos.put(nombreRestaurante.substring(0,3).toUpperCase() + "_" + pedido.getId(), pedido);
    }

    /**
     * muestra todos los pedidos del gestor de pedidos
     */
    public void mostrarPedidos(){
        IO.println("------PEDIDOS-------");
        for (String codigo : pedidos.keySet()){
            IO.println(codigo + " \n " + pedidos.get(codigo).mostrarPedido());
        }
    }

    public void mostrarPedidosOrdenadosPorFecha(){
        //sacar todos los pedidos con el metodo values
        List<Pedido> pedidosFecha = new ArrayList<Pedido>( pedidos.values());
        //Ordenarlos por fecha
        pedidosFecha.sort(Comparator.comparing(Pedido::getFecha));
        IO.println("------PEDIDOS ORDENADOS POR FECHA-------");
        for (Pedido pedido: pedidosFecha){
            pedido.mostrarPedido();
        }
    }

    public void mostrarPedidosOrdenadosPorCliente() {
        //Sacar todos los pedidos con values()
        List<Pedido> pedidosCliente = new ArrayList<>(pedidos.values());
        //Ordenarlos por fecha
        pedidosCliente.sort(Comparator.comparing((p1) -> p1.getCliente().getNombre()));
        IO.println("--- PEDIDOS ORDENADOS POR CLIENTE ---");
        for (Pedido pedido : pedidosCliente) {
            IO.println(pedido.mostrarPedido());
        }
    }

    public void mostrarPedidosOrdandosPorEstado() {
        //Sacar todos los pedidos con values()
        List<Pedido> pedidosEstado = new ArrayList<>(pedidos.values());
        //Ordenarlos por fecha
        pedidosEstado.sort(Comparator.comparing(Pedido::getEstado).reversed());
        IO.println("--- PEDIDOS ORDENADOS POR ESTADO ---");
        for(Pedido pedido : pedidosEstado) {
            IO.println(pedido.mostrarPedido());
        }
    }


}

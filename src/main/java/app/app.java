package app;

import entities.Cliente;
import entities.Pedido;
import entities.Plato;
import services.GestorPedidos;

public class app {
    static void main() {

        GestorPedidos gestPEd = new GestorPedidos("DeLaCalle SmashBurgers");

        //CLIENTES
        Cliente c1 = new Cliente("76859438A", "Pepe Gonzalez", "867584771", "pg@gmail.com");
        Cliente c2 = new Cliente("45698562G", "Juan Rodriguez", "886958736", "jr@gmail.com");

        //PEDIDOS
        Pedido pr1 = new Pedido(c1,"Guazamara");
        pr1.agregarPlato(new Plato(14, "Smash Burger King Bacon", 15.50, "Bacon hasta los topes"));
        pr1.agregarPlato(new Plato(12, "Viciosa", 19.50, "Carne de wagyu con mermelada de bacon y doritos espolvoreados"));

        Pedido pr2 = new Pedido(c2, "pulpi");
        pr2.agregarPlato(new Plato(14, "Smash Burger King Bacon", 15.50, "Bacon hasta los topes"));
        pr2.agregarPlato(new Plato(14, "Smash Burger King Bacon", 15.50, "Bacon hasta los topes"));

        gestPEd.agregarPedido(pr1);
        gestPEd.agregarPedido(pr2);

        gestPEd.mostrarPedidos();
        gestPEd.mostrarPedidosOrdenadosPorFecha();
        gestPEd.mostrarPedidosOrdenadosPorCliente();
        gestPEd.mostrarPedidosOrdandosPorEstado();
    }

}

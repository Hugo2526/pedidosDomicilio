## Ejemplo de clase para gestionar pedidos online a domicilio

1. Plato: Platos que puedes pedir: id, nombre, precio, descripcion
2. Cliente: id, nombre, email, telefono
3. Pedido: id, fecha, cliente, direccion, estado, platos (Map<String, Plato>)
4. Pedidos: Arraylist<Pedido>
5. Ordenación de pedidos por: 
    - Fecha
    - Cliente
    - Estado

## Instrucciones de ejecucion:
1. `mvn clean install`
2. `mvn exec:java o mvn exec:java -Dexec.mainClass="app.app"`

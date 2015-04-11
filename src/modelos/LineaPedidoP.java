package modelos;
// Generated 11-abr-2015 20:27:45 by Hibernate Tools 4.3.1



/**
 * LineaPedidoP generated by hbm2java
 */
public class LineaPedidoP  implements java.io.Serializable {


     private LineaPedidoPId id;
     private Articulo articulo;
     private PedidoP pedidoP;
     private int cantidad;

    public LineaPedidoP() {
    }

    public LineaPedidoP(LineaPedidoPId id, Articulo articulo, PedidoP pedidoP, int cantidad) {
       this.id = id;
       this.articulo = articulo;
       this.pedidoP = pedidoP;
       this.cantidad = cantidad;
    }
   
    public LineaPedidoPId getId() {
        return this.id;
    }
    
    public void setId(LineaPedidoPId id) {
        this.id = id;
    }
    public Articulo getArticulo() {
        return this.articulo;
    }
    
    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
    public PedidoP getPedidoP() {
        return this.pedidoP;
    }
    
    public void setPedidoP(PedidoP pedidoP) {
        this.pedidoP = pedidoP;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }




}


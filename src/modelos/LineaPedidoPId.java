package modelos;
// Generated 14-abr-2015 21:45:23 by Hibernate Tools 4.3.1



/**
 * LineaPedidoPId generated by hbm2java
 */
public class LineaPedidoPId  implements java.io.Serializable {


     private int linea;
     private int numPed;

    public LineaPedidoPId() {
    }

    public LineaPedidoPId(int linea, int numPed) {
       this.linea = linea;
       this.numPed = numPed;
    }
   
    public int getLinea() {
        return this.linea;
    }
    
    public void setLinea(int linea) {
        this.linea = linea;
    }
    public int getNumPed() {
        return this.numPed;
    }
    
    public void setNumPed(int numPed) {
        this.numPed = numPed;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LineaPedidoPId) ) return false;
		 LineaPedidoPId castOther = ( LineaPedidoPId ) other; 
         
		 return (this.getLinea()==castOther.getLinea())
 && (this.getNumPed()==castOther.getNumPed());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getLinea();
         result = 37 * result + this.getNumPed();
         return result;
   }   


}



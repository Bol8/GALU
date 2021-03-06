package modelos;
// Generated 14-abr-2015 21:45:23 by Hibernate Tools 4.3.1



/**
 * LineaFacturaId generated by hbm2java
 */
public class LineaFacturaId  implements java.io.Serializable {


     private int linea;
     private int NFactura;

    public LineaFacturaId() {
    }

    public LineaFacturaId(int linea, int NFactura) {
       this.linea = linea;
       this.NFactura = NFactura;
    }
   
    public int getLinea() {
        return this.linea;
    }
    
    public void setLinea(int linea) {
        this.linea = linea;
    }
    public int getNFactura() {
        return this.NFactura;
    }
    
    public void setNFactura(int NFactura) {
        this.NFactura = NFactura;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LineaFacturaId) ) return false;
		 LineaFacturaId castOther = ( LineaFacturaId ) other; 
         
		 return (this.getLinea()==castOther.getLinea())
 && (this.getNFactura()==castOther.getNFactura());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getLinea();
         result = 37 * result + this.getNFactura();
         return result;
   }   


}



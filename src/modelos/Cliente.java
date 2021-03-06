package modelos;
// Generated 14-abr-2015 21:45:23 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer idCli;
     private Estados estados;
     private String razonSocial;
     private String nif;
     private String nifR;
     private String domicilio;
     private String cp;
     private String poblacion;
     private String provincia;
     private String pais;
     private Date fechaA;
     private String tipo;
     private String telefono;
     private String mail;
     private String web;
     private String imagen;
     private Set pedidoCs = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(Estados estados, String razonSocial, String nif, String domicilio, String poblacion, Date fechaA, String tipo, String telefono) {
        this.estados = estados;
        this.razonSocial = razonSocial;
        this.nif = nif;
        this.domicilio = domicilio;
        this.poblacion = poblacion;
        this.fechaA = fechaA;
        this.tipo = tipo;
        this.telefono = telefono;
    }
    public Cliente(Estados estados, String razonSocial, String nif, String nifR, String domicilio, String cp, String poblacion, String provincia, String pais, Date fechaA, String tipo, String telefono, String mail, String web, String imagen, Set pedidoCs) {
       this.estados = estados;
       this.razonSocial = razonSocial;
       this.nif = nif;
       this.nifR = nifR;
       this.domicilio = domicilio;
       this.cp = cp;
       this.poblacion = poblacion;
       this.provincia = provincia;
       this.pais = pais;
       this.fechaA = fechaA;
       this.tipo = tipo;
       this.telefono = telefono;
       this.mail = mail;
       this.web = web;
       this.imagen = imagen;
       this.pedidoCs = pedidoCs;
    }
   
    public Integer getIdCli() {
        return this.idCli;
    }
    
    public void setIdCli(Integer idCli) {
        this.idCli = idCli;
    }
    public Estados getEstados() {
        return this.estados;
    }
    
    public void setEstados(Estados estados) {
        this.estados = estados;
    }
    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getNif() {
        return this.nif;
    }
    
    public void setNif(String nif) {
        this.nif = nif;
    }
    public String getNifR() {
        return this.nifR;
    }
    
    public void setNifR(String nifR) {
        this.nifR = nifR;
    }
    public String getDomicilio() {
        return this.domicilio;
    }
    
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public String getCp() {
        return this.cp;
    }
    
    public void setCp(String cp) {
        this.cp = cp;
    }
    public String getPoblacion() {
        return this.poblacion;
    }
    
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
    public String getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    public Date getFechaA() {
        return this.fechaA;
    }
    
    public void setFechaA(Date fechaA) {
        this.fechaA = fechaA;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getMail() {
        return this.mail;
    }
    
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getWeb() {
        return this.web;
    }
    
    public void setWeb(String web) {
        this.web = web;
    }
    public String getImagen() {
        return this.imagen;
    }
    
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public Set getPedidoCs() {
        return this.pedidoCs;
    }
    
    public void setPedidoCs(Set pedidoCs) {
        this.pedidoCs = pedidoCs;
    }




}



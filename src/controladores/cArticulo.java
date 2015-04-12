/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;
import dao.ArticuloDao;
import modelos.Articulo; 


/**
 *
 * @author Oscar
 */
public class cArticulo {
    
    private  ArticuloDao artD;

    public cArticulo() {
        artD = new ArticuloDao();
    }
    
    
    public boolean insertArticulo(Articulo art){
        artD = new ArticuloDao();                      
        return artD.insert(art);        
    }
    
       
}

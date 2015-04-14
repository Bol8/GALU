/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexiones.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelos.Articulo;

/**
 *
 * @author Oscar
 */
public class ArticuloDao {
    
     private static final String QUERY_INSERT = "insert into ARTICULO (Nombre,Peso,Tipo,Estado,Precio,IVA,Descripcion,"
              + " Origen) VALUES (?,?,?,?,?,?,?,?)";
    private static final String QUERY_UPDATE = "Update categoria_productos set nom_cat_prod = ? ,"
            + " descrip_cat_prod = ? WHERE idcategoria_productos = ? ";
    private static final String QUERY_DELETE = "Delete FROM categoria_productos where idcategoria_productos = ?";
    private static final String QUERY_SELECT_CATEGORIA = "select * from categoria_productos where nom_cat_prod = ?";
    private static final String QUERY_SELECT_CATEGORIAS = "select * from categoria_productos";
     private static final String QUERY_SELECT_CATEGORIAS_POR_PRODUCTO = "select nom_cat_prod from productos_has_categoria_productos ph"
            + " inner join categoria_productos  ct on ph.id_categoria = ct.idcategoria_productos "
            + "where id_prod = (Select id_prod from productos where tipo = ? )";

    private final Connection conexion;
    private PreparedStatement stmt;

    public ArticuloDao() {
        this.conexion = DBConnection.getConnection();      
    }
    
    
     public boolean insert(Articulo art) {
        try {
            stmt = conexion.prepareStatement(QUERY_INSERT);
            stmt.setString(1,art.getIdArt());
            stmt.setString(2,art.getNombre());
            stmt.setFloat(3,art.getPeso() );
            stmt.setString(4,art.getTipo() );
            stmt.setInt(5,art.getEstados());
            stmt.setFloat(6,art.getPrecio());
            stmt.setFloat(7,art.getIva());
            stmt.setString(8,art.getDescripcion());
            stmt.setString(9,art.getOrigen());
            stmt.setString(1,art.getImagen());
            
            stmt.executeUpdate();
            stmt.close();
            
        } catch (SQLException ex) {
            System.out.println("Error en insert producto");
            ex.printStackTrace();
            return false;
        }
        
        return true;
    }

    public void update(ArrayList lista) {
        try {
            stmt = conexion.prepareStatement(QUERY_UPDATE);
            stmt.setString(1, (String) lista.get(0));
            stmt.setString(2, (String) lista.get(1));
            stmt.setInt(3, (int) lista.get(2));
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Error en update producto");
        }
    }

    public void delete(int id_cat) {
        try {
            stmt = conexion.prepareStatement(QUERY_DELETE);
            stmt.setInt(1, id_cat);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Error en delete producto");
        }
    }

//    public CategoriaProductos selectCAtegoria(String tipo) {
//        CategoriaProductos categoriaProductos = null;
//        try {
//            stmt = conexion.prepareStatement(QUERY_SELECT_CATEGORIA);
//            stmt.setString(1, tipo);
//            ResultSet rst = stmt.executeQuery();
//            while (rst.next()) {
//                categoriaProductos = new CategoriaProductos(rst.getInt(1), rst.getString(2), rst.getString(3));
//            }
//            stmt.close();
//        } catch (SQLException ex) {
//            System.out.println("Error en select producto");
//        }
//
//        return categoriaProductos;
//    }
//
//    public ArrayList<CategoriaProductos> selectCategorias() {
//        ArrayList<CategoriaProductos> listaCategoria = new ArrayList<>();
//
//        try {
//            stmt = conexion.prepareStatement(QUERY_SELECT_CATEGORIAS);
//            ResultSet rst = stmt.executeQuery();
//            while (rst.next()) {
//                listaCategoria.add(new CategoriaProductos(rst.getInt(1), rst.getString(2), rst.getString(3)));
//            }
//            stmt.close();
//        } catch (SQLException ex) {
//            System.out.println("Error en select  productos");
//        }
//
//        return listaCategoria;
//    }
    
     public ArrayList selectCategoriasPorNombre(String nom_prod) {
        ArrayList listaCategorias = new ArrayList<>();

        try {
            stmt = conexion.prepareStatement(QUERY_SELECT_CATEGORIAS_POR_PRODUCTO);
            stmt.setString(1, nom_prod);
            ResultSet rst = stmt.executeQuery();
            while (rst.next()) {
                listaCategorias.add(rst.getString(1));
            }
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Error en select  productos");
        }

        return listaCategorias;
    }

    
    
    
    
    
}

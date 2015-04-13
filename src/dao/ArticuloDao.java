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
    
     private static final String QUERY_INSERT = "insert into ARTICULO (Nombre , Peso, Tipo, Precio, IVA, Descripcion,"
              + " Origen, Destino, Estados_idEstados ) VALUES (?,?,?,?,?,?,?,?,?)";
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
            stmt.setString(1,art.getNombre());
            stmt.setFloat(2,art.getPeso() );
            stmt.setString(3,art.getTipo() );
            stmt.setFloat(4,art.getPrecio());
            stmt.setFloat(5,art.getIva());
            stmt.setString(6,art.getDestino() );
            stmt.setString(7,art.getOrigen());
            stmt.setString(8,art.getDestino());
            stmt.setInt(9,1);
                    
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

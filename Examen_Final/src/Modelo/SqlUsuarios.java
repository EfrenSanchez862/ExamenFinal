/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author angie
 */
public class SqlUsuarios extends conexion{
    
        public boolean registrar(Usuarios usr) {
        //se prepara la consulta para MySql
        PreparedStatement ps = null;
        //traemos la conexion
        Connection con = getConexion();

        String sql = "INSERT INTO proveedor(Nombre_Proveedor,Nit_Proveedor,Nombre_Producto,Cantidad_Producto,Presio_Venta,Fecha_Entrega) VALUES(?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getNombre_Proveedor());
            
            ps.setString(2, usr.getNit_Proveedro());

            ps.setString(3, usr.getNombre_Producto());

            ps.setInt(4, usr.getCantidad_Producto());

            ps.setInt(5, usr.getPresio_Venta());
            
            ps.setString(6, usr.getFecha_Entrega());
            
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    } 
        
        
        public boolean registrarProductos(Usuarios usr) {
        //se prepara la consulta para MySql
        PreparedStatement ps = null;
        //traemos la conexion
        Connection con = getConexion();

        String sql = "INSERT INTO productos(Nombre_Producto,Descripcion,Fecha_Adquisicion,Fecha_Vencimineto,Presio_Venta,Presio_Compra,stock,Nombre_Proveedor,Nit_Proveedor,Proveedor_idProveedor,Ventas_idVenta) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            //ps.setInt(1, usr.getIdPreoducto());
            
            ps.setString(1, usr.getNombre_Producto());

            ps.setString(2, usr.getDescripcion());

            ps.setString(3, usr.getFecha_Adquisicion());

            ps.setString(4, usr.getFecha_Vencimiento());
            
            ps.setInt(5, usr.getPresio_Venta());
            
            ps.setInt(6, usr.getPresio_Comra());
            
            ps.setInt(7, usr.getStock());
            
            ps.setString(8, usr.getNombre_Proveedor());
            
            ps.setString(9, usr.getNit_Proveedro());
            
            ps.setInt(10,usr.getProveedor_idProveedor());
            
            ps.setInt(11,usr.getVentas_idVenta());
            
            
            
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    } 


        public boolean RealizarVenta(Usuarios usr) {
        //se prepara la consulta para MySql
        PreparedStatement ps = null;
        //traemos la conexion
        Connection con = getConexion();

        String sql = "INSERT INTO ventas(Nombre_Producto,Nombre_Cliente,Nit_Cliente,Cantidad_Prod) VALUES(?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getNombre_Producto());
            
            ps.setString(2, usr.getNombre_Cliente());

            ps.setString(3, usr.getNit_Cliente());

            ps.setInt(4, usr.getCantidad_Prod());

            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    } 
        
}

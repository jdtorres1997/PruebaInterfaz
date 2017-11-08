/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import logica.Inscripcion;

/**
 *
 * @author jdtorres
 */
public class DAOInscripcion {

    AccesoBD acceso;

    public DAOInscripcion() {
        acceso = new AccesoBD();

    }

    public boolean insertarInscripcion(Inscripcion i) {
        String sql_select;
        sql_select = "INSERT INTO inscripciones ("
                + "id_cliente, "
                + "id_evento, "
                + "pago)"
                + "VALUES ('" + i.getIdCliente() + "',"
                + "'" + i.getIdEvento() + "', "
                + "'no')";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("insertando en la bd");
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_select);

            return true;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    
    public boolean existeInscripcion(String id_cliente, String id_evento) {
        String sql_select;
        sql_select = "SELECT id_cliente FROM inscripciones WHERE id_cliente='" + id_cliente + "' AND id_evento='"+ id_evento +"'";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            if (!tabla.isBeforeFirst()) {
                return false;
            } else {
                return true;
            }

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;

    }
    
    public boolean updateInscripcion(Inscripcion i) {
        String sql_select;
        sql_select = "UPDATE inscripciones "
                + "SET "
                + "pago='si' WHERE id_cliente='" + i.getIdCliente() + "' AND id_evento='" + i.getIdEvento() +"'";
        try {
            Connection conn = acceso.getConnetion();
            System.out.println("actualizando en  bd");
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_select);

            return true;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    
    
}
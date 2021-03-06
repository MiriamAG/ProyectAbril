/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;
/**
 *
 * @author 7fprog03
 */
public class Trabajador {

    private BigDecimal id;
    private String dni;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String categoria;
    private String calle;
    private BigDecimal numero;
    private BigDecimal piso;
    private String mano;
    private String ciudad;
    private BigDecimal codigoPostal;
    private String provincia;
    private BigDecimal movilEmpresa;
    private BigDecimal movilPersonal;
    private BigDecimal salario;
    private String fechaNacimiento;
    private BigDecimal idCent;
    //asociacion con centros 
    private Centro centro;
    //asociacion con usuarios
    private List<Usuario> usuario = new ArrayList<>();

    public Trabajador() {
    }

    public Trabajador( String dni, String nombre, String primerApellido, String segundoApellido, String categoria, String calle, BigDecimal numero, BigDecimal piso, String mano, String ciudad, BigDecimal codigoPostal, String provincia, BigDecimal movilEmpresa, BigDecimal movilPersonal, BigDecimal salario, String fechaNacimiento, BigDecimal idCent) {
      
        this.dni = dni;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.categoria = categoria;
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.mano = mano;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.provincia = provincia;
        this.movilEmpresa = movilEmpresa;
        this.movilPersonal = movilPersonal;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
        this.idCent = idCent;
    }



    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public BigDecimal getNumero() {
        return numero;
    }

    public void setNumero(BigDecimal numero) {
        this.numero = numero;
    }

    public BigDecimal getPiso() {
        return piso;
    }

    public void setPiso(BigDecimal piso) {
        this.piso = piso;
    }

    public String getMano() {
        return mano;
    }

    public void setMano(String mano) {
        this.mano = mano;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public BigDecimal getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(BigDecimal codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public BigDecimal getMovilEmpresa() {
        return movilEmpresa;
    }

    public void setMovilEmpresa(BigDecimal movilEmpresa) {
        this.movilEmpresa = movilEmpresa;
    }

    public BigDecimal getMovilPersonal() {
        return movilPersonal;
    }

    public void setMovilPersonal(BigDecimal movilPersonal) {
        this.movilPersonal = movilPersonal;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public BigDecimal getIdCent() {
        return idCent;
    }

    public void setIdCent(BigDecimal idCent) {
        this.idCent = idCent;
    }
    
    //listar trabajadores
    public static List <Trabajador>listarTrabajadores(){
        List<Trabajador>trabajadores=new ArrayList<>();
        
        Conexion.conectar();
        try {
            CallableStatement cs = Conexion.getConexion().prepareCall("{call listartrabajadores(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            
            ResultSet rs = (ResultSet) cs.getObject(1);
            while(rs.next()){
                Trabajador t = new Trabajador();
                t.setId(rs.getBigDecimal("ID"));
                t.setDni(rs.getString("dni"));
                t.setNombre(rs.getString("nombre"));
                t.setPrimerApellido(rs.getString("primerApellido"));
                t.setSegundoApellido(rs.getString("segundoapellido"));
                t.setCategoria(rs.getString("categoria"));
                t.setCalle(rs.getString("calle"));
                t.setNumero(rs.getBigDecimal("numero"));
                t.setPiso(rs.getBigDecimal("piso"));
                t.setMano(rs.getString("mano"));
                t.setCiudad(rs.getString("ciudad"));
                t.setCodigoPostal(rs.getBigDecimal("codigoPostal"));
                t.setProvincia(rs.getString("provincia"));
                t.setMovilEmpresa(rs.getBigDecimal("movilEmpresa"));
                t.setMovilPersonal(rs.getBigDecimal("movilPersonal"));
                t.setSalario(rs.getBigDecimal("salario"));
                t.setFechaNacimiento(rs.getString("fechaNacimiento"));
                t.setIdCent(rs.getBigDecimal("CENTROS_ID"));
                trabajadores.add(t);
                System.out.println(t);
            }
            rs.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede efectuar la conexión, hable con el administrador del sistema" + ex.getMessage());
        }
        
        return trabajadores;
    }
    
    public static  List<Trabajador>filtrarTrabajador(String dni){
        List<Trabajador>trabajador=new ArrayList<>();
        Conexion.conectar();
        try {
            CallableStatement cs = Conexion.getConexion().prepareCall("{call filtrarTrabajador(?,?)}");
            cs.setString(1, dni);
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            
            ResultSet rs = (ResultSet) cs.getObject(2);
           
            while(rs.next()){
                Trabajador t = new Trabajador();
                t.setId(rs.getBigDecimal("ID"));
                t.setDni(rs.getString("dni"));
                t.setNombre(rs.getString("nombre"));
                t.setPrimerApellido(rs.getString("primerApellido"));
                t.setSegundoApellido(rs.getString("segundoApellido"));
                t.setCategoria(rs.getString("categoria"));
                t.setCalle(rs.getString("calle"));
                t.setNumero(rs.getBigDecimal("numero"));
                t.setPiso(rs.getBigDecimal("piso"));
                t.setMano(rs.getString("mano"));
                t.setCiudad(rs.getString("ciudad"));
                t.setCodigoPostal(rs.getBigDecimal("codigoPostal"));
                t.setProvincia(rs.getString("provincia"));
                t.setMovilEmpresa(rs.getBigDecimal("movilEmpresa"));
                t.setMovilPersonal(rs.getBigDecimal("movilPersonal"));
                t.setSalario(rs.getBigDecimal("salario"));
                t.setFechaNacimiento(rs.getString("fechaNacimiento"));
                t.setIdCent(rs.getBigDecimal("CENTROS_ID"));
                trabajador.add(t);
                System.out.println(t);
            }
            rs.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(Trabajador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return trabajador;
    }
    
    //27/04 botón modificar
    public boolean modificarTrabajador(String dni_trab) {

        Conexion.conectar();

        try {
            PreparedStatement ps = Conexion.getConexion().prepareStatement("UPDATE TRABAJADORES SET dni=?,nombre=?,"
                    +"primerApellido=?, segundoApellido =?,categoria=?,calle=?,"
                    + "numero=?,piso=?, mano=?, ciudad=?,codigoPostal=?,provincia=?,"
                    + "movilEmpresa=?,movilPersonal=?,salario=?,fechaNacimiento=?, CENTROS_ID=? WHERE dni=?");
            ps.setString(1, dni);
            ps.setString(2, nombre);
            ps.setString(3, primerApellido);
            ps.setString(4, segundoApellido);
            ps.setString(5, categoria);
            ps.setString(6,calle );
            ps.setBigDecimal(7, numero);
            ps.setBigDecimal(8, piso);
            ps.setString(9, mano);
            ps.setString(10, ciudad);
            ps.setBigDecimal(11, codigoPostal);
            ps.setString(12, provincia);
            ps.setBigDecimal(13, movilEmpresa);
            ps.setBigDecimal(14, movilPersonal);
            ps.setBigDecimal(15, salario);
            ps.setString(16, fechaNacimiento);
            ps.setBigDecimal(17, idCent);
            ps.setString(18, dni_trab);

            ps.executeUpdate();
            ps.close();
            Conexion.desconectar();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede efectuar la conexión, hable con el administrador del sistema \n" + ex.getMessage());
            return false;
        }
        
    }
    
    //27/04 Miriam
    
     public static boolean bajaTrabajador(String dni) {
        try {
            Conexion.conectar();
            PreparedStatement ps = Conexion.getConexion().prepareStatement("delete from trabajadores where dni=?");
            ps.setString(1, dni);
            ps.execute();
            ps.close();
            Conexion.desconectar();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede efectuar la conexión, hable con el administrador del sistema \n" + ex.getMessage());
            return false;
        }
    }
     
     
     //Eliminar por id de trabajador
     /*
     public static boolean bajaTrabajador(BigDecimal id) {
        try {
            Conexion.conectar();
            PreparedStatement ps = Conexion.getConexion().prepareStatement("delete from trabajadores where id=?");
            ps.setBigDecimal(1,id);
            ps.execute();
            ps.close();
            Conexion.desconectar();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede efectuar la conexión, hable con el administrador del sistema \n" + ex.getMessage());
            return false;
        }
    }
*/

    @Override
    public String toString() {
        return "Trabajador{" + "id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", categoria=" + categoria + ", calle=" + calle + ", numero=" + numero + ", piso=" + piso + ", mano=" + mano + ", ciudad=" + ciudad + ", codigoPostal=" + codigoPostal + ", provincia=" + provincia + ", movilEmpresa=" + movilEmpresa + ", movilPersonal=" + movilPersonal + ", salario=" + salario + ", fechaNacimiento=" + fechaNacimiento + ", idCent=" + idCent + '}';
    }

}

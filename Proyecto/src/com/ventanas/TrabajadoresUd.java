/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventanas;

import com.clases.Trabajador;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bcastrof
 */
public class TrabajadoresUd extends javax.swing.JFrame {

    private DefaultTableModel trabajadores;
    private List<Trabajador> trabajador;
    private static String docI;
    
    /* este hay que quitar de comentarios si se quiere eliminar por id
    private static BigDecimal id;*/

    //listar trabajadores
    private void listarTrabajadores() {
        trabajadores = (DefaultTableModel) jTable1.getModel();
        trabajador = Trabajador.listarTrabajadores();

        for (Trabajador t : trabajador) {
            trabajadores.insertRow(trabajadores.getRowCount(), new Object[]{t.getId(),t.getDni(),
                t.getNombre(),t.getPrimerApellido(),t.getSegundoApellido(), t.getCategoria(), t.getCalle(),
                t.getNumero(),
                t.getPiso(),t.getMano(),t.getCiudad(),t.getCodigoPostal(),t.getProvincia(),
                t.getMovilEmpresa(),t.getMovilPersonal(),t.getSalario(),t.getFechaNacimiento(),
                t.getIdCent()});
        }
    }

    private void filtrarTrabajador() {
        trabajadores.setRowCount(0);
        trabajadores = (DefaultTableModel) jTable1.getModel();
        trabajador = Trabajador.filtrarTrabajador(docI);
        for (Trabajador t : trabajador) {
            trabajadores.insertRow(trabajadores.getRowCount(), new Object[]{t.getId(),t.getDni(),
                t.getNombre(),t.getPrimerApellido(),t.getSegundoApellido(), t.getCategoria(), t.getCalle(),
                t.getNumero(),
                t.getPiso(),t.getMano(),t.getCiudad(),t.getCodigoPostal(),t.getProvincia(),
                t.getMovilEmpresa(),t.getMovilPersonal(),t.getSalario(),t.getFechaNacimiento(),
                t.getIdCent()});
        }
    }

    public TrabajadoresUd() {
        initComponents();
        listarTrabajadores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        uId = new javax.swing.JTextField();
        uNombre = new javax.swing.JTextField();
        uPrimerApellido = new javax.swing.JTextField();
        uSegundoApellido = new javax.swing.JTextField();
        uDni = new javax.swing.JTextField();
        uCategoria = new javax.swing.JTextField();
        uCalle = new javax.swing.JTextField();
        uNumero = new javax.swing.JTextField();
        uPiso = new javax.swing.JTextField();
        uMano = new javax.swing.JTextField();
        uCiudad = new javax.swing.JTextField();
        uCodigoPostal = new javax.swing.JTextField();
        uProvincia = new javax.swing.JTextField();
        uMovilEmpresa = new javax.swing.JTextField();
        uMovilPersonal = new javax.swing.JTextField();
        uSalario = new javax.swing.JTextField();
        uIdcent = new javax.swing.JTextField();
        uFechaNacimiento = new javax.swing.JTextField();
        uFiltro = new javax.swing.JTextField();
        bFiltrar = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        modificarTrabajador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "dni", "nombre", "primer apellido", "segundo apellido", "categoria", "calle", "numero", "piso", "mano", "ciudad", "codigo postal", "provincia", "movil empresa", "movil personal", "salario", "fecha nacimiento", "centros_id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        uId.setPreferredSize(new java.awt.Dimension(50, 20));
        uId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uIdActionPerformed(evt);
            }
        });

        uNombre.setPreferredSize(new java.awt.Dimension(110, 20));

        uPrimerApellido.setPreferredSize(new java.awt.Dimension(110, 20));

        uSegundoApellido.setPreferredSize(new java.awt.Dimension(110, 20));

        uDni.setPreferredSize(new java.awt.Dimension(110, 20));

        uCategoria.setPreferredSize(new java.awt.Dimension(110, 20));

        uCalle.setPreferredSize(new java.awt.Dimension(110, 20));

        uNumero.setPreferredSize(new java.awt.Dimension(110, 20));

        uPiso.setPreferredSize(new java.awt.Dimension(110, 20));

        uMano.setPreferredSize(new java.awt.Dimension(110, 20));

        uCiudad.setPreferredSize(new java.awt.Dimension(110, 20));

        uCodigoPostal.setPreferredSize(new java.awt.Dimension(110, 20));

        uProvincia.setPreferredSize(new java.awt.Dimension(110, 20));

        uMovilEmpresa.setPreferredSize(new java.awt.Dimension(110, 20));

        uMovilPersonal.setPreferredSize(new java.awt.Dimension(110, 20));

        uSalario.setPreferredSize(new java.awt.Dimension(110, 20));

        uIdcent.setPreferredSize(new java.awt.Dimension(50, 20));

        uFechaNacimiento.setPreferredSize(new java.awt.Dimension(110, 20));
        uFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uFechaNacimientoActionPerformed(evt);
            }
        });

        uFiltro.setPreferredSize(new java.awt.Dimension(110, 20));
        uFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uFiltroActionPerformed(evt);
            }
        });

        bFiltrar.setText("FILTRAR");
        bFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFiltrarActionPerformed(evt);
            }
        });

        label1.setText("Dni Trabajador");

        jLabel1.setText("Id :");

        jLabel2.setText("Nombre :");

        jLabel3.setText("Primer Apellido :");

        jLabel4.setText("Segundo Apelido :");

        jLabel5.setText("dni :");

        jLabel6.setText("Fecha Nacimiento :");

        jLabel7.setText("Categoria :");

        jLabel8.setText("Salario : ");

        jLabel9.setText("Movil Empresa :");

        jLabel10.setText("Id Centro :");

        jLabel11.setText("Movil Personal :");

        jLabel12.setText("Calle :");

        jLabel13.setText("Piso :");

        jLabel14.setText("Mano :");

        jLabel15.setText("Numero :");

        jLabel16.setText("Ciudad");

        jLabel17.setText("Codigo Postal :");

        jLabel18.setText("Provincia :");

        jButton1.setText("Listar");

        eliminar.setText("Eliminar trabajador");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        modificarTrabajador.setText("Modificar trabajador");
        modificarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarTrabajadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bFiltrar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uId, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(uCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(uMovilEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(32, 32, 32)
                                        .addComponent(uNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(uFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                        .addComponent(uCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 64, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(uPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(uCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(uMovilPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel16)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(uCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel15)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(uNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel8)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(uSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(jLabel4)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton1)
                                                            .addComponent(uSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(22, 22, 22)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel5)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(uDni, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(uIdcent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel18)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(uProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel13)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(uPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(uMano, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(40, 40, 40))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(modificarTrabajador)
                                        .addGap(345, 345, 345)
                                        .addComponent(eliminar)
                                        .addGap(26, 26, 26)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bFiltrar)
                                .addComponent(uFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1))
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(uNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(uPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(uSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(uDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(uId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(uFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(uCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(uSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uIdcent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(uMovilEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(uMovilPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(uMano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(uNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addComponent(jLabel12))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(uCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18)
                    .addComponent(uProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarTrabajador)
                    .addComponent(eliminar))
                .addGap(23, 23, 23))
        );

        label1.getAccessibleContext().setAccessibleName("dni");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index = jTable1.getSelectedRow();

        //creo variables para rellenado del formulario (lo pasais todo pero todo a String)
        String idEmp = trabajador.get(index).getId().toString();
        String docI = trabajador.get(index).getDni();
        String name = trabajador.get(index).getNombre();
        String firstS = trabajador.get(index).getPrimerApellido();
        String secondS = trabajador.get(index).getSegundoApellido();
        String category = trabajador.get(index).getCategoria();
        String street = trabajador.get(index).getCalle();
        String number = trabajador.get(index).getNumero().toString();
        String floor = trabajador.get(index).getPiso().toString();
        String hand = trabajador.get(index).getMano();
        String city = trabajador.get(index).getCiudad();
        String postalCode = trabajador.get(index).getCodigoPostal().toString();
        String province = trabajador.get(index).getProvincia();
        String phoneCompany = trabajador.get(index).getMovilEmpresa().toString();
        String personalPhone = trabajador.get(index).getMovilPersonal().toString();
        String salary = trabajador.get(index).getSalario().toString();
        String bornDate = trabajador.get(index).getFechaNacimiento();
        String idCompany = trabajador.get(index).getIdCent().toString();

        //paso los valores a las cajas del formulario de detalle
        uId.setText(idEmp);
        uDni.setText(docI);
        uNombre.setText(name);
        uPrimerApellido.setText(firstS);
        uSegundoApellido.setText(secondS);
        uCategoria.setText(category);
        uCalle.setText(street);
        uNumero.setText(number);
        uPiso.setText(floor);
        uMano.setText(hand);
        uCiudad.setText(city);
        uCodigoPostal.setText(postalCode);
        uProvincia.setText(province);
        uMovilEmpresa.setText(phoneCompany);
        uMovilPersonal.setText(personalPhone);
        uSalario.setText(salary);
        uFechaNacimiento.setText(bornDate);
        uIdcent.setText(idCompany);
    }//GEN-LAST:event_jTable1MouseClicked

    private void bFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFiltrarActionPerformed
        docI = uFiltro.getText();
        
        filtrarTrabajador();
    }//GEN-LAST:event_bFiltrarActionPerformed

    private void uFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uFiltroActionPerformed

    private void uIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uIdActionPerformed

    private void uFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uFechaNacimientoActionPerformed

    //botón para modificar y que aparezca directamente en lista 27/04
    
    public void limpiarFormulario() {
        uDni.setText("");
        uNombre.setText("");
        uPrimerApellido.setText("");
        uSegundoApellido.setText("");
        uCategoria.setText("");
        uCalle.setText("");
        uNumero.setText("");
        uPiso.setText("");
        uMano.setText("");
        uCiudad.setText("");
        uCodigoPostal.setText("");
        uProvincia.setText("");
        uMovilEmpresa.setText("");
        uMovilPersonal.setText("");
        uSalario.setText("");
        uFechaNacimiento.setText("");
        uIdcent.setText("");
    }
    
    private void modificarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarTrabajadorActionPerformed
       
         //recojo los valores transladados para pasarlos al metodo modificarTrabajador
        String docI = uDni.getText();
        String name = uNombre.getText();
        String firstS = uPrimerApellido.getText();
        String secondS = uSegundoApellido.getText();
        String category = uCategoria.getText();
        String street = uCalle.getText();
        BigDecimal number = new BigDecimal(uNumero.getText());
        BigDecimal floor = new BigDecimal (uPiso.getText());
        String hand = uMano.getText();
        String city = uCiudad.getText();
        BigDecimal postalCode = new BigDecimal(uCodigoPostal.getText());
        String province = uProvincia.getText();
        BigDecimal phoneCompany = new BigDecimal(uMovilEmpresa.getText());
        BigDecimal personalPhone = new BigDecimal(uMovilPersonal.getText());
        BigDecimal salary = new BigDecimal(uSalario.getText());
        String bornDay = uFechaNacimiento.getText();
        BigDecimal idCompany = new BigDecimal(uIdcent.getText());

        //creo centro para pasar al metodo modificar.
        Trabajador trab = new Trabajador(docI,name, firstS,secondS,category, street,number,floor,
                hand,city, postalCode,province,phoneCompany,personalPhone,salary,bornDay,idCompany);

        boolean modificar = trab.modificarTrabajador(docI);

        if (modificar) {
            JOptionPane.showMessageDialog(null, "Trabajador modificado correctamente", "Modificado", JOptionPane.INFORMATION_MESSAGE);
        }
        //limpio tabla
        trabajadores.setRowCount(0);
        //cargo lista actualizada
        listarTrabajadores();
        //limpio formulario
        limpiarFormulario();
           
    }//GEN-LAST:event_modificarTrabajadorActionPerformed

    //si queremos eliminar por dni
    
    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // eliminar un trabajador
        
        Trabajador.bajaTrabajador(docI);

        //limpio formulario
        limpiarFormulario();

        //limpio tabla 
        trabajadores.setRowCount(0);

        //cargo lista de nuevo
        listarTrabajadores();
    
    }//GEN-LAST:event_eliminarActionPerformed

    //si queremos eliminar por id de trabajador:
    /*
     private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // eliminar un trabajador
        
        Trabajador.bajaTrabajador(id);

        //limpio formulario
        limpiarFormulario();

        //limpio tabla 
        trabajadores.setRowCount(0);

        //cargo lista de nuevo
        listarTrabajadores();
    
    }                     
    */
    
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrabajadoresUd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrabajadoresUd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrabajadoresUd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrabajadoresUd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrabajadoresUd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bFiltrar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private javax.swing.JButton modificarTrabajador;
    private javax.swing.JTextField uCalle;
    private javax.swing.JTextField uCategoria;
    private javax.swing.JTextField uCiudad;
    private javax.swing.JTextField uCodigoPostal;
    private javax.swing.JTextField uDni;
    private javax.swing.JTextField uFechaNacimiento;
    javax.swing.JTextField uFiltro;
    private javax.swing.JTextField uId;
    private javax.swing.JTextField uIdcent;
    private javax.swing.JTextField uMano;
    private javax.swing.JTextField uMovilEmpresa;
    private javax.swing.JTextField uMovilPersonal;
    private javax.swing.JTextField uNombre;
    private javax.swing.JTextField uNumero;
    private javax.swing.JTextField uPiso;
    private javax.swing.JTextField uPrimerApellido;
    private javax.swing.JTextField uProvincia;
    private javax.swing.JTextField uSalario;
    private javax.swing.JTextField uSegundoApellido;
    // End of variables declaration//GEN-END:variables
}

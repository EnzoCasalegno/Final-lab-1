/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import accesoADatos.RutaData;
import entidades.Ruta;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 54266
 */
public class BuscadorRutas extends javax.swing.JPanel {

    RutaData rutaData = new RutaData();
    List<Ruta> listaRutas;
    List<Ruta> listaRutasporOrigen;
    List<Ruta> listaRutasporDestino;
    List<String> listaDestinoporOrigen;
    List<Ruta> rutasEspecificas;
    List<Ruta> rutasOrigen;
    List<Ruta> rutasDestino;

    private DefaultTableModel tabla = new DefaultTableModel() {
        public boolean isCellEditable(int i, int i1) {
            return false;
        }
    };

    public BuscadorRutas() {
        initComponents();
        armarCabecera();
        listaRutas = rutaData.listarRutas();
        listaRutasporOrigen = rutaData.listarRutasPorOrigenBusqueda();
        listaRutasporDestino = rutaData.listarRutasPorDestinoBusqueda();
        listaDestinoporOrigen = rutaData.listarRutasDestino();
        llenarComboOrigen();
        llenarComboDestino();
        llenarTablas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLRutas = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLBuscarRutas = new javax.swing.JLabel();
        jBBuscar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jLOrigen = new javax.swing.JLabel();
        jLDestino = new javax.swing.JLabel();
        jCOrigen = new javax.swing.JComboBox<>();
        jCDestino = new javax.swing.JComboBox<>();
        jBEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(817, 602));

        jTable.setBackground(new java.awt.Color(255, 255, 255));
        jTable.setForeground(new java.awt.Color(0, 0, 0));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ruta", "Origen", "Destino", "Duracion Estimada"
            }
        ));
        jTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable);

        jLRutas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLRutas.setForeground(new java.awt.Color(51, 51, 51));
        jLRutas.setText("Rutas");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));

        jLBuscarRutas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLBuscarRutas.setForeground(new java.awt.Color(51, 51, 51));
        jLBuscarRutas.setText("Buscar ruta");

        jBBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jBBuscar.setForeground(new java.awt.Color(102, 102, 102));
        jBBuscar.setText("Buscar");
        jBBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        jBBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBBuscarMouseExited(evt);
            }
        });
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        jBLimpiar.setForeground(new java.awt.Color(102, 102, 102));
        jBLimpiar.setText("Limpiar");
        jBLimpiar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        jBLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBLimpiarMouseExited(evt);
            }
        });
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jLOrigen.setForeground(new java.awt.Color(102, 102, 102));
        jLOrigen.setText("Origen");

        jLDestino.setForeground(new java.awt.Color(102, 102, 102));
        jLDestino.setText("Destino");

        jBEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jBEliminar.setForeground(new java.awt.Color(102, 102, 102));
        jBEliminar.setText("Eliminar");
        jBEliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        jBEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBEliminarMouseExited(evt);
            }
        });
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLOrigen)
                    .addComponent(jLDestino))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jLBuscarRutas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLOrigen))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDestino)
                    .addComponent(jCDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLBuscarRutas)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(jLRutas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLRutas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscarMouseEntered
        jBBuscar.setBackground(new Color(0, 102, 102));
        jBBuscar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBBuscarMouseEntered

    private void jBBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscarMouseExited
        jBBuscar.setBackground(new Color(255, 255, 255));
        jBBuscar.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBBuscarMouseExited

    private void jBLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiarMouseEntered
        jBLimpiar.setBackground(new Color(0, 102, 102));
        jBLimpiar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBLimpiarMouseEntered

    private void jBLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiarMouseExited
        jBLimpiar.setBackground(new Color(255, 255, 255));
        jBLimpiar.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBLimpiarMouseExited

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        if (jCOrigen.getSelectedIndex() == -1 && jCDestino.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un origen y un destino.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (jCOrigen.getSelectedIndex() != -1 && jCDestino.getSelectedIndex() == -1) {

            String origen = (String) jCOrigen.getSelectedItem();
            rutasOrigen = rutaData.buscarRutaXOrigen(origen);
            if (rutasOrigen != null) {
                borrarFilas();

                for (Ruta ruta : rutasOrigen) {
                    tabla.addRow(new Object[]{
                        ruta.getIdRuta(),
                        ruta.getOrigen(),
                        ruta.getDestino(),
                        ruta.getDuracionEst()
                    });
                }
            }

        } else if (jCOrigen.getSelectedIndex() == -1 && jCDestino.getSelectedIndex() != -1) {
            String destino = (String) jCDestino.getSelectedItem();
            rutasDestino = rutaData.buscarRutaXDestino(destino);
            if (rutasDestino != null) {
                borrarFilas();
                for (Ruta ruta : rutasDestino) {
                    tabla.addRow(new Object[]{
                        ruta.getIdRuta(),
                        ruta.getOrigen(),
                        ruta.getDestino(),
                        ruta.getDuracionEst()
                    });
                }
            }

        } else if (jCOrigen.getSelectedIndex() != -1 && jCDestino.getSelectedIndex() != -1) {
            String origen = (String) jCOrigen.getSelectedItem();
            String destino = (String) jCDestino.getSelectedItem();
            rutasEspecificas = rutaData.buscarRuta(origen, destino);
            if (rutasEspecificas != null) {
                borrarFilas();
                for (Ruta ruta : rutasEspecificas) {
                    tabla.addRow(new Object[]{
                        ruta.getIdRuta(),
                        ruta.getOrigen(),
                        ruta.getDestino(),
                        ruta.getDuracionEst()
                    });
                }
            }

        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        // TODO add your handling code here:
        jCOrigen.setSelectedIndex(-1);
        jCDestino.setSelectedIndex(-1);
        llenarTablas();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminarMouseEntered
        jBEliminar.setBackground(new Color(0, 102, 102));
        jBEliminar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jBEliminarMouseEntered

    private void jBEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminarMouseExited
        jBEliminar.setBackground(new Color(255, 255, 255));
        jBEliminar.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jBEliminarMouseExited

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

        // Controla que la tabla no esté vacía
        if (jTable.getRowCount() > 0) {
            // Controla que se haya seleccionado un producto
            if (jTable.getSelectedRow() != -1) {
                // Obtener el id del producto
                int id = Integer.parseInt(String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 0)));

                int confirmacion = JOptionPane.showConfirmDialog(this,
                        "¿Está seguro de que desea eliminar la ruta?",
                        "Confirmar eliminación",
                        JOptionPane.YES_NO_OPTION);

                // Si el usuario confirma, proceder con la eliminación
                if (confirmacion == JOptionPane.YES_OPTION) {
                    // Llamar al método borrar
                    rutaData.eliminarRuta(id);

                }
            } else {
                JOptionPane.showMessageDialog(null, "No selecciono ninguna ruta");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay nada para eliminar en la tabla");
        }

        llenarTablas();


    }//GEN-LAST:event_jBEliminarActionPerformed

    private void armarCabecera() {
        tabla.addColumn("Ruta");
        tabla.addColumn("Origen");
        tabla.addColumn("Destino");
        tabla.addColumn("Duracion Estimada");
        jTable.setModel(tabla);
    }

    public void llenarComboOrigen() {
        jCOrigen.removeAllItems();
        if (listaRutasporOrigen != null) {
            for (Ruta e : listaRutasporOrigen) {
                jCOrigen.addItem(e.getOrigen());
            }
        }
        jCOrigen.setSelectedIndex(-1);
    }

    public void llenarComboDestino() {
        jCDestino.removeAllItems();
        if (listaRutasporDestino != null) {
            for (Ruta x : listaRutasporDestino) {
                jCDestino.addItem(x.getDestino());
            }
        }
        jCDestino.setSelectedIndex(-1);
    }

//    public void llenarDestinoOrigen(){
//        jCDestino.removeAllItems();
//        for (String des : listaDestinoporOrigen) {
//            jCDestino.addItem(des);
//        }
//        
//    }
    private void llenarTablas() {
        borrarFilas();
        listaRutas = rutaData.listarRutas();
        for (Ruta x : listaRutas) {
            if (x != null) {
                tabla.addRow(new Object[]{x.getIdRuta(), x.getOrigen(), x.getDestino(), x.getDuracionEst()});
            }
        }
    }

    private void borrarFilas() {
        int filas = tabla.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            tabla.removeRow(f);
        }
    }

    public void buscarTabla() {

        borrarFilas();
        for (Ruta ruta : listaRutasporOrigen) {
            tabla.addRow(new Object[]{ruta.getIdRuta(), ruta.getOrigen(), ruta.getDestino(), ruta.getDuracionEst()});
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JComboBox<String> jCDestino;
    private javax.swing.JComboBox<String> jCOrigen;
    private javax.swing.JLabel jLBuscarRutas;
    private javax.swing.JLabel jLDestino;
    private javax.swing.JLabel jLOrigen;
    private javax.swing.JLabel jLRutas;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import implication.Implication;
import java.awt.Desktop;
import static java.awt.Desktop.getDesktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rami
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
                                try {
                Toolkit kit = Toolkit.getDefaultToolkit();
                Image img = kit.createImage("./tree.png");
                setIconImage(img);
            } catch (Exception e){
                e.printStackTrace();
            }
        setTitle("ImpliCheck by Birzeit University");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        word1 = new javax.swing.JTextField();
        word2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Input"));

        jButton1.setText("Check Implication");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        word1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        word1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        word1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                word1ActionPerformed(evt);
            }
        });

        word2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        word2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        word2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                word2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Word 1");

        jLabel2.setText("Word 2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(word2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(word1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(word2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(word1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Log"));

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Word 1", "Word 2", "Result", "Certainty", "Score", "Distance", "Conflict Count"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(25);
        jScrollPane2.setViewportView(jTable1);

        jMenu1.setText("File");

        jMenuItem1.setText("Select Input and Output Files");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem2.setText("How to use the Implication Program");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void word1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_word1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_word1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        //new Help().setVisible(true);
        Desktop desktop = getDesktop();
        try {
            URI uri = new URI("https://docs.google.com/document/d/1BgYLOQFMVmgyz_798_vn1cV4-skr-_t9eZ6B8GCam3E/edit?usp=sharing");
             desktop.browse(uri);
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
				fileChooser.setCurrentDirectory(new File("./assets"));
				fileChooser.showOpenDialog(null);
				File inputFile = fileChooser.getSelectedFile();
				try {
					FileInputStream inputStream = new FileInputStream(inputFile);
					InputStreamReader inputReader = new InputStreamReader(inputStream, "utf-8");
					BufferedReader in = new BufferedReader(inputReader);
					
					fileChooser.showSaveDialog(null);
					File outputFile = fileChooser.getSelectedFile();
					FileOutputStream outputStream = new FileOutputStream(outputFile);
					OutputStreamWriter outputReader = new OutputStreamWriter(outputStream, "utf-8");
					BufferedWriter out = new BufferedWriter(outputReader);
					
					String[] words;
					int count = 1;
					
					String temp;
					while ((temp = in.readLine()) != null){
						System.out.println("Line: " + count++);
						words = temp.split("\t"); 
						if(words.length == 2){
							Implication j = new Implication(words[0], words[1]);
							out.append(temp);
							out.append("\t");
							out.append(j.getImplicationDistance());
							out.append("\n");
						} else if(words.length == 3){
							Implication j = new Implication(words[1], words[2]);
							out.append(temp);
							out.append("\t");
							out.append(j.getImplicationDistance());
							out.append("\n");
						} else if(words.length == 5){
							Implication j = new Implication(words[1], words[4]);
							out.append(temp);
							out.append("\t");
							out.append(j.getImplicationDistance());
							out.append("\n");
						} else {
							Implication j = new Implication(words[1], words[2]);
							out.append(temp);
							out.append("\t");
							out.append(j.getImplicationDistance());
							out.append("\n");
						}
					}
					in.close();
					out.close();
					System.out.println("Write to file " + outputFile.getName() + " complete");
                                        textArea.append("\nWrite to file " + outputFile.getName() + " complete");
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					//e2.printStackTrace();
                                    System.out.println("File error or cancellation");
				}
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Implication i = new Implication(word1.getText(), word2.getText());
//				textArea.append("\n");
//				textArea.append(i.toString());
//	textArea.append("\n" + i.getWordOneOrig()+ "\t" + i.getWordTwoOrig()+ "\t" + i.getImplicationDistance());
        String[] res = (i.getWordOneOrig()+ "\t" + i.getWordTwoOrig()+ "\t" + i.getImplicationDistance()).split("\t");
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.addRow(res);
				//textArea.append("\n" + Arrays.deepToString(i.getDistanceTable()) + "\n");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void word2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_word2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_word2ActionPerformed

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
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("System".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
//                    break;
//                }
//            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField word1;
    private javax.swing.JTextField word2;
    // End of variables declaration//GEN-END:variables
}
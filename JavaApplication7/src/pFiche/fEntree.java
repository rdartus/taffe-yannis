/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pFiche;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import javaapplication7.*;

/**
 *
 * @author CAUBET
 */
public class fEntree extends javax.swing.JFrame {

    /**
     * Creates new form fEntree
     */
    public ArrayList<Lieu> listeLieux = new ArrayList<>();
    public ArrayList<Panneau> listePanneaux = new ArrayList<>();
    public ArrayList<Batterie> listeBatteries = new ArrayList<>();
    public ArrayList<Espace> listeEspaces = new ArrayList<>();

    public fEntree() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
            jLabel32.setText("TEST");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jLabel1.setText("CHOIX TECHNO");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/panneaux-solaires-icone.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jLabel3.setText("Modules PV");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Globe.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jLabel5.setText("Lieu");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BATTERIE VICTRON AGM 60AH.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jLabel7.setText("Batteries");

        jButton1.setText("Valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Poly", "Mono", "Amorphe" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lisbonne", "Paris", "Ouagadougou" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GEL", "AGM", "TESLA" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nord ", "Sud", "Est", "Ouest" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Inclinaison 1", "Inclinaison 2", "Inclinaison 3", "Inclinaison 4" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Boussole.png"))); // NOI18N

        jLabel9.setText("*");

        jLabel13.setText("*");

        jLabel14.setText("*");

        jLabel15.setText("*");

        jLabel16.setText("*");

        jLabel10.setText("*");

        jLabel11.setText("*");

        jLabel17.setText("*");

        jLabel12.setText("*");

        jLabel21.setText("*");

        jLabel22.setText("*");

        jTextField1.setText("Surface");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setText("Retour");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jLabel18.setText("RESULTATS");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        jLabel19.setText("Autoprod");

        jLabel20.setText("Autoconso");

        jLabel23.setText("Nb panneaux/surface tot");

        jLabel24.setText("Puissance install");

        jLabel25.setText("Invest");

        jLabel26.setText("Prix stockage");

        jLabel27.setText("Stockage total");

        jLabel28.setText("Nb batteries");

        jLabel29.setText("Prix total");

        jLabel30.setText("GAIN");

        jLabel31.setText("ENV");

        jLabel32.setText("lalala");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14)))
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel17))
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(22, 22, 22)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel16))
                                        .addGap(0, 34, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel22)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25))
                                .addGap(110, 110, 110)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel26)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel30)
                                .addGap(59, 59, 59)
                                .addComponent(jLabel31))
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel19)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16))
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15))
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addGap(11, 11, 11)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addComponent(jLabel29))
                        .addGap(83, 83, 83))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        switch (jComboBox1.getSelectedItem().toString()) {
            case "Poly":
                jLabel14.setText("Blabla Poly c la vi");
                jLabel9.setText("Surface 1.68");
                jLabel10.setText("Rendement 15.5");
                jLabel11.setText("Puissance 260");
                jLabel17.setText("Prix 239");
             
                break;
            case "Mono":
                jLabel14.setText("Blabla Mono c la vi");
                jLabel9.setText("Surface 1.61");
                jLabel10.setText("Rendement 17.1");
                jLabel11.setText("Puissance 280");
                jLabel17.setText("Prix 268");
                break;
            case "Amorphe":
                jLabel14.setText("Blabla Amorphe c la vi");
                 jLabel9.setText("Surface 0.79");
                jLabel10.setText("Rendement 8");
                jLabel11.setText("Puissance 50");
                jLabel12.setText("Prix 45");
                break;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        

        //mettre un while pas toutes les cases remplies rester sur la page

        // TODO add your handling code here:
        // Récupérer les valeurs de chacune des combobox
        String module = jComboBox1.getSelectedItem().toString();
        String lieu = jComboBox2.getSelectedItem().toString();
        String batterie = jComboBox3.getSelectedItem().toString();
        String orientation = jComboBox4.getSelectedItem().toString();
        String inclinaison = jComboBox5.getSelectedItem().toString();


        
        
        
        // Analyser l'entrée utilisateur pour chacune des combobox
        // Selon le résultat, trouver l'obJET jAVA correspondant
        Lieu lieuEntre = getLieuParNom(lieu);
        // faire pareil pour Batterie & Panneau
        Batterie batterieEntree = getBatterieParNom(batterie);
        Panneau panneauEntree = getPanneauParNom(module);
        Espace maizEntree = listeEspaces.get(1);//????????????????????
        
       // puis appeler la fonction mathématique :
        double consotot;
        consotot = MathOperation.consotot(listeLieux);//param : Espace.consohh

        int or;
        switch (orientation) {
            case "Nord":
                or=1;
                break;
            case "Sud":
                or=2;
                break;
            case "Est":
                or=3;
                break;
            default:
                or=4;
                break;
        }
        
               
               maizEntree.setOrientation(or) ;
               maizEntree.setSurfacedispo(Integer.parseInt(jTextField1.getSelectedText()));

       int incl;
        switch (inclinaison) {
            case "inclinaison1":
                incl=1;
                break;
            case "inclinaison2":
                incl=2;
                break;
            default:
                incl=3;
                break;
        }
        maizEntree.setInclinaison(incl);

        double coefperte; 
        coefperte=MathOperation.coefperte(maizEntree);//param : espace maiz
        double energieprodpan;
        energieprodpan=MathOperation.energy_prod(panneauEntree, lieuEntre, maizEntree);//pan li maiz
        double surfacelibre;
        surfacelibre=MathOperation.surface_installee_libre(consotot, energieprodpan, panneauEntree);
        double surface;
        surface=MathOperation.surface_installee(maizEntree, panneauEntree); //null=maiz
        if (surfacelibre < maizEntree.getSurfacedispo()){ //pour ne pas surdim
            surface = surfacelibre;
        }
        else {
    }
       // panneauEntree.arrayprod=MathOperation.prodhh (Panneau pan, ArrayList prodh, ArrayList Irrh, double coefperte, double surface)              calcul prodhh
        
        double prodtot;
        prodtot=MathOperation.prodtot(listeLieux); 
        
        ArrayList consostock ;
        
        //consostock=MathOperation.consostock( consohh,prodhh);
        
        int nbbat;
        nbbat=MathOperation.nbBat(prodtot, batterieEntree);
        double gainEnv;
        gainEnv=MathOperation.GainEnv(prodtot);
        double gainkwh;
        gainkwh=MathOperation.calculerGain(prodtot);
        double tarifbat;
        tarifbat=MathOperation.tarif(nbbat, batterieEntree);
        double autoprod;
        autoprod = MathOperation.Autoprod(prodtot, consotot);
        double autoconso;
        autoconso=1;
        
                    double nbpan=(surface/panneauEntree.getSurfacep());
                    jLabel32.setText(Double.toString(nbpan));
                    jLabel23.setText(Double.toString(surface));
                    
                    double pinstal;
                    pinstal = nbpan*panneauEntree.getPuissance();
                    jLabel24.setText(Double.toString(pinstal));

                    double investpan;
                    investpan = nbpan*panneauEntree.getPrix();
                    jLabel25.setText(Double.toString(investpan));
                    
                    jLabel26.setText(Double.toString(tarifbat));
                    
                    double totstock =0; //il faut le calculer
                    jLabel27.setText(Double.toString(totstock));
                    
                    jLabel28.setText(Double.toString(nbbat));
                    
                    double prixtot;
                    prixtot = tarifbat+ investpan;
                    jLabel29.setText(Double.toString(prixtot));
                    
                    jLabel30.setText(Double.toString(gainkwh));
                    
                    jLabel31.setText(Double.toString(gainEnv));

                    
                    
                   

                    

       
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
         switch (jComboBox2.getSelectedItem().toString()) {
            case "Paris":
                jLabel15.setText("Blabla Paris c la vi");
                break;
            case "Lisbonne":
                jLabel15.setText("Blabla Lisbonne c la vi");
                break;
            
        }// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
 switch (jComboBox3.getSelectedItem().toString()) {
            case "GEL":
                jLabel16.setText("Blabla GEL c la vi");
                 jLabel12.setText("Capa 1320");
                jLabel13.setText("Voltage 12");
                jLabel21.setText("Nb cycles 2500");
                jLabel22.setText("Prix 549");
                break;
            case "AGM":
                jLabel16.setText("Blabla AGM c la vi");
                 jLabel12.setText("Capa 220");
                jLabel13.setText("Voltage 12");
                jLabel21.setText("Nb cycles 600");
                jLabel22.setText("Prix 527");
                break;
            case "TESLA":
                jLabel16.setText("Blabla TESLA c la vi");
                 jLabel12.setText("Capa ");
                jLabel13.setText("Voltage");
                jLabel21.setText("Nb cycles");
                jLabel22.setText("Prix");
                break;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new fAccueil().setVisible(true); 
   }//GEN-LAST:event_jButton2ActionPerformed

    public void initialiserVariables() {
        // Code ci-dessous : à répéter pour chacun des lieux à ajouter
        ArrayList listeIrrhtxt = CsvReader.main("Irrh.csv");
        ArrayList listeIrrh = new ArrayList() ;
        
        Iterator it = listeIrrhtxt.iterator();
        while (it.hasNext()) {
            
            double elt = (double)it.next();
            listeIrrh.add(elt);
            
        }
        
        
        Lieu tempLieu = new Lieu(147, "lisbonne", 30, 40, listeIrrh);
        tempLieu.setIrrh(listeIrrh);
        listeLieux.add(tempLieu);
        // idem pour les batteries et les panneaux (créer le constructeur de Panneau et Batterie s'il existe pas)
  
        // Code ci-dessous : à répéter pour chacun des Panneaux à ajouter
        
        
        Panneau tempPan = new Panneau(1.68,15.5,260,239,null,"Poly");
        listePanneaux.add(tempPan);
        
        Panneau tempPan2 = new Panneau(1.61,17.1,280,268,null,"Mono");
        listePanneaux.add(tempPan2);
        
        
        Panneau tempPan3 = new Panneau(0.79,8,50,45,null,"Amorphe");
        listePanneaux.add(tempPan3);
        
         // Code ci-dessous : à répéter pour chacun des Batteries à ajouter
        Batterie tempBat = new Batterie(20,350,5000,2700,"TESLA");
        listeBatteries.add(tempBat);
        
        Batterie tempBat2 = new Batterie(230,12,600,527,"AGM");
        listeBatteries.add(tempBat2);
        
        Batterie tempBat3 = new Batterie(220,12,2500,549,"GEL");
        listeBatteries.add(tempBat3);
        
              
         // Code ci-dessous : à répéter pour chacun des espace à ajouter
        ArrayList listeconsotxt = CsvReader.main("consoh.csv");
        ArrayList listeconso = new ArrayList() ;

        
        Iterator it2 = listeconsotxt.iterator();
        while (it2.hasNext()) {
            
            double elt = (double)it2.next();
            listeconso.add(elt);
            
        }
        
        
        Espace tempEsp = new Espace(1,2.0,3.0,4,listeconso);
        listeEspaces.add(tempEsp);

        
        
    }

    public Lieu getLieuParNom(String nom) {
        
        Iterator<Lieu> it = listeLieux.iterator();

        while (it.hasNext()) {
            Lieu tempo = it.next();
            if (tempo.getNom().equals(nom)) {
                return tempo;
            }
        }

        return null;
    }
    
      public Batterie getBatterieParNom(String nom) {
        Iterator<Batterie> it = listeBatteries.iterator();

        while (it.hasNext()) {
            Batterie tempo = it.next();
            if (tempo.getNom().equals(nom)) {
                return tempo;
            }
        }

        return null;
    }
      
      
        public Panneau getPanneauParNom(String nom) {
        Iterator<Panneau> it = listePanneaux.iterator();

        while (it.hasNext()) {
            Panneau tempo = it.next();
            if (tempo.getNom().equals(nom)) {
                return tempo;
            }
        }
        
        
        return null;
    }
    // faire getBatterieParNom
    // faire getPanneauParNom
        
       
      

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fEntree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fEntree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fEntree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fEntree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new fEntree().setVisible(true);
                // initialiserVariables();
            }
        });
    }
  
    double test=1.0;
    
    public double gettest(){
        
        return test;
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

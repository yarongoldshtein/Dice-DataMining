/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamining;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author yaron
 */
public class gui extends javax.swing.JFrame {

    String pathD = null;
    String pathR = null;

    /**
     * Creates new form gui
     */
    public gui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        DiceResultT = new javax.swing.JTextField();
        longestDice = new javax.swing.JTextField();
        RollB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        longestDResult = new javax.swing.JTextField();
        RollNum = new javax.swing.JTextField();
        chooseT = new javax.swing.JTextField();
        browseB = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        analyzeDice = new javax.swing.JButton();
        sequenceDice = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        errorTD = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        RouletteNum = new javax.swing.JTextField();
        Spin = new javax.swing.JButton();
        analyzeR = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        errorTR = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        RouletteResultT = new javax.swing.JTextField();
        sequenceRoulette = new javax.swing.JButton();
        longestRoulette = new javax.swing.JTextField();
        longestRResult = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        browseB1 = new javax.swing.JButton();
        chooseT1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("ANALYZER"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        DiceResultT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiceResultTActionPerformed(evt);
            }
        });

        longestDice.setText("1");

        RollB.setText("Roll");
        RollB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RollBActionPerformed(evt);
            }
        });

        jLabel1.setText("Roll the Dice");

        RollNum.setText("10000");
        RollNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RollNumActionPerformed(evt);
            }
        });

        browseB.setText("Browse");
        browseB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBActionPerformed(evt);
            }
        });

        jLabel5.setText("Choose file for dice:");

        analyzeDice.setText("Analyze Dice");
        analyzeDice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzeDiceActionPerformed(evt);
            }
        });

        sequenceDice.setText("longest sequence Dice");
        sequenceDice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sequenceDiceActionPerformed(evt);
            }
        });

        jLabel7.setText("Approximation error:");

        errorTD.setText("1");

        jLabel8.setText("%");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dice.gif"))); // NOI18N
        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(RollNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RollB)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(browseB)
                        .addGap(28, 28, 28)
                        .addComponent(chooseT, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorTD, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sequenceDice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(longestDice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(longestDResult, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(analyzeDice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DiceResultT, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(93, 93, 93)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(RollNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RollB)
                    .addComponent(jLabel5)
                    .addComponent(browseB)
                    .addComponent(chooseT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(errorTD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(analyzeDice)
                            .addComponent(DiceResultT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sequenceDice)
                            .addComponent(longestDice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(longestDResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dice", jPanel1);

        jLabel2.setText("Spin the Roulette");

        RouletteNum.setText("10000");
        RouletteNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RouletteNumActionPerformed(evt);
            }
        });

        Spin.setText("Spin");
        Spin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpinActionPerformed(evt);
            }
        });

        analyzeR.setText("Analyze Roulette");
        analyzeR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzeRActionPerformed(evt);
            }
        });

        jLabel3.setText("Approximation error:");

        errorTR.setText("1");
        errorTR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorTRActionPerformed(evt);
            }
        });

        jLabel4.setText("%");

        sequenceRoulette.setText("longest sequence Roulette");
        sequenceRoulette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sequenceRouletteActionPerformed(evt);
            }
        });

        longestRoulette.setText("1");

        jLabel6.setText("Choose file for roulette:");

        browseB1.setText("Browse ");
        browseB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseB1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roulette.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(RouletteNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Spin)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(browseB1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chooseT1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(errorTR, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(analyzeR)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RouletteResultT, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(sequenceRoulette)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(longestRoulette, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(longestRResult)
                                .addGap(32, 32, 32)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(128, 128, 128))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RouletteNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Spin)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(browseB1)
                    .addComponent(chooseT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(errorTR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(analyzeR)
                            .addComponent(RouletteResultT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sequenceRoulette)
                            .addComponent(longestRoulette, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(longestRResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton2))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Roulette", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RollNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RollNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RollNumActionPerformed

    private void RouletteNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RouletteNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RouletteNumActionPerformed

    private void RollBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RollBActionPerformed
        try {
            DiceResultT.setText("");
            longestDResult.setText("");
            PrintWriter writer = new PrintWriter("Dice.txt");
            int downRow = 0;
            for (int i = 0; i < Integer.parseInt(RollNum.getText()); i++) {
                if (downRow == 100) {
                    writer.println();
                    downRow = 0;
                }
                Random r = new SecureRandom();
                int rand = r.nextInt();
                int x = Math.abs(rand % 6) + 1;
                writer.print(x + ",");
                downRow++;
            }
            writer.close();
        } catch (IOException e) {
            // do something
        }
    }//GEN-LAST:event_RollBActionPerformed

    private void SpinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpinActionPerformed
        try {
            RouletteResultT.setText("");
            longestRResult.setText("");
            PrintWriter writer = new PrintWriter("Roulette.txt");
            int downRow = 0;
            for (int i = 0; i < Integer.parseInt(RouletteNum.getText()); i++) {
                if (downRow == 100) {
                    writer.println();
                    downRow = 0;
                }
                writer.print((int) (Math.random() * 37) + ",");
                downRow++;
            }
            writer.close();
        } catch (IOException e) {
            // do something
        }    }//GEN-LAST:event_SpinActionPerformed

    private void analyzeDiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeDiceActionPerformed
        try {
            BufferedReader br;
            if (pathD == null) {
                br = new BufferedReader(new FileReader("Dice.txt"));
            } else {
                br = new BufferedReader(new FileReader(pathD));
            }
            try {
                String line;
                int[] count = new int[6];
                while ((line = br.readLine()) != null) {
                    String[] words = line.split(",");
                    for (int i = 0; i < words.length; i++) {
                        int number = Integer.parseInt(words[i]);
                        count[number - 1]++;
                    }
                }
                double[] result = new double[6];
                for (int i = 0; i < count.length; i++) {
                    result[i] = count[i] / Double.parseDouble(RollNum.getText());
                }
                double tohelet = 0;
                for (int i = 0; i < result.length; i++) {
                    tohelet += (result[i] * (i + 1));
                }
                String[] percentage = new String[6];
                for (int i = 0; i < percentage.length; i++) {
                    percentage[i] = String.format("%.3f", result[i]);
                }
                br.close();
                PrintWriter writer = new PrintWriter("Dice Results.txt");
                boolean isFair = true;
                double epsilon = 0.01 * Double.parseDouble(errorTD.getText());
                for (int i = 0; i < count.length; i++) {
                    if ((tohelet > 3.5 + epsilon) || (tohelet < 3.5 - epsilon)) {
                        isFair = false;
                    }
                }
                if (isFair) {
                    DiceResultT.setText("the Dice is fair");
                    writer.println("the Dice is fair");
                    writer.println("Distribution of results: (in percentage)" + Arrays.toString(percentage));
                } else {
                    DiceResultT.setText("the Dice isn't fair");
                    writer.println("the Dice isn't fair");
                    writer.println("Distribution of results: (in percentage)" + Arrays.toString(percentage));
                }

                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            DiceResultT.setText("Eror: need 'Dice.txt' file");
        }
    }//GEN-LAST:event_analyzeDiceActionPerformed

    private void analyzeRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeRActionPerformed
        try {
            BufferedReader br;
            if (pathR == null) {
                br = new BufferedReader(new FileReader("Roulette.txt"));
            } else {
                br = new BufferedReader(new FileReader(pathR));
            }
            try {
                String line;
                int[] count = new int[37];
                while ((line = br.readLine()) != null) {
                    String[] words = line.split(",");
                    for (int i = 0; i < words.length; i++) {
                        int number = Integer.parseInt(words[i]);
                        count[number]++;
                    }
                }
                br.close();
                PrintWriter writer = new PrintWriter("Roulette Results.txt");
                double[] result = new double[37];
                for (int i = 0; i < count.length; i++) {
                    result[i] = count[i] / Double.parseDouble(RouletteNum.getText());
                }
                double tohelet = 0;
                for (int i = 0; i < result.length; i++) {
                    tohelet += (result[i] * i);
                }
                String[] percentage = new String[37];
                for (int i = 0; i < percentage.length; i++) {
                    percentage[i] = String.format("%.3f", result[i]);
                }
                boolean isFair = true;
                double epsilon = 0.025 * Double.parseDouble(errorTR.getText());
                for (int i = 0; i < count.length; i++) {
                    if ((tohelet > 18 + epsilon) || (tohelet < 18 - epsilon)) {
                        isFair = false;
                    }
                }
                if (isFair) {
                    RouletteResultT.setText("the Roulette is fair");
                    writer.println("the Roulette is fair");
                    writer.println("Distribution of results: (in percentage)" + Arrays.toString(percentage));
                } else {
                    RouletteResultT.setText("the Roulette isn't fair");
                    writer.println("the Roulette isn't fair");
                    writer.println("Distribution of results: (in percentage)" + Arrays.toString(percentage));
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            RouletteResultT.setText("Eror: need 'Roulette.txt' file");
        }

    }//GEN-LAST:event_analyzeRActionPerformed

    private void errorTRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorTRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_errorTRActionPerformed

    private void browseBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBActionPerformed
        File workingDirectory = new File(System.getProperty("user.dir"));
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(workingDirectory);
        FileNameExtensionFilter fileExtensionFilter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        chooser.setFileFilter(fileExtensionFilter);
        chooser.setDialogTitle("Open");
        int NOTC = chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        if (NOTC == JFileChooser.APPROVE_OPTION) {
            pathD = file.getAbsolutePath();
            chooseT.setText(pathD);
        }
    }//GEN-LAST:event_browseBActionPerformed

    private void DiceResultTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiceResultTActionPerformed

    }//GEN-LAST:event_DiceResultTActionPerformed

    private void sequenceDiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sequenceDiceActionPerformed
        try {
            int longestRouletteNum = Integer.parseInt(longestDice.getText());
            if ((longestRouletteNum > 0) && (longestRouletteNum < 7)) {
        try {
            BufferedReader br;
            if (pathD == null) {
                br = new BufferedReader(new FileReader("Dice.txt"));
            } else {
                br = new BufferedReader(new FileReader(pathD));
            }
            String line;
            int count = 0, max = 0;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(",");
                if (Integer.parseInt(words[0]) != Integer.parseInt(longestDice.getText())) {
                    count = 0;
                }
                for (int i = 0; i < words.length; i++) {
                    if (Integer.parseInt(words[i]) == Integer.parseInt(longestDice.getText())) {
                        count++;
                        for (int j = i + 1; j < words.length; j++) {
                            if (Integer.parseInt(words[j]) == Integer.parseInt(longestDice.getText())) {
                                count++;
                                i = j + 1;
                            } else {
                                i = j + 1;
                                max = Math.max(max, count);
                                count = 0;
                                break;
                            }
                        }
                    }
                }
            }
            br.close();
            longestDResult.setText("the longest sequence of " + longestDice.getText() + " is: " + max);

            PrintWriter writer = new PrintWriter(new FileWriter("Dice Results.txt", true));
            writer.append("\nthe longest sequence of " + longestDice.getText() + " is: " + max);
            writer.close();

        } catch (IOException ex) {
            longestDResult.setText("Eror: need 'Dice.txt' file");
        }
        } else {
                longestDResult.setText("Please enter an Integer between 1 to 6");
            }
        } catch (Exception e) {
            longestDResult.setText("Please enter an Integer");
        } 
    }//GEN-LAST:event_sequenceDiceActionPerformed

    private void sequenceRouletteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sequenceRouletteActionPerformed
        try {
            int longestRouletteNum = Integer.parseInt(longestRoulette.getText());
            if ((longestRouletteNum >= 0) && (longestRouletteNum < 37)) {
                try {
                    BufferedReader br;
                    if (pathR == null) {
                        br = new BufferedReader(new FileReader("Roulette.txt"));
                    } else {
                        br = new BufferedReader(new FileReader(pathR));
                    }
                    String line;
                    int count = 0, max = 0;
                    while ((line = br.readLine()) != null) {
                        String[] words = line.split(",");
                        if (Integer.parseInt(words[0]) != Integer.parseInt(longestRoulette.getText())) {
                            count = 0;
                        }
                        for (int i = 0; i < words.length; i++) {
                            if (Integer.parseInt(words[i]) == Integer.parseInt(longestRoulette.getText())) {
                                count++;
                                for (int j = i + 1; j < words.length; j++) {
                                    if (Integer.parseInt(words[j]) == Integer.parseInt(longestRoulette.getText())) {
                                        count++;
                                        i = j + 1;
                                    } else {
                                        i = j + 1;
                                        max = Math.max(max, count);
                                        count = 0;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    br.close();
                    longestRResult.setText("the longest sequence of " + longestRoulette.getText() + " is: " + max);

                    PrintWriter writer = new PrintWriter(new FileWriter("Roulette Results.txt", true));
                    writer.append("\nthe longest sequence of " + longestDice.getText() + " is: " + max);
                    writer.close();

                } catch (IOException ex) {
                    longestRResult.setText("Eror: need 'Roulette.txt' file");
                }
            } else {
                longestRResult.setText("Please enter an Integer between 0 to 36");
            }
        } catch (Exception e) {
            longestRResult.setText("Please enter an Integer");
        } 
    }//GEN-LAST:event_sequenceRouletteActionPerformed

    private void browseB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseB1ActionPerformed
        File workingDirectory = new File(System.getProperty("user.dir"));
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(workingDirectory);
        FileNameExtensionFilter fileExtensionFilter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        chooser.setFileFilter(fileExtensionFilter);
        chooser.setDialogTitle("Open");
        int NOTC = chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        if (NOTC == JFileChooser.APPROVE_OPTION) {
            pathR = file.getAbsolutePath();
            chooseT1.setText(pathR);
    }//GEN-LAST:event_browseB1ActionPerformed
    }

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DiceResultT;
    private javax.swing.JButton RollB;
    private javax.swing.JTextField RollNum;
    private javax.swing.JTextField RouletteNum;
    private javax.swing.JTextField RouletteResultT;
    private javax.swing.JButton Spin;
    private javax.swing.JButton analyzeDice;
    private javax.swing.JButton analyzeR;
    private javax.swing.JButton browseB;
    private javax.swing.JButton browseB1;
    private javax.swing.JTextField chooseT;
    private javax.swing.JTextField chooseT1;
    private javax.swing.JTextField errorTD;
    private javax.swing.JTextField errorTR;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField longestDResult;
    private javax.swing.JTextField longestDice;
    private javax.swing.JTextField longestRResult;
    private javax.swing.JTextField longestRoulette;
    private javax.swing.JButton sequenceDice;
    private javax.swing.JButton sequenceRoulette;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

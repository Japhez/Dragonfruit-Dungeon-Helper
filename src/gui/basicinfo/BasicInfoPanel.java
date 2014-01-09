/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.basicinfo;

import character.CharacterBasicInfo;
import character.Player;
import enumerations.Alignment;
import savestate.DataRetrievalManager;
import savestate.StateReader;

/**
 *
 * @author Japhez
 */
public final class BasicInfoPanel extends javax.swing.JPanel implements StateReader {

    private Player player;
    private CharacterBasicInfo info;

    /**
     * Creates new form GeneralPanel
     */
    public BasicInfoPanel(Player player) {
        this.player = player;
        //If the player info is null, the user must've closed the program
        if (player == null) {
            System.exit(0);
        }
        this.info = player.getBasicInfo();
        initComponents();
        DataRetrievalManager.linkReader(this, info);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel60 = new javax.swing.JLabel();
        characterInfoDeityLabel = new javax.swing.JLabel();
        characterInfoGenderLabel = new javax.swing.JLabel();
        characterInfoNameLabel = new javax.swing.JLabel();
        characterInfoAlignmentLabel = new javax.swing.JLabel();
        characterInformationButton = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        characterInfoRaceLabel = new javax.swing.JLabel();
        characterInfoAgeLabel = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        characterInfoSizeLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel777 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        characterInfoHeightLabel = new javax.swing.JLabel();
        characterInfoWeightLabel = new javax.swing.JLabel();
        characterInfoEyesLabel = new javax.swing.JLabel();
        characterInfoHairLabel = new javax.swing.JLabel();
        characterInfoSkinLabel = new javax.swing.JLabel();
        characterClassLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        characterInfoSpeedLabel = new javax.swing.JLabel();

        jLabel60.setText("Alignment:");

        characterInfoDeityLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        characterInfoDeityLabel.setText("jLabel63");

        characterInfoGenderLabel.setText("jLabel47");

        characterInfoNameLabel.setFont(new java.awt.Font("Old English Text MT", 1, 36)); // NOI18N
        characterInfoNameLabel.setText("No One");

        characterInfoAlignmentLabel.setText("jLabel61");

        characterInformationButton.setText("Change Character Information");
        characterInformationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                characterInformationButtonActionPerformed(evt);
            }
        });

        jLabel64.setText("Age:");

        jLabel33.setText("Race:");

        jLabel34.setText("Size:");

        jLabel62.setText("Patron Deity:");

        characterInfoRaceLabel.setText("jLabel44");

        characterInfoAgeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        characterInfoAgeLabel.setText("jLabel65");

        jLabel46.setText("Gender:");

        characterInfoSizeLabel.setText("jLabel45");

        jLabel1.setText("Height:");

        jLabel2.setText("Weight (lbs):");

        jLabel3.setText("Eyes:");

        jLabel4.setText("Hair:");

        jLabel777.setText("Class:");

        jLabel6.setText("Skin:");

        characterInfoHeightLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        characterInfoHeightLabel.setText("jLabel7");

        characterInfoWeightLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        characterInfoWeightLabel.setText("jLabel8");

        characterInfoEyesLabel.setText("jLabel9");

        characterInfoHairLabel.setText("jLabel10");

        characterInfoSkinLabel.setText("jLabel11");

        characterClassLabel.setText("jLabel5");

        jLabel5.setText("Speed:");

        characterInfoSpeedLabel.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel777)
                    .addComponent(characterInfoNameLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel5))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(characterInfoSpeedLabel)
                                    .addComponent(characterInfoGenderLabel)
                                    .addComponent(characterInfoRaceLabel)
                                    .addComponent(characterInfoSizeLabel)
                                    .addComponent(characterClassLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel62)
                                            .addComponent(jLabel64)
                                            .addComponent(jLabel1))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(characterInfoDeityLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(characterInfoAgeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(characterInfoHeightLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel60)
                                        .addGap(18, 18, 18)
                                        .addComponent(characterInfoAlignmentLabel))))
                            .addComponent(characterInformationButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(characterInfoWeightLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(characterInfoEyesLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(characterInfoHairLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(characterInfoSkinLabel, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addGap(197, 197, 197))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(characterInfoNameLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel777)
                    .addComponent(characterClassLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel34))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(characterInfoRaceLabel)
                                    .addComponent(jLabel60)
                                    .addComponent(characterInfoAlignmentLabel))
                                .addGap(18, 18, 18)
                                .addComponent(characterInfoSizeLabel)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(characterInfoGenderLabel)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel64)
                            .addComponent(characterInfoSpeedLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(characterInfoAgeLabel)
                            .addGap(18, 18, 18)
                            .addComponent(characterInfoHeightLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(characterInfoWeightLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel62)
                                    .addComponent(characterInfoDeityLabel))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(characterInfoEyesLabel)
                                .addGap(18, 18, 18)
                                .addComponent(characterInfoHairLabel)
                                .addGap(18, 18, 18)
                                .addComponent(characterInfoSkinLabel)))))
                .addGap(18, 18, 18)
                .addComponent(characterInformationButton)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void characterInformationButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_characterInformationButtonActionPerformed
    {//GEN-HEADEREND:event_characterInformationButtonActionPerformed
        BasicInfoDialog generalInformationDialog = new BasicInfoDialog(this, true, player);
        generalInformationDialog.pack();
        generalInformationDialog.setLocationRelativeTo(getRootPane());
        generalInformationDialog.setVisible(true);
        loadInfo();
    }//GEN-LAST:event_characterInformationButtonActionPerformed

    @Override
    public void loadInfo() {
        if (DataRetrievalManager.isDataChanged(info, this)) {
            characterInfoNameLabel.setText("" + info.getName());
            if (player.getClassInfo().getInitialClass() != null) {
                characterClassLabel.setText(player.getClassInfo().getInitialClass().getName());
            } else {
                characterClassLabel.setText("Jobless layabout");
            }
            characterInfoAgeLabel.setText("" + info.getAge());
            if (info.getAlignment().equals(Alignment.TRUE_NEUTRAL)) {
                characterInfoAlignmentLabel.setText("True Neutral");
            } else {
                characterInfoAlignmentLabel.setText("" + info.getAlignment());
            }
            characterInfoDeityLabel.setText("" + info.getDeity());
            characterInfoGenderLabel.setText("" + info.getGender());
            characterInfoRaceLabel.setText("" + info.getRace());
            characterInfoSizeLabel.setText("" + info.getSize());
            characterInfoSpeedLabel.setText("" + info.getSpeed());
            String height = "";
            if (info.getHeightFeet() != 0) {
                height += info.getHeightFeet() + " ft.";
            }
            if (info.getHeightInches() != 0) {
                height += " " + info.getHeightInches() + " in.";
            }
            characterInfoHeightLabel.setText(height);
            characterInfoWeightLabel.setText("" + info.getWeight());
            characterInfoEyesLabel.setText("" + info.getEyeColor());
            characterInfoHairLabel.setText("" + info.getHairColor());
            characterInfoSkinLabel.setText("" + info.getSkinColor());
            DataRetrievalManager.dataRead(info, this);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel characterClassLabel;
    private javax.swing.JLabel characterInfoAgeLabel;
    private javax.swing.JLabel characterInfoAlignmentLabel;
    private javax.swing.JLabel characterInfoDeityLabel;
    private javax.swing.JLabel characterInfoEyesLabel;
    private javax.swing.JLabel characterInfoGenderLabel;
    private javax.swing.JLabel characterInfoHairLabel;
    private javax.swing.JLabel characterInfoHeightLabel;
    private javax.swing.JLabel characterInfoNameLabel;
    private javax.swing.JLabel characterInfoRaceLabel;
    private javax.swing.JLabel characterInfoSizeLabel;
    private javax.swing.JLabel characterInfoSkinLabel;
    private javax.swing.JLabel characterInfoSpeedLabel;
    private javax.swing.JLabel characterInfoWeightLabel;
    private javax.swing.JButton characterInformationButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel777;
    // End of variables declaration//GEN-END:variables
}

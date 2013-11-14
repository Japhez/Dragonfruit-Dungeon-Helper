package gui.classes;

import character.Player;
import interfaces.CharacterInfoRetriever;

/**
 *
 * @author Japhez
 */
public class AbilityPanel extends javax.swing.JPanel implements CharacterInfoRetriever {

    private Player player;

    public AbilityPanel(Player player) {
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

        classPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        abilitiesMoreInfoButton = new javax.swing.JButton();
        abilitiesRemoveAbilityButton = new javax.swing.JButton();
        abililitiesAddAbilityButton = new javax.swing.JButton();
        abilityScrollPane2 = new javax.swing.JScrollPane();
        abilityList = new javax.swing.JList();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        selectedAbilityInfoPanel = new javax.swing.JPanel();
        abilityNameLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        abilityDescriptionTextArea = new javax.swing.JTextArea();

        abilitiesMoreInfoButton.setText("More Info");

        abilitiesRemoveAbilityButton.setText("Remove Ability");

        abililitiesAddAbilityButton.setText("Add Ability");
        abililitiesAddAbilityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abililitiesAddAbilityButtonActionPerformed(evt);
            }
        });

        abilityList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        abilityScrollPane2.setViewportView(abilityList);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("[class Abilities]");

        abilityNameLabel.setText("[ability name]");

        abilityDescriptionTextArea.setEditable(false);
        abilityDescriptionTextArea.setColumns(20);
        abilityDescriptionTextArea.setLineWrap(true);
        abilityDescriptionTextArea.setRows(5);
        abilityDescriptionTextArea.setWrapStyleWord(true);
        abilityDescriptionTextArea.setAutoscrolls(false);
        abilityDescriptionTextArea.setBorder(null);
        jScrollPane5.setViewportView(abilityDescriptionTextArea);

        javax.swing.GroupLayout selectedAbilityInfoPanelLayout = new javax.swing.GroupLayout(selectedAbilityInfoPanel);
        selectedAbilityInfoPanel.setLayout(selectedAbilityInfoPanelLayout);
        selectedAbilityInfoPanelLayout.setHorizontalGroup(
            selectedAbilityInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectedAbilityInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(selectedAbilityInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addGroup(selectedAbilityInfoPanelLayout.createSequentialGroup()
                        .addComponent(abilityNameLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        selectedAbilityInfoPanelLayout.setVerticalGroup(
            selectedAbilityInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectedAbilityInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abilityNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(abilityScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(selectedAbilityInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(abilitiesMoreInfoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(abililitiesAddAbilityButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(abilitiesRemoveAbilityButton)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(300, 300, 300)
                    .addComponent(jLabel10)
                    .addContainerGap(160, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectedAbilityInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(abilityScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abilitiesMoreInfoButton)
                    .addComponent(abililitiesAddAbilityButton)
                    .addComponent(abilitiesRemoveAbilityButton))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(138, 138, 138)
                    .addComponent(jLabel10)
                    .addContainerGap(160, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout classPanelLayout = new javax.swing.GroupLayout(classPanel);
        classPanel.setLayout(classPanelLayout);
        classPanelLayout.setHorizontalGroup(
            classPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        classPanelLayout.setVerticalGroup(
            classPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(classPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(classPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void abililitiesAddAbilityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abililitiesAddAbilityButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abililitiesAddAbilityButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abililitiesAddAbilityButton;
    private javax.swing.JButton abilitiesMoreInfoButton;
    private javax.swing.JButton abilitiesRemoveAbilityButton;
    private javax.swing.JTextArea abilityDescriptionTextArea;
    private javax.swing.JList abilityList;
    private javax.swing.JLabel abilityNameLabel;
    private javax.swing.JScrollPane abilityScrollPane2;
    private javax.swing.JPanel classPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel selectedAbilityInfoPanel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void loadInfo() {
        
    }
}
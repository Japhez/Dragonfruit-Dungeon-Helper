package gui;

import abstracts.Ability;
import character.CharacterClassInfo;
import character.classes.CharacterClass;
import javax.swing.DefaultListModel;

/**
 *
 * @author Japhez
 */
public class ClassPanel extends javax.swing.JPanel {

    private CharacterClass characterClass;

    ClassPanel(CharacterClassInfo classInfo) {
        this.characterClass = classInfo.getInitialClass();
        initComponents();
        initializeAbilityList();
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        classNotesTextArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        abilitiesMoreInfoButton1 = new javax.swing.JButton();
        abilitiesRemoveAbilityButton1 = new javax.swing.JButton();
        abililitiesAddAbilityButton1 = new javax.swing.JButton();
        abilityScrollPane2 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        selectedSpellInfo = new javax.swing.JPanel();
        spellNameLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        spellDescriptionTextArea = new javax.swing.JTextArea();

        jLabel16.setText("Class notes:");

        classNotesTextArea.setColumns(20);
        classNotesTextArea.setLineWrap(true);
        classNotesTextArea.setRows(5);
        classNotesTextArea.setTabSize(4);
        classNotesTextArea.setText("[insert your class notes here]");
        classNotesTextArea.setWrapStyleWord(true);
        jScrollPane4.setViewportView(classNotesTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 344, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Class Notes", jPanel1);

        abilitiesMoreInfoButton1.setText("More Info");

        abilitiesRemoveAbilityButton1.setText("Remove Ability");

        abililitiesAddAbilityButton1.setText("Add Ability");
        abililitiesAddAbilityButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abililitiesAddAbilityButton1ActionPerformed(evt);
            }
        });

        jList6.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        abilityScrollPane2.setViewportView(jList6);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Class Abilities/Spells");

        spellNameLabel.setText("[spell name]");

        spellDescriptionTextArea.setEditable(false);
        spellDescriptionTextArea.setColumns(20);
        spellDescriptionTextArea.setLineWrap(true);
        spellDescriptionTextArea.setRows(5);
        spellDescriptionTextArea.setWrapStyleWord(true);
        spellDescriptionTextArea.setAutoscrolls(false);
        spellDescriptionTextArea.setBorder(null);
        jScrollPane5.setViewportView(spellDescriptionTextArea);

        javax.swing.GroupLayout selectedSpellInfoLayout = new javax.swing.GroupLayout(selectedSpellInfo);
        selectedSpellInfo.setLayout(selectedSpellInfoLayout);
        selectedSpellInfoLayout.setHorizontalGroup(
            selectedSpellInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectedSpellInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(selectedSpellInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectedSpellInfoLayout.createSequentialGroup()
                        .addComponent(spellNameLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        selectedSpellInfoLayout.setVerticalGroup(
            selectedSpellInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectedSpellInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spellNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(abilityScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(abilitiesMoreInfoButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(abililitiesAddAbilityButton1)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(abilitiesRemoveAbilityButton1)
                        .addGap(0, 73, Short.MAX_VALUE))
                    .addComponent(selectedSpellInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(300, 300, 300)
                    .addComponent(jLabel10)
                    .addContainerGap(156, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(abilityScrollPane2))
                    .addComponent(selectedSpellInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abilitiesMoreInfoButton1)
                    .addComponent(abilitiesRemoveAbilityButton1)
                    .addComponent(abililitiesAddAbilityButton1))
                .addGap(82, 82, 82))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(138, 138, 138)
                    .addComponent(jLabel10)
                    .addContainerGap(158, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Abilities/Spells", jPanel2);

        javax.swing.GroupLayout classPanelLayout = new javax.swing.GroupLayout(classPanel);
        classPanel.setLayout(classPanelLayout);
        classPanelLayout.setHorizontalGroup(
            classPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, classPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        classPanelLayout.setVerticalGroup(
            classPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classPanelLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(classPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(classPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void abililitiesAddAbilityButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abililitiesAddAbilityButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abililitiesAddAbilityButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abililitiesAddAbilityButton1;
    private javax.swing.JButton abilitiesMoreInfoButton1;
    private javax.swing.JButton abilitiesRemoveAbilityButton1;
    private javax.swing.JScrollPane abilityScrollPane2;
    private javax.swing.JTextArea classNotesTextArea;
    private javax.swing.JPanel classPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JList jList6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel selectedSpellInfo;
    private javax.swing.JTextArea spellDescriptionTextArea;
    private javax.swing.JLabel spellNameLabel;
    // End of variables declaration//GEN-END:variables

    /**
     * Initializes the list that represents this class
     */
    private void initializeAbilityList() {
        DefaultListModel<Ability> abilities = characterClass.getAbilityListModel();
    }
}
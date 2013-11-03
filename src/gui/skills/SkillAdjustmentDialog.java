package gui.skills;

import character.CharacterSkills;
import character.IntegerVerifier;
import character.Player;
import enumerations.Skill;

/**
 *
 * @author Japhez
 */
public class SkillAdjustmentDialog extends javax.swing.JDialog {

    private SkillsPanel parent;
    private Player player;
    private Skill skill;

    /** Creates new form SkillAdjustmentDialog */
    public SkillAdjustmentDialog(SkillsPanel parent, Player player, Skill skill) {
        this.parent = parent;
        this.player = player;
        this.skill = skill;
        initComponents();
        initSkillValues();
    }

    private void initSkillValues() {
        CharacterSkills skills = player.getSkills();
        int skillRank = skills.getSkillRank(skill);
        int keyModifierValue = skills.getKeyModifierValue(skill);
        int otherModifiers = skills.getMiscModifierSkillValue(skill);
        int total = skillRank + keyModifierValue + otherModifiers;
        skillNameTextField.setText("" + skill);
        ranksTextField.setText("" + skillRank);
        ASModifierTextField.setText("" + keyModifierValue);
        otherModifiersTextField.setText("" + otherModifiers);
        totalValueTextField.setText("" + total);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        skillNameTextField = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ranksTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ASModifierTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        otherModifiersTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        totalValueTextField = new javax.swing.JTextField();
        saveChangesButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);

        skillNameTextField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        skillNameTextField.setText("[skill name]");

        jLabel2.setText("Ranks:");

        ranksTextField.setText("jTextField1");
        ranksTextField.setInputVerifier(new IntegerVerifier(0,100));

        jLabel3.setText("Other modifiers:");

        ASModifierTextField.setText("jTextField2");
        ASModifierTextField.setEnabled(false);

        jLabel4.setText("Ability score modifier bonus:");

        otherModifiersTextField.setText("jTextField3");
        otherModifiersTextField.setInputVerifier(new IntegerVerifier(-100,100));

        jLabel1.setText("Total:");

        totalValueTextField.setText("jTextField1");
        totalValueTextField.setEnabled(false);

        saveChangesButton.setText("Save changes");
        saveChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(saveChangesButton)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(skillNameTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totalValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(otherModifiersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(ASModifierTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(ranksTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(skillNameTextField)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ranksTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ASModifierTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(otherModifiersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(totalValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveChangesButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesButtonActionPerformed
        CharacterSkills skills = player.getSkills();
        //If values differ, update player values.
        int ranks = Integer.parseInt(ranksTextField.getText());
        int otherModifiers = Integer.parseInt(otherModifiersTextField.getText());
        if (skills.getSkillRank(skill) != ranks) {
            skills.setSkillRank(skill, ranks);
        }
        if (skills.getMiscModifierSkillValue(skill) != otherModifiers) {
            skills.setSkillModifier(skill, otherModifiers);
        }
        parent.loadInfo();
        this.setVisible(false);
    }//GEN-LAST:event_saveChangesButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ASModifierTextField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField otherModifiersTextField;
    private javax.swing.JTextField ranksTextField;
    private javax.swing.JButton saveChangesButton;
    private javax.swing.JLabel skillNameTextField;
    private javax.swing.JTextField totalValueTextField;
    // End of variables declaration//GEN-END:variables
}

package gui.inventory;

import character.DoubleVerifier;
import character.inventory.Item;
import javax.swing.FocusManager;

/**
 *
 * @author Japhez
 */
public class InventoryAddNewItemDialog extends javax.swing.JDialog {

    private Item item;

    /**
     * Creates new form InventoryAddNewItemDialog
     * @param parent
     * @param modal
     */
    public InventoryAddNewItemDialog(InventoryItemPanel parent, boolean modal) {
        super();
        setModal(modal);
        initComponents();
    }

    public Item getItem() {
        return item;
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
        jLabel1 = new javax.swing.JLabel();
        itemNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemDescriptionTextArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        itemWeightTextField = new javax.swing.JTextField();
        saveItemButton = new javax.swing.JButton();
        discardItemButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add new item");
        setAlwaysOnTop(true);
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setText("Item name:");

        itemNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TabKeyPressed(evt);
            }
        });

        jLabel2.setText("Item description:");

        itemDescriptionTextArea.setColumns(20);
        itemDescriptionTextArea.setLineWrap(true);
        itemDescriptionTextArea.setRows(5);
        itemDescriptionTextArea.setWrapStyleWord(true);
        itemDescriptionTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TabKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(itemDescriptionTextArea);

        jLabel3.setText("Item weight:");

        itemWeightTextField.setInputVerifier(new DoubleVerifier(0,1000000));
        itemWeightTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TabKeyPressed(evt);
            }
        });

        saveItemButton.setText("Save item");
        saveItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveItemButtonActionPerformed(evt);
            }
        });

        discardItemButton.setText("Discard item");
        discardItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(saveItemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                        .addComponent(discardItemButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(itemWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(itemNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(itemNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(itemWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveItemButton)
                    .addComponent(discardItemButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveItemButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_saveItemButtonActionPerformed
    {//GEN-HEADEREND:event_saveItemButtonActionPerformed
        String name = itemNameTextField.getText();
        String description = itemDescriptionTextArea.getText();
        double weight;
        try {
            weight = Double.parseDouble(itemWeightTextField.getText());
        } catch (NumberFormatException e) {
            weight = 0;
        }
        item = new Item(name, description, weight);
        this.setVisible(false);
    }//GEN-LAST:event_saveItemButtonActionPerformed

    private void discardItemButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_discardItemButtonActionPerformed
    {//GEN-HEADEREND:event_discardItemButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_discardItemButtonActionPerformed

    private void TabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabKeyPressed
        if (evt.getExtendedKeyCode() == 9) {
            evt.consume();
            FocusManager.getCurrentManager().focusNextComponent();
        }
    }//GEN-LAST:event_TabKeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton discardItemButton;
    private javax.swing.JTextArea itemDescriptionTextArea;
    private javax.swing.JTextField itemNameTextField;
    private javax.swing.JTextField itemWeightTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveItemButton;
    // End of variables declaration//GEN-END:variables
}

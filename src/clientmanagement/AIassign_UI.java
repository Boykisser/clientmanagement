/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientmanagement;

/**
 *
 * @author DLawrence
 */
public class AIassign_UI extends javax.swing.JFrame {

    /**
     * Creates new form AIassign_UI
     */
    public AIassign_UI() {
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

        jPanel1 = new javax.swing.JPanel();
        lblActionItemAssignment = new javax.swing.JLabel();
        lblSearchActionItem = new javax.swing.JLabel();
        txtSearchActionItem = new javax.swing.JTextField();
        lblSortMeetingType = new javax.swing.JLabel();
        cmbSortMeetingType = new javax.swing.JComboBox<>();
        btnAddCustomAI = new javax.swing.JButton();
        btnSaveClose = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblAddActionItems = new javax.swing.JLabel();
        lblAdd = new javax.swing.JLabel();
        chkAdd1 = new javax.swing.JCheckBox();
        chkAdd2 = new javax.swing.JCheckBox();
        lblActionItem = new javax.swing.JLabel();
        lblActionItemDescription1 = new javax.swing.JLabel();
        lblActionItemDescription2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblAIAssigned = new javax.swing.JLabel();
        lblRemove = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        lblAssignTo = new javax.swing.JLabel();
        cmbAssignTo = new javax.swing.JComboBox<>();
        lblDue = new javax.swing.JLabel();
        cmbDue = new javax.swing.JComboBox<>();
        lblActionItem_Bottom = new javax.swing.JLabel();
        lblActionItemDescription_Bottom = new javax.swing.JLabel();
        lblReceived = new javax.swing.JLabel();
        lblReceivedDateTime = new javax.swing.JLabel();
        chkReceived = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Action Item Assignment");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblActionItemAssignment.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblActionItemAssignment.setText("Action Item Assignment");

        lblSearchActionItem.setText("Search by action item");

        lblSortMeetingType.setText("Sort by meeting type");

        cmbSortMeetingType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd", "3rd", "4th" }));

        btnAddCustomAI.setText("Add Custom AI");

        btnSaveClose.setText("Save & Close");

        lblAddActionItems.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblAddActionItems.setText("Add Action Items");

        lblAdd.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblAdd.setText("Add");

        lblActionItem.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblActionItem.setText("Action Item");

        lblActionItemDescription1.setText("Send investment account statements");

        lblActionItemDescription2.setText("Consider going through the trial application process to evalute your insurance options");

        lblAIAssigned.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblAIAssigned.setText("Action Items Currently Assigned");

        lblRemove.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblRemove.setText("Remove");

        btnRemove.setText("Remove");

        lblAssignTo.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblAssignTo.setText("Assign to");

        cmbAssignTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Client" }));

        lblDue.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblDue.setText("Due");

        cmbDue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01/12/17" }));

        lblActionItem_Bottom.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblActionItem_Bottom.setText("Action Item");

        lblActionItemDescription_Bottom.setText("Complete & return confidential information packet");

        lblReceived.setText("Received");

        lblReceivedDateTime.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        lblReceivedDateTime.setText("received 1/12/17 @ 11am");

        chkReceived.setSelected(true);
        chkReceived.setText("Yes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkAdd2)
                        .addGap(18, 18, 18)
                        .addComponent(lblActionItemDescription2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblActionItemAssignment)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSearchActionItem)
                                .addComponent(lblSortMeetingType)
                                .addComponent(btnAddCustomAI))
                            .addGap(23, 23, 23)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSaveClose)
                                .addComponent(cmbSortMeetingType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSearchActionItem)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAddActionItems)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAdd)
                        .addGap(18, 18, 18)
                        .addComponent(lblActionItem))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkAdd1)
                        .addGap(18, 18, 18)
                        .addComponent(lblActionItemDescription1))
                    .addComponent(lblAIAssigned)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemove)
                            .addComponent(lblRemove))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbAssignTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAssignTo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbDue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblActionItem_Bottom)
                            .addComponent(lblActionItemDescription_Bottom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblReceived)
                            .addComponent(lblReceivedDateTime)
                            .addComponent(chkReceived))))
                .addGap(102, 102, 102))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblActionItemAssignment)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchActionItem)
                    .addComponent(txtSearchActionItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSortMeetingType)
                    .addComponent(cmbSortMeetingType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCustomAI)
                    .addComponent(btnSaveClose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAddActionItems)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdd)
                    .addComponent(lblActionItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkAdd1)
                    .addComponent(lblActionItemDescription1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkAdd2)
                    .addComponent(lblActionItemDescription2))
                .addGap(85, 85, 85)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAIAssigned)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRemove)
                    .addComponent(lblAssignTo)
                    .addComponent(lblDue)
                    .addComponent(lblActionItem_Bottom)
                    .addComponent(lblReceived))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemove)
                    .addComponent(cmbAssignTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblActionItemDescription_Bottom)
                    .addComponent(chkReceived))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblReceivedDateTime)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AIassign_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AIassign_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AIassign_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AIassign_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AIassign_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomAI;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSaveClose;
    private javax.swing.JCheckBox chkAdd1;
    private javax.swing.JCheckBox chkAdd2;
    private javax.swing.JCheckBox chkReceived;
    private javax.swing.JComboBox<String> cmbAssignTo;
    private javax.swing.JComboBox<String> cmbDue;
    private javax.swing.JComboBox<String> cmbSortMeetingType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAIAssigned;
    private javax.swing.JLabel lblActionItem;
    private javax.swing.JLabel lblActionItemAssignment;
    private javax.swing.JLabel lblActionItemDescription1;
    private javax.swing.JLabel lblActionItemDescription2;
    private javax.swing.JLabel lblActionItemDescription_Bottom;
    private javax.swing.JLabel lblActionItem_Bottom;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblAddActionItems;
    private javax.swing.JLabel lblAssignTo;
    private javax.swing.JLabel lblDue;
    private javax.swing.JLabel lblReceived;
    private javax.swing.JLabel lblReceivedDateTime;
    private javax.swing.JLabel lblRemove;
    private javax.swing.JLabel lblSearchActionItem;
    private javax.swing.JLabel lblSortMeetingType;
    private javax.swing.JTextField txtSearchActionItem;
    // End of variables declaration//GEN-END:variables
}

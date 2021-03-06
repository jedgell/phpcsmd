/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.foopara.phpcsmd.ui.phpcs;

import javax.swing.DefaultComboBoxModel;

import org.openide.util.Lookup;

import de.foopara.phpcsmd.exec.phpcs.Phpcs;
import de.foopara.phpcsmd.generics.GenericOptionsPanel;
import de.foopara.phpcsmd.option.PhpcsOptions;

public class PhpcsPropertyPanel extends GenericOptionsPanel
{

    protected Lookup lkp = null;

    public PhpcsPropertyPanel() {
        this(null);
    }

    /**
     * Creates new form PhpcsPropertyPanel
     */
    public PhpcsPropertyPanel(Lookup lkp) {
        super();
        this.lkp = lkp;
        initComponents();
        this._clearInstalledStandards();
        this.load();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jSeparator1 = new javax.swing.JSeparator();
        btnStandard = new javax.swing.JButton();
        cmbStandard = new javax.swing.JComboBox();
        optStandard = new javax.swing.JTextField();
        optSniff = new javax.swing.JTextField();
        optExt = new javax.swing.JTextField();
        optIgnore = new javax.swing.JTextField();
        optTabwidth = new javax.swing.JSpinner();
        optIniOverwrite = new javax.swing.JTextField();
        optWarning = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        owStandard = new javax.swing.JCheckBox();
        owSniff = new javax.swing.JCheckBox();
        owExtension = new javax.swing.JCheckBox();
        owIgnore = new javax.swing.JCheckBox();
        owTabWidth = new javax.swing.JCheckBox();
        owIniOverwrite = new javax.swing.JCheckBox();
        owWarning = new javax.swing.JCheckBox();
        owScript = new javax.swing.JCheckBox();
        optScript = new javax.swing.JTextField();

        setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 2, 2);
        add(jSeparator1, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(btnStandard, org.openide.util.NbBundle.getMessage(PhpcsPropertyPanel.class, "PhpcsPropertyPanel.btnStandard.text")); // NOI18N
        btnStandard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStandardActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(btnStandard, gridBagConstraints);

        cmbStandard.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- select --" }));
        cmbStandard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStandardActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(cmbStandard, gridBagConstraints);

        optStandard.setText(org.openide.util.NbBundle.getMessage(PhpcsPropertyPanel.class, "PhpcsPropertyPanel.optStandard.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optStandard, gridBagConstraints);

        optSniff.setText(org.openide.util.NbBundle.getMessage(PhpcsPropertyPanel.class, "PhpcsPropertyPanel.optSniff.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optSniff, gridBagConstraints);

        optExt.setText(org.openide.util.NbBundle.getMessage(PhpcsPropertyPanel.class, "PhpcsPropertyPanel.optExt.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optExt, gridBagConstraints);

        optIgnore.setText(org.openide.util.NbBundle.getMessage(PhpcsPropertyPanel.class, "PhpcsPropertyPanel.optIgnore.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optIgnore, gridBagConstraints);

        optTabwidth.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(-1), Integer.valueOf(-1), null, Integer.valueOf(1)));
        optTabwidth.setToolTipText(org.openide.util.NbBundle.getMessage(PhpcsPropertyPanel.class, "PhpcsPropertyPanel.optTabwidth.toolTipText")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optTabwidth, gridBagConstraints);

        optIniOverwrite.setText(org.openide.util.NbBundle.getMessage(PhpcsPropertyPanel.class, "PhpcsPropertyPanel.optIniOverwrite.text")); // NOI18N
        optIniOverwrite.setToolTipText(org.openide.util.NbBundle.getMessage(PhpcsPropertyPanel.class, "PhpcsPropertyPanel.optIniOverwrite.toolTipText")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optIniOverwrite, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(optWarning, org.openide.util.NbBundle.getMessage(PhpcsPropertyPanel.class, "PhpcsPropertyPanel.optWarning.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optWarning, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(PhpcsPropertyPanel.class, "PhpcsPropertyPanel.jLabel2.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 2, 2);
        add(jLabel2, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(owStandard, org.openide.util.NbBundle.getMessage(PhpcsPropertyPanel.class, "PhpcsPropertyPanel.owStandard.text")); // NOI18N
        owStandard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        owStandard.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        owStandard.setName("owStandard"); // NOI18N
        owStandard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                owActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(owStandard, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(owSniff, org.openide.util.NbBundle.getMessage(PhpcsPropertyPanel.class, "PhpcsPropertyPanel.owSniff.text")); // NOI18N
        owSniff.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        owSniff.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        owSniff.setName("owSniff"); // NOI18N
        owSniff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                owActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(owSniff, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(owExtension, org.openide.util.NbBundle.getMessage(PhpcsPropertyPanel.class, "PhpcsPropertyPanel.owExtension.text")); // NOI18N
        owExtension.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        owExtension.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        owExtension.setName("owExtension"); // NOI18N
        owExtension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                owActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(owExtension, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(owIgnore, org.openide.util.NbBundle.getMessage(PhpcsPropertyPanel.class, "PhpcsPropertyPanel.owIgnore.text")); // NOI18N
        owIgnore.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        owIgnore.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        owIgnore.setName("owIgnore"); // NOI18N
        owIgnore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                owActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(owIgnore, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(owTabWidth, org.openide.util.NbBundle.getMessage(PhpcsPropertyPanel.class, "PhpcsPropertyPanel.owTabWidth.text")); // NOI18N
        owTabWidth.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        owTabWidth.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        owTabWidth.setName("owTabWidth"); // NOI18N
        owTabWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                owActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(owTabWidth, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(owIniOverwrite, org.openide.util.NbBundle.getMessage(PhpcsPropertyPanel.class, "PhpcsPropertyPanel.owIniOverwrite.text")); // NOI18N
        owIniOverwrite.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        owIniOverwrite.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        owIniOverwrite.setName("owIniOverwrite"); // NOI18N
        owIniOverwrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                owActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(owIniOverwrite, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(owWarning, org.openide.util.NbBundle.getMessage(PhpcsPropertyPanel.class, "PhpcsPropertyPanel.owWarning.text")); // NOI18N
        owWarning.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        owWarning.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        owWarning.setName("owWarning"); // NOI18N
        owWarning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                owActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(owWarning, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(owScript, org.openide.util.NbBundle.getMessage(PhpcsPropertyPanel.class, "PhpcsPropertyPanel.owScript.text")); // NOI18N
        owScript.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        owScript.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        owScript.setName("owStandard"); // NOI18N
        owScript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                owScriptowActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(owScript, gridBagConstraints);

        optScript.setText(org.openide.util.NbBundle.getMessage(PhpcsPropertyPanel.class, "PhpcsPropertyPanel.optScript.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optScript, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void owActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_owActionPerformed
        this.updateForm();
    }//GEN-LAST:event_owActionPerformed

    private void btnStandardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStandardActionPerformed
        this._clearInstalledStandards();

        String[] installed = Phpcs.getStandards((String)PhpcsOptions.load(PhpcsOptions.Settings.SCRIPT, this.lkp));
        if (installed != null && installed.length > 0) {
            for (String standard : installed) {
                ((DefaultComboBoxModel)this.cmbStandard.getModel()).addElement(standard);
            }
        }
    }//GEN-LAST:event_btnStandardActionPerformed

    private void cmbStandardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStandardActionPerformed
        if (this.cmbStandard.getSelectedIndex() > 0) {
            this.optStandard.setText((String)this.cmbStandard.getModel().getSelectedItem());
        }
    }//GEN-LAST:event_cmbStandardActionPerformed

    private void owScriptowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_owScriptowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_owScriptowActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStandard;
    private javax.swing.JComboBox cmbStandard;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField optExt;
    private javax.swing.JTextField optIgnore;
    private javax.swing.JTextField optIniOverwrite;
    private javax.swing.JTextField optScript;
    private javax.swing.JTextField optSniff;
    private javax.swing.JTextField optStandard;
    private javax.swing.JSpinner optTabwidth;
    private javax.swing.JCheckBox optWarning;
    private javax.swing.JCheckBox owExtension;
    private javax.swing.JCheckBox owIgnore;
    private javax.swing.JCheckBox owIniOverwrite;
    private javax.swing.JCheckBox owScript;
    private javax.swing.JCheckBox owSniff;
    private javax.swing.JCheckBox owStandard;
    private javax.swing.JCheckBox owTabWidth;
    private javax.swing.JCheckBox owWarning;
    // End of variables declaration//GEN-END:variables

    @Override
    public void load() {
        owScript.setSelected(PhpcsOptions.isOverwritten(PhpcsOptions.Settings.SCRIPT, this.lkp));
        optScript.setText((String)PhpcsOptions.load(PhpcsOptions.Settings.SCRIPT, this.lkp));
        owStandard.setSelected(PhpcsOptions.isOverwritten(PhpcsOptions.Settings.STANDARD, this.lkp));
        optStandard.setText((String)PhpcsOptions.load(PhpcsOptions.Settings.STANDARD, this.lkp));
        owSniff.setSelected(PhpcsOptions.isOverwritten(PhpcsOptions.Settings.SNIFFS, this.lkp));
        optSniff.setText((String)PhpcsOptions.load(PhpcsOptions.Settings.SNIFFS, this.lkp));
        owExtension.setSelected(PhpcsOptions.isOverwritten(PhpcsOptions.Settings.EXTENSIONS, this.lkp));
        optExt.setText((String)PhpcsOptions.load(PhpcsOptions.Settings.EXTENSIONS, this.lkp));
        owIgnore.setSelected(PhpcsOptions.isOverwritten(PhpcsOptions.Settings.IGNORES, this.lkp));
        optIgnore.setText((String)PhpcsOptions.load(PhpcsOptions.Settings.IGNORES, this.lkp));
        owTabWidth.setSelected(PhpcsOptions.isOverwritten(PhpcsOptions.Settings.TABWIDTH, this.lkp));
        optTabwidth.setValue((Integer)PhpcsOptions.load(PhpcsOptions.Settings.TABWIDTH, this.lkp));
        owIniOverwrite.setSelected(PhpcsOptions.isOverwritten(PhpcsOptions.Settings.INIOVERWRITE, this.lkp));
        optIniOverwrite.setText((String)PhpcsOptions.load(PhpcsOptions.Settings.INIOVERWRITE, this.lkp));
        owWarning.setSelected(PhpcsOptions.isOverwritten(PhpcsOptions.Settings.WARNINGS, this.lkp));
        optWarning.setSelected((Boolean)PhpcsOptions.load(PhpcsOptions.Settings.WARNINGS, this.lkp));
        this.updateForm();
    }

    @Override
    public void save() {
        PhpcsOptions.overwrite(PhpcsOptions.Settings.SCRIPT, owScript.isSelected() ? optScript.getText() : null, this.lkp);
        PhpcsOptions.overwrite(PhpcsOptions.Settings.STANDARD, owStandard.isSelected() ? optStandard.getText() : null, this.lkp);
        PhpcsOptions.overwrite(PhpcsOptions.Settings.SNIFFS, owSniff.isSelected() ? optSniff.getText() : null, this.lkp);
        PhpcsOptions.overwrite(PhpcsOptions.Settings.EXTENSIONS, owExtension.isSelected() ? optExt.getText() : null, this.lkp);
        PhpcsOptions.overwrite(PhpcsOptions.Settings.IGNORES, owIgnore.isSelected() ? optIgnore.getText() : null, this.lkp);
        PhpcsOptions.overwrite(PhpcsOptions.Settings.TABWIDTH, owTabWidth.isSelected() ? optTabwidth.getValue() : null, this.lkp);
        PhpcsOptions.overwrite(PhpcsOptions.Settings.INIOVERWRITE, owIniOverwrite.isSelected() ? optIniOverwrite.getText() : null, this.lkp);
        PhpcsOptions.overwrite(PhpcsOptions.Settings.WARNINGS, owWarning.isSelected() ? optWarning.isSelected() : null, this.lkp);
    }

    @Override
    public boolean hasValidValues() {
        return true;
    }

    private void updateForm() {
        boolean enabled;
        enabled = owStandard.isSelected();
        btnStandard.setEnabled(enabled);
        cmbStandard.setEnabled(enabled);
        optStandard.setEnabled(enabled);

        optScript.setEnabled(owScript.isSelected());
        optSniff.setEnabled(owSniff.isSelected());
        optExt.setEnabled(owExtension.isSelected());
        optIgnore.setEnabled(owIgnore.isSelected());
        optTabwidth.setEnabled(owTabWidth.isSelected());
        optIniOverwrite.setEnabled(owIniOverwrite.isSelected());
        optWarning.setEnabled(owWarning.isSelected());
    }

    private void _clearInstalledStandards() {
        this.cmbStandard.removeAllItems();
        ((DefaultComboBoxModel)this.cmbStandard.getModel()).addElement("-- select --");
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.foopara.phpcsmd.ui.pdepend;

import de.foopara.phpcsmd.generics.GenericOptionsPanel;
import de.foopara.phpcsmd.option.PdependOptions;

/**
 *
 * @author n.specht
 */
public class PdependPanel extends GenericOptionsPanel {

    /**
     * Creates new form PdependPanel
     */
    public PdependPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        optScript = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        optSuffix = new javax.swing.JTextField();
        optExclude = new javax.swing.JTextField();
        optIgnore = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        optIniOverwrite = new javax.swing.JTextField();
        optUseTabs = new javax.swing.JCheckBox();
        optJdepend = new javax.swing.JCheckBox();

        setLayout(new java.awt.GridBagLayout());

        jLabel1.setText(org.openide.util.NbBundle.getMessage(PdependPanel.class, "PdependPanel.jLabel1.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel1, gridBagConstraints);

        optScript.setText(org.openide.util.NbBundle.getMessage(PdependPanel.class, "PdependPanel.optScript.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optScript, gridBagConstraints);

        jLabel2.setText(org.openide.util.NbBundle.getMessage(PdependPanel.class, "PdependPanel.jLabel2.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel2, gridBagConstraints);

        jLabel3.setText(org.openide.util.NbBundle.getMessage(PdependPanel.class, "PdependPanel.jLabel3.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel3, gridBagConstraints);

        jLabel4.setText(org.openide.util.NbBundle.getMessage(PdependPanel.class, "PdependPanel.jLabel4.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel4, gridBagConstraints);

        optSuffix.setText(org.openide.util.NbBundle.getMessage(PdependPanel.class, "PdependPanel.optSuffix.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optSuffix, gridBagConstraints);

        optExclude.setText(org.openide.util.NbBundle.getMessage(PdependPanel.class, "PdependPanel.optExclude.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optExclude, gridBagConstraints);

        optIgnore.setText(org.openide.util.NbBundle.getMessage(PdependPanel.class, "PdependPanel.optIgnore.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optIgnore, gridBagConstraints);

        jLabel6.setText(org.openide.util.NbBundle.getMessage(PdependPanel.class, "PdependPanel.jLabel6.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel6, gridBagConstraints);

        jLabel5.setText(org.openide.util.NbBundle.getMessage(PdependPanel.class, "PdependPanel.jLabel5.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel5, gridBagConstraints);

        optIniOverwrite.setText(org.openide.util.NbBundle.getMessage(PdependPanel.class, "PdependPanel.optIniOverwrite.text")); // NOI18N
        optIniOverwrite.setToolTipText(org.openide.util.NbBundle.getMessage(PdependPanel.class, "PdependPanel.optIniOverwrite.toolTipText")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optIniOverwrite, gridBagConstraints);

        optUseTabs.setText(org.openide.util.NbBundle.getMessage(PdependPanel.class, "PdependPanel.optUseTabs.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optUseTabs, gridBagConstraints);

        optJdepend.setText(org.openide.util.NbBundle.getMessage(PdependPanel.class, "PdependPanel.optJdepend.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optJdepend, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField optExclude;
    private javax.swing.JTextField optIgnore;
    private javax.swing.JTextField optIniOverwrite;
    private javax.swing.JCheckBox optJdepend;
    private javax.swing.JTextField optScript;
    private javax.swing.JTextField optSuffix;
    private javax.swing.JCheckBox optUseTabs;
    // End of variables declaration//GEN-END:variables

    @Override
    public void load() {
        this.optScript.setText(PdependOptions.getScript());
        this.optSuffix.setText(PdependOptions.getSuffixes());
        this.optExclude.setText(PdependOptions.getExcludes());
        this.optIgnore.setText(PdependOptions.getIgnores());
        this.optIniOverwrite.setText(PdependOptions.getIniOverwrite());
        this.optUseTabs.setSelected(PdependOptions.getUseTabs());
        this.optJdepend.setSelected(PdependOptions.getJDepend());
    }

    @Override
    public void save() {
        PdependOptions.setScript(this.optScript.getText());
        PdependOptions.setSuffixes(this.optSuffix.getText());
        PdependOptions.setExcludes(this.optExclude.getText());
        PdependOptions.setIgnores(this.optIgnore.getText());
        PdependOptions.setIniOverwrite(this.optIniOverwrite.getText());
        PdependOptions.setUseTabs(this.optUseTabs.isSelected());
        PdependOptions.setJDepend(this.optJdepend.isSelected());
    }

    @Override
    public boolean hasValidValues() {
        return true;
    }
}
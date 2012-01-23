/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PhpmdPanel.java
 *
 * Created on 22.01.2012, 16:54:51
 */
package de.foopara.phpcsmd.ui.phpmd;

import de.foopara.phpcsmd.generics.GenericOptionsPanel;
import de.foopara.phpcsmd.option.phpmd.PhpmdOptions;

/**
 *
 * @author nspecht
 */
public class PhpmdPanel extends GenericOptionsPanel {
    
    private static PhpmdPanel instance = null;

    public static PhpmdPanel getInstance() {
        return PhpmdPanel.instance;
    }
    
    /** Creates new form PhpmdPanel */
    public PhpmdPanel() {
        initComponents();
        PhpmdPanel.instance = this;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        optActive = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        optScript = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        optRules = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        optSuffixes = new javax.swing.JTextField();
        JLabel4 = new javax.swing.JLabel();
        optExclude = new javax.swing.JTextField();

        setLayout(new java.awt.GridBagLayout());

        optActive.setText(org.openide.util.NbBundle.getMessage(PhpmdPanel.class, "PhpmdPanel.optActive.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optActive, gridBagConstraints);

        jLabel1.setText(org.openide.util.NbBundle.getMessage(PhpmdPanel.class, "PhpmdPanel.jLabel1.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel1, gridBagConstraints);

        optScript.setText(org.openide.util.NbBundle.getMessage(PhpmdPanel.class, "PhpmdPanel.optScript.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optScript, gridBagConstraints);

        jLabel2.setText(org.openide.util.NbBundle.getMessage(PhpmdPanel.class, "PhpmdPanel.jLabel2.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel2, gridBagConstraints);

        optRules.setText(org.openide.util.NbBundle.getMessage(PhpmdPanel.class, "PhpmdPanel.optRules.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 100;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optRules, gridBagConstraints);

        jLabel3.setText(org.openide.util.NbBundle.getMessage(PhpmdPanel.class, "PhpmdPanel.jLabel3.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 101;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel3, gridBagConstraints);

        optSuffixes.setText(org.openide.util.NbBundle.getMessage(PhpmdPanel.class, "PhpmdPanel.optSuffixes.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 101;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optSuffixes, gridBagConstraints);

        JLabel4.setText(org.openide.util.NbBundle.getMessage(PhpmdPanel.class, "PhpmdPanel.JLabel4.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 102;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(JLabel4, gridBagConstraints);

        optExclude.setText(org.openide.util.NbBundle.getMessage(PhpmdPanel.class, "PhpmdPanel.optExclude.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 102;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optExclude, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JCheckBox optActive;
    private javax.swing.JTextField optExclude;
    private javax.swing.JTextField optRules;
    private javax.swing.JTextField optScript;
    private javax.swing.JTextField optSuffixes;
    // End of variables declaration//GEN-END:variables

    @Override
    public void load() {
        this.optActive.setSelected(PhpmdOptions.getActivated());
        
        this.optScript.setText(PhpmdOptions.getScript());
        this.optRules.setText(PhpmdOptions.getRules());
        this.optSuffixes.setText(PhpmdOptions.getSuffixes());
        this.optExclude.setText(PhpmdOptions.getExcludes());
    }

    @Override
    public void save() {
        PhpmdOptions.setActivated(this.optActive.isSelected());
        
        PhpmdOptions.setScript(this.optScript.getText());
        PhpmdOptions.setRules(this.optRules.getText());
        PhpmdOptions.setSuffixes(this.optSuffixes.getText());
        PhpmdOptions.setExcludes(this.optExclude.getText());
    }

    @Override
    public boolean hasValidValues() {
        return true;
    }
}
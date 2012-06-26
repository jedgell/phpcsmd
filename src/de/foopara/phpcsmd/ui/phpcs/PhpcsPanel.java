package de.foopara.phpcsmd.ui.phpcs;

import de.foopara.phpcsmd.generics.GenericOptionsPanel;
import de.foopara.phpcsmd.option.PhpcsOptions;
import de.foopara.phpcsmd.option.phpcs.GenericPhpcsSniffRegistry;
import de.foopara.phpcsmd.option.phpcs.PhpcsSniff;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import org.openide.util.Exceptions;

/**
 *
 * @author nspecht
 */
public class PhpcsPanel extends GenericOptionsPanel {

    private static PhpcsPanel instance = null;

    private HashMap<String, javax.swing.JCheckBox> sniffOpts = new HashMap<String, javax.swing.JCheckBox>();
    private HashMap<String, javax.swing.JCheckBox> sniffTask = new HashMap<String, javax.swing.JCheckBox>();

    public static PhpcsPanel getInstance() {
        return PhpcsPanel.instance;
    }

    private void _clearInstalledStandards() {
        this.jComboBox1.removeAllItems();
        ((DefaultComboBoxModel)this.jComboBox1.getModel())
                .addElement("-- you can select one of the following standards --");
    }

    /** Creates new form PhpcsPanel */
    public PhpcsPanel() {
        initComponents();
        this.provideStandards();
        this.jComboBox1.setModel(new DefaultComboBoxModel());
        this._clearInstalledStandards();
        PhpcsPanel.instance = this;
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

        jLabel1 = new javax.swing.JLabel();
        optScript = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        optStandard = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        optExt = new javax.swing.JTextField();
        optIgnore = new javax.swing.JTextField();
        optWarning = new javax.swing.JCheckBox();
        optActive = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        optSniffs = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        optTabwidth = new javax.swing.JSpinner();
        optXtra = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        optIniOverwrite = new javax.swing.JTextField();

        setLayout(new java.awt.GridBagLayout());

        jLabel1.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.jLabel1.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 50;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel1, gridBagConstraints);

        optScript.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.optScript.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 50;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optScript, gridBagConstraints);

        jLabel2.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.jLabel2.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 101;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel2, gridBagConstraints);

        optStandard.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.optStandard.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 101;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optStandard, gridBagConstraints);

        jLabel3.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.jLabel3.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 103;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel3, gridBagConstraints);

        jLabel4.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.jLabel4.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 104;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel4, gridBagConstraints);

        optExt.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.optExt.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 103;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optExt, gridBagConstraints);

        optIgnore.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.optIgnore.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 104;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optIgnore, gridBagConstraints);

        optWarning.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.optWarning.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 200;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optWarning, gridBagConstraints);

        optActive.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.optActive.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optActive, gridBagConstraints);

        jButton2.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 51;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jButton2, gridBagConstraints);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--- select ---" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 51;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jComboBox1, gridBagConstraints);

        jLabel5.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.jLabel5.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 102;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel5, gridBagConstraints);

        optSniffs.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.optSniffs.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 102;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optSniffs, gridBagConstraints);

        jLabel6.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.jLabel6.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 105;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel6, gridBagConstraints);

        optTabwidth.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(-1), Integer.valueOf(-1), null, Integer.valueOf(1)));
        optTabwidth.setToolTipText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.optTabwidth.toolTipText")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 105;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optTabwidth, gridBagConstraints);

        optXtra.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.optXtra.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 300;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(optXtra, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 300;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jSeparator1, gridBagConstraints);

        jLabel7.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.jLabel7.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 106;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel7, gridBagConstraints);

        optIniOverwrite.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.optIniOverwrite.text")); // NOI18N
        optIniOverwrite.setToolTipText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.optIniOverwrite.toolTipText")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 106;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optIniOverwrite, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            File script = new File(optScript.getText());
            if (!script.exists() || !script.canExecute() || !script.isFile()) {
                return;
            }
            Process child = Runtime.getRuntime().exec(optScript.getText() + " -i");
            InputStream in = child.getInputStream();
            StringBuilder tmp = new StringBuilder();
            int c;
            while ((c = in.read()) != -1) {
                tmp.append((char) c);
            }
            String installed[] = tmp.toString()
                    .replaceFirst("The installed.*are ", "")
                    .replaceFirst(" and ", ", ")
                    .split(", ");
            for(String standard : installed) {
                ((DefaultComboBoxModel)this.jComboBox1.getModel()).addElement(standard);
            }
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        this.optStandard.setText((String)this.jComboBox1.getModel().getSelectedItem());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox optActive;
    private javax.swing.JTextField optExt;
    private javax.swing.JTextField optIgnore;
    private javax.swing.JTextField optIniOverwrite;
    private javax.swing.JTextField optScript;
    private javax.swing.JTextField optSniffs;
    private javax.swing.JTextField optStandard;
    private javax.swing.JSpinner optTabwidth;
    private javax.swing.JCheckBox optWarning;
    private javax.swing.JCheckBox optXtra;
    // End of variables declaration//GEN-END:variables

    @Override
    public void load() {
        this.optActive.setSelected(PhpcsOptions.getActivated());

        this.optScript.setText(PhpcsOptions.getScript());
        this.optStandard.setText(PhpcsOptions.getStandard());
        this.optSniffs.setText(PhpcsOptions.getSniffs());
        this.optExt.setText(PhpcsOptions.getExtensions());
        this.optIgnore.setText(PhpcsOptions.getIgnore());
        this.optTabwidth.setValue(PhpcsOptions.getTabwidth());
        this.optIniOverwrite.setText(PhpcsOptions.getIniOverwrite());

        this.optWarning.setSelected(PhpcsOptions.getWarnings());
        this.optXtra.setSelected(PhpcsOptions.getExtras());

        for (String key : this.sniffOpts.keySet()) {
            this.sniffOpts.get(key).setSelected(PhpcsOptions.getSniff(key));
        }

        for (String key : this.sniffTask.keySet()) {
            this.sniffTask.get(key).setSelected(PhpcsOptions.getSniffTask(key));
        }
    }

    @Override
    public void save() {
        PhpcsOptions.setActivated(this.optActive.isSelected());

        PhpcsOptions.setScript(this.optScript.getText());
        PhpcsOptions.setStandard(this.optStandard.getText());
        PhpcsOptions.setSniffs(this.optSniffs.getText());
        PhpcsOptions.setExtensions(this.optExt.getText());
        PhpcsOptions.setIgnore(this.optIgnore.getText());
        PhpcsOptions.setTabwidth((Integer)this.optTabwidth.getValue());
        PhpcsOptions.setIniOverwrite(this.optIniOverwrite.getText());

        PhpcsOptions.setWarnings(this.optWarning.isSelected());
        PhpcsOptions.setExtras(this.optXtra.isSelected());

        for (String key : this.sniffOpts.keySet()) {
            PhpcsOptions.setSniff(key, this.sniffOpts.get(key).isSelected());
        }
        for (String key : this.sniffTask.keySet()) {
            PhpcsOptions.setSniffTask(key, this.sniffTask.get(key).isSelected());
        }
    }

    public void provideStandards() {

        java.awt.GridBagConstraints gridBagConstraints;

        javax.swing.JTabbedPane standardTab = new javax.swing.JTabbedPane();
        standardTab.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 301;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(standardTab, gridBagConstraints);


        for (String standardStr : GenericPhpcsSniffRegistry.getInstance().getStandards()) {
            javax.swing.JTabbedPane classTab = new javax.swing.JTabbedPane();
            classTab.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
            classTab.setTabPlacement(javax.swing.JTabbedPane.LEFT);
            standardTab.add(standardStr, classTab);

            for(String classStr : GenericPhpcsSniffRegistry.getInstance().getStandard(standardStr).getClasses()) {
                javax.swing.JPanel classPanel = new javax.swing.JPanel();
                javax.swing.JScrollPane scroll = new javax.swing.JScrollPane(classPanel);
                classPanel.setLayout(new java.awt.GridBagLayout());
                scroll.setMaximumSize(new Dimension(-1, 200));
                classTab.add(scroll, classStr);

                javax.swing.JLabel labelSniff = new javax.swing.JLabel("<html><body><b>Sniff</b></body></html>");
                javax.swing.JLabel labelTask  = new javax.swing.JLabel("<html><body><b>show in Tasklist</b></body></html>");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                gridBagConstraints.weightx = 0.8;
                gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
                classPanel.add(labelSniff, gridBagConstraints);

                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 2;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                gridBagConstraints.weightx = 0.2;
                gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
                classPanel.add(labelTask, gridBagConstraints);

                int offset=1;
                for(PhpcsSniff sniff : GenericPhpcsSniffRegistry.getInstance().getStandard(standardStr).getClass(classStr).getSniffs()) {
                    java.awt.Image img;
                    if (sniff.annotationType != null) {
                        img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/de/foopara/phpcsmd/resources/phpcs/" + sniff.annotationType + ".png"));
                    } else {
                        img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/de/foopara/phpcsmd/resources/phpcs/violation.jpg"));
                    }
                    javax.swing.JLabel icon = new javax.swing.JLabel(new javax.swing.ImageIcon(img));
                    gridBagConstraints = new java.awt.GridBagConstraints();
                    gridBagConstraints.gridx = 0;
                    gridBagConstraints.gridy = offset;
                    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                    gridBagConstraints.weightx = 0;
                    gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
                    classPanel.add(icon, gridBagConstraints);

                    javax.swing.JCheckBox compSniff = new javax.swing.JCheckBox(sniff.getDescription());
                    this.sniffOpts.put(sniff.shortName, compSniff);
                    gridBagConstraints = new java.awt.GridBagConstraints();
                    gridBagConstraints.gridx = 1;
                    gridBagConstraints.gridy = offset;
                    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                    gridBagConstraints.weightx = 0.2;
                    gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
                    classPanel.add(compSniff, gridBagConstraints);

                    javax.swing.JCheckBox compTask = new javax.swing.JCheckBox();
                    this.sniffTask.put(sniff.shortName, compTask);
                    gridBagConstraints = new java.awt.GridBagConstraints();
                    gridBagConstraints.gridx = 2;
                    gridBagConstraints.gridy = offset;
                    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                    gridBagConstraints.weightx = 1;
                    gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
                    classPanel.add(compTask, gridBagConstraints);
                    offset++;
                }
            }
        }
    }

    @Override
    public boolean hasValidValues() {
        return true;
    }
}

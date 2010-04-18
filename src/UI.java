/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UI.java
 *
 * Created on Apr 16, 2010, 12:04:28 AM
 */

/**
 *
 * @author Alexandru Popescu
 */
public class UI extends javax.swing.JFrame {

    public StudentHandler sHandler = new StudentHandler();
    CreateParser parser = new CreateParser(sHandler);
    private int p,i,f;
    public String[] v=new String[100];
    public String[] w=new String[100];
    public int indice=0,a=-1;

    /** Creates new form UI */
    public UI() {
        initComponents();
    }
    public static void main(String[] args) {
        new UI().setVisible(true);
    }
    public void intersectieVectori(String[] s1, String[] s2, int i, int k){
        for (int j=1;j<=50;j++)
            v[j]="";        
        indice=0;
        for (int j=1;j<=i;j++)
            for (int h=1;h<=k;h++){
                if (s1[j].equals(s2[h])){
                    indice++;
                    v[indice]=s1[j];                    
                }
            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Management View");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Show students");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.setPreferredSize(new java.awt.Dimension(117, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Students with avegage higher then 8");

        jLabel1.setText("Filters");

        jCheckBox2.setText("Students with arrears");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graduation Hat and Certificate.jpg"))); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A1", "A2", "A3" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Students from series");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 11));
        jLabel3.setText("* Clear button must be pressed before applying a new filter");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 11));
        jLabel4.setText("*Any valid combination of filters is available");

        jCheckBox4.setText("Students with scholarship");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(247, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox4))
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(325, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox3)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox4))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        p=0;
        jTextArea1.setText("");
        sHandler.numberStudents=0;
        sHandler.j=0;
        sHandler.k=0;
        sHandler.l=0;
        sHandler.o1=0;
        sHandler.o2=0;
        sHandler.o3=0;
        sHandler.t=0;
        for (int j=1;j<=50;j++)
            w[j]="";
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        a=4;
        if (jCheckBox4.isSelected()&&jCheckBox2.isSelected())
            a=99;
        else
        if (jCheckBox1.isSelected()&&jCheckBox4.isSelected()&&jCheckBox3.isSelected()){
            if(jComboBox1.getSelectedIndex()==0)
                a=18;
            if(jComboBox1.getSelectedIndex()==1)
                a=19;
            if(jComboBox1.getSelectedIndex()==2)
                a=20;
        }
        else
        if (jCheckBox4.isSelected()&&jCheckBox3.isSelected()){
            if(jComboBox1.getSelectedIndex()==0)
                a=21;
            if(jComboBox1.getSelectedIndex()==1)
                a=22;
            if(jComboBox1.getSelectedIndex()==2)
                a=23;
        }
        else
        if (jCheckBox1.isSelected()&&jCheckBox4.isSelected())
            a=24;
        else
        if (jCheckBox1.isSelected()&&jCheckBox2.isSelected()&&jCheckBox3.isSelected()){
            if(jComboBox1.getSelectedIndex()==0)
                a=14;
            if(jComboBox1.getSelectedIndex()==1)
                a=15;
            if(jComboBox1.getSelectedIndex()==2)
                a=16;
        }
        else
        if (jCheckBox1.isSelected()&&jCheckBox2.isSelected())
            a=1;
        else
        if (jCheckBox1.isSelected()&&jCheckBox3.isSelected()){
            if(jComboBox1.getSelectedIndex()==0)
                a=8;
            if(jComboBox1.getSelectedIndex()==1)                
                a=9;
            if(jComboBox1.getSelectedIndex()==2)                
                a=10;
        }
        else
        if (jCheckBox2.isSelected()&&jCheckBox3.isSelected()){
            if(jComboBox1.getSelectedIndex()==0)
                a=11;
            if(jComboBox1.getSelectedIndex()==1)
                a=12;
            if(jComboBox1.getSelectedIndex()==2)
                a=13;
        }
        else
        if (jCheckBox1.isSelected())
            a=2;
        else
        if (jCheckBox2.isSelected())
            a=3;
        else
        if ((jCheckBox3.isSelected())&&jComboBox1.getSelectedIndex()==0)
            a=5;
        else
        if ((jCheckBox3.isSelected())&&jComboBox1.getSelectedIndex()==1)
            a=6;
        else
        if ((jCheckBox3.isSelected())&&jComboBox1.getSelectedIndex()==2)
            a=7;
        else
        if (jCheckBox4.isSelected())
            a=17;
        System.out.println(a);
        if (p==0){
            parser.parse("Students.xml");
            switch(a){
                case 1: jTextArea1.append("Students with average higher then 8.00 and with arrears \n");                     
                        intersectieVectori(sHandler.b,sHandler.r,sHandler.j,sHandler.l);
                        for (f=1;f<=indice;f++){
                            jTextArea1.append(v[f]+"\n");
                        }
                        p=1;break;
                case 2: jTextArea1.append("Students with average higher then 8.00 \n");
                        for (f=1;f<=sHandler.j;f++){
                            jTextArea1.append(sHandler.b[f]+"\n");
                        }
                        p=1;break;
                case 3: jTextArea1.append("Students with arrears \n");
                        for (f=1;f<=sHandler.l;f++){
                            jTextArea1.append(sHandler.r[f]+"\n");
                        }
                        p=1;break;
                case 5:jTextArea1.append("Students from series A1 \n");
                        for (f=1;f<=sHandler.o1;f++){
                            jTextArea1.append(sHandler.gra1[f]+"\n");
                        }
                        p=1;break;
                case 6:jTextArea1.append("Students from series A2 \n");
                        for (f=1;f<=sHandler.o2;f++){
                            jTextArea1.append(sHandler.gra2[f]+"\n");
                        }
                        p=1;break;
                case 7: jTextArea1.append("Students from series A3 \n");
                        for (f=1;f<=sHandler.o3;f++){
                            jTextArea1.append(sHandler.gra3[f]+"\n");
                        }
                        p=1;break;
                case 8: jTextArea1.append("Students from series A1 with average higher then 8 \n");
                        intersectieVectori(sHandler.gra1,sHandler.b,sHandler.o1,sHandler.j);
                        for (f=1;f<=indice;f++){
                            jTextArea1.append(v[f]+"\n");
                        }
                        p=1;break;
                case 9: jTextArea1.append("Students from series A2 with average higher then 8 \n");
                        intersectieVectori(sHandler.gra2,sHandler.b,sHandler.o2,sHandler.j);
                        for (f=1;f<=indice;f++){
                            jTextArea1.append(v[f]+"\n");
                        }
                        p=1;break;
                case 10:jTextArea1.append("Students from series A3 with average higher then 8 \n");
                        intersectieVectori(sHandler.gra3,sHandler.b,sHandler.o3,sHandler.j);
                        for (f=1;f<=indice;f++){
                            jTextArea1.append(v[f]+"\n");
                        }
                        p=1;break;
                case 11:jTextArea1.append("Students from series A1 with arreas \n");
                        intersectieVectori(sHandler.gra1,sHandler.r,sHandler.o1,sHandler.l);
                        for (f=1;f<=indice;f++){
                            jTextArea1.append(v[f]+"\n");
                        }
                        p=1;break;
                case 12:jTextArea1.append("Students from series A2 with arreas \n");
                        intersectieVectori(sHandler.gra2,sHandler.r,sHandler.o2,sHandler.l);
                        for (f=1;f<=indice;f++){
                            jTextArea1.append(v[f]+"\n");
                        }
                        p=1;break;
                case 13:jTextArea1.append("Students from series A3 with arreas \n");
                        intersectieVectori(sHandler.gra3,sHandler.r,sHandler.o3,sHandler.l);
                        for (f=1;f<=indice;f++){
                            jTextArea1.append(v[f]+"\n");
                        }
                        p=1;break;
                case 14:jTextArea1.append("Students from series A1 with arreas and with average higher then 8\n");
                        intersectieVectori(sHandler.gra1,sHandler.r,sHandler.o1,sHandler.l);
                        for (i=1;i<=indice;i++)
                            w[i]=v[i];
                        i=indice;
                        intersectieVectori(sHandler.b,w,sHandler.j,i);
                        for (f=1;f<=indice;f++){
                            jTextArea1.append(v[f]+"\n");
                        }
                        p=1;break;
                case 15:jTextArea1.append("Students from series A2 with arreas and with average higher then 8\n");
                        intersectieVectori(sHandler.gra2,sHandler.r,sHandler.o2,sHandler.l);
                        for (i=1;i<=indice;i++)
                            w[i]=v[i];
                        i=indice;
                        intersectieVectori(sHandler.b,w,sHandler.j,i);
                        for (f=1;f<=indice;f++){
                            jTextArea1.append(v[f]+"\n");
                        }
                        p=1;break;
                case 16:jTextArea1.append("Students from series A3 with arreas and with average higher then 8\n");
                        intersectieVectori(sHandler.gra3,sHandler.r,sHandler.o3,sHandler.l);
                        for (i=1;i<=indice;i++)
                            w[i]=v[i];
                        i=indice;
                        intersectieVectori(sHandler.b,w,sHandler.j,i);
                        for (f=1;f<=indice;f++){
                            jTextArea1.append(v[f]+"\n");
                        }                        
                        p=1;break;
                case 17:jTextArea1.append("Students with scholarship \n");                        
                        for (f=1;f<=sHandler.t;f++){
                            jTextArea1.append(sHandler.sch[f]+"\n");
                        }
                        p=1;break;
                case 18:jTextArea1.append("Students from series A1 with scholarship and with average higher then 8\n");
                        intersectieVectori(sHandler.gra1,sHandler.sch,sHandler.o1,sHandler.t);
                        for (i=1;i<=indice;i++)
                            w[i]=v[i];
                        i=indice;
                        intersectieVectori(sHandler.b,w,sHandler.j,i);
                        for (f=1;f<=indice;f++){
                            jTextArea1.append(v[f]+"\n");
                        }
                        p=1;break;
                case 19:jTextArea1.append("Students from series A2 with scholarship and with average higher then 8\n");
                        intersectieVectori(sHandler.gra2,sHandler.sch,sHandler.o2,sHandler.t);
                        for (i=1;i<=indice;i++)
                            w[i]=v[i];
                        i=indice;
                        intersectieVectori(sHandler.b,w,sHandler.j,i);
                        for (f=1;f<=indice;f++){
                            jTextArea1.append(v[f]+"\n");
                        }
                        p=1;break;
                case 20:jTextArea1.append("Students from series A3 with scholarship and with average higher then 8\n");
                        intersectieVectori(sHandler.gra3,sHandler.sch,sHandler.o3,sHandler.t);
                        for (i=1;i<=indice;i++)
                            w[i]=v[i];
                        i=indice;
                        intersectieVectori(sHandler.b,w,sHandler.j,i);
                        for (f=1;f<=indice;f++){
                            jTextArea1.append(v[f]+"\n");
                        }
                        p=1;break;
                case 21:jTextArea1.append("Students from series A1 with scholarship \n");
                        intersectieVectori(sHandler.gra1,sHandler.sch,sHandler.o1,sHandler.t);
                        for (f=1;f<=indice;f++){
                            jTextArea1.append(v[f]+"\n");
                        }
                        p=1;break;
                case 22:jTextArea1.append("Students from series A2 with scholarship \n");
                        intersectieVectori(sHandler.gra2,sHandler.sch,sHandler.o2,sHandler.t);
                        for (f=1;f<=indice;f++){
                            jTextArea1.append(v[f]+"\n");
                        }
                        p=1;break;
                case 23:jTextArea1.append("Students from series A3 with scholarship \n");
                        intersectieVectori(sHandler.gra3,sHandler.sch,sHandler.o3,sHandler.t);
                        for (f=1;f<=indice;f++){
                            jTextArea1.append(v[f]+"\n");
                        }
                        p=1;break;
                case 24:jTextArea1.append("Students with average higher then 8.00 and with scholarship \n");
                        intersectieVectori(sHandler.b,sHandler.sch,sHandler.j,sHandler.t);
                        for (f=1;f<=indice;f++){
                            jTextArea1.append(v[f]+"\n");
                        }
                        p=1;break;
                case 99:jTextArea1.append("Students with scholarship don't have arrears, use another filter");
                        p=1;break;
                default: jTextArea1.append("Students found in XML file "+sHandler.getNumberStudents()+"\n");
                        for (i=0;i<sHandler.getNumberStudents();i++){
                            jTextArea1.append(sHandler.s[i]+"\n");
                        }
                        p=1;break;
            }
        }
}//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    /**
    * @param args the command line arguments
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AboutUI;

import javax.swing.JPanel;

/**
 *
 * @author pranavkapse
 */
public class AboutJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AboutJPanel
     */
    JPanel cardContainer;
    public AboutJPanel(JPanel cardContainer) {
        initComponents();
        this.cardContainer = cardContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.MatteBorder(null));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("About Us:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel3.setText("Our top recruiters:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 710, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Tech Tutor E - Learning platform, established in 2015, stands at the forefront of educational innovation, dedicated to redefining the way students access\n knowledge in the digital age. Our platform serves as a beacon of opportunity for students of all backgrounds and ages, offering an enriching, flexible, \nand immersive learning experience.Since our inception, we have been committed to revolutionizing education, ensuring that it evolves with the \never-changing demands of the modern world. With 8 years of experience, we have refined our approach to provide students with cutting-edge resources \nand courses that are specifically designed to enhanceclassroom education and personal development. For those students who are hungry for knowledge \nand eager to explore new horizons, we offer a treasure trove of diverse learning opportunities. Unleash your curiosity, dive into new subjects, and expand \nyour intellectual horizons at your own pace. In the rapidly changing landscape of education, lifelong learning is a vital pursuit, and we're here to support \nstudents on their lifelong academic journeys. Whether you're a school student, a college scholar, or an adult learner, our platform is your trusted companion \non the path to knowledge acquisition and personal growth.\n");
        jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1130, 210));

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("At Tech Tutor our mission is to reach and educate as many students as possible, providing them with the knowledgeand skills they need to thrive in an \never-evolving digital world. We are committed to delivering accessible, high-quality e-learning resources that foster personal and professional growth. Our \naim is to eliminate barriers to education, ensuring that learning is an endless journey for anyone who seeks knowledge. Our vision is to be a global leader in \ne-learning, transforming education by reaching and teaching a vast and diverse student population. We envision a future where knowledge knows no \nboundaries, and our goal is to provide accessible, engaging, and effective learning experiences to all who desire it. Our commitment is to demolish barriers \nto education, making learning a lifelong and inclusive journey for all who yearn to learn. We believe that the true power of knowledge lies in its accessibility \nto every eager mind.");
        jTextArea3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane3.setViewportView(jTextArea3);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 1130, 170));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel4.setText("Mission & Vision:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 710, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AboutUI/MicrosoftTeams-image (6).png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 350, 110));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AboutUI/MicrosoftTeams-image (5).png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 250, 110));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AboutUI/MicrosoftTeams-image (4).png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 520, 320, 110));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
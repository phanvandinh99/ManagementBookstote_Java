/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class frmDangNhap extends javax.swing.JFrame {

    public frmDangNhap() {
        initComponents();
        this.setLocation(300, 200);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        pnlRegisterInfo = new javax.swing.JPanel();
        lblRegisterTitle = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        chkbNhoMatKhau = new javax.swing.JCheckBox();
        btnĐangKy = new javax.swing.JButton();
        btnDangNhap = new javax.swing.JButton();
        pnlCopyright = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng Nhập Đăng Ký");
        setResizable(false);

        pnlRegisterInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        lblRegisterTitle.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblRegisterTitle.setForeground(new java.awt.Color(51, 102, 255));
        lblRegisterTitle.setText("QUẢN LÝ CỬA HÀNG");

        lblUserName.setText("Tên đăng nhập");

        txtUserName.setText("admin");

        lblPassword.setText("Mật khẩu");

        txtPassword.setText("admin123");

        chkbNhoMatKhau.setForeground(new java.awt.Color(102, 153, 255));
        chkbNhoMatKhau.setText("nhớ Mật Khẩu");
        chkbNhoMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbNhoMatKhauActionPerformed(evt);
            }
        });

        btnĐangKy.setForeground(new java.awt.Color(255, 153, 51));
        btnĐangKy.setText("Đăng ký");
        btnĐangKy.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnĐangKyMouseMoved(evt);
            }
        });
        btnĐangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnĐangKyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnĐangKyMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnĐangKyMouseReleased(evt);
            }
        });
        btnĐangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnĐangKyActionPerformed(evt);
            }
        });

        btnDangNhap.setForeground(new java.awt.Color(255, 153, 51));
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegisterInfoLayout = new javax.swing.GroupLayout(pnlRegisterInfo);
        pnlRegisterInfo.setLayout(pnlRegisterInfoLayout);
        pnlRegisterInfoLayout.setHorizontalGroup(
            pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserName)
                            .addComponent(txtPassword)
                            .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                                .addComponent(chkbNhoMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                                .addComponent(btnĐangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))
                    .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblRegisterTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlRegisterInfoLayout.setVerticalGroup(
            pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblRegisterTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(18, 18, 18)
                .addComponent(chkbNhoMatKhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnĐangKy)
                    .addComponent(btnDangNhap))
                .addGap(31, 31, 31))
        );

        pnlCopyright.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));

        jLabel1.setText("liên Hệ admin để được cấp quyền truy cập cao hơn");

        javax.swing.GroupLayout pnlCopyrightLayout = new javax.swing.GroupLayout(pnlCopyright);
        pnlCopyright.setLayout(pnlCopyrightLayout);
        pnlCopyrightLayout.setHorizontalGroup(
            pnlCopyrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCopyrightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlCopyrightLayout.setVerticalGroup(
            pnlCopyrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCopyrightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRegisterInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlCopyright, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(pnlRegisterInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlCopyright, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static int quyen = 0;
    public static String ten = "", user = "";
    private void btnĐangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnĐangKyActionPerformed

        frm.frmDangKy frmDK = new frmDangKy();
        frmDK.show();
        this.dispose();
    }//GEN-LAST:event_btnĐangKyActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed

        String strUsername = txtUserName.getText().trim();
        String strPassword = String.valueOf(txtPassword.getPassword()).trim();

        String cautruyvan = "select * from Staff where Username = '" + strUsername + "' and Passwork = '" + strPassword + "'";
        ResultSet rs = project_Sem2.Project_SEM2.connection.ExcuteQueryGetTable(cautruyvan);
        if (KiemTra(strUsername, strPassword)) {
            project_Sem2.Project_SEM2.frmTC.show();
            this.dispose();
        } else {
            ThongBao("Bạn nhập sai tài khoản hoặc mật khẩu", "Lỗi đăng nhập", 2);
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private boolean KiemTra(String tdn, String mk) {
        boolean kq = false;

        String cautruyvan = "select * from Staff where Username = '" + tdn + "' and Passwork = '" + mk + "'";
        System.out.println(cautruyvan);
        ResultSet rs = project_Sem2.Project_SEM2.connection.ExcuteQueryGetTable(cautruyvan);

        try {
            if (rs.next()) {
                kq = true;
//                quyen = rs.getInt("Quyen");
//                ten=rs.getString("TenNhanVien");
//                user=rs.getString("UserName");
//                System.out.println(" " + quyen);
            }
        } catch (SQLException ex) {
            System.out.println("lỗi đăng nhập");
        }

        return kq;
    }
    private void chkbNhoMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbNhoMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbNhoMatKhauActionPerformed

    private void btnĐangKyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnĐangKyMouseReleased

    }//GEN-LAST:event_btnĐangKyMouseReleased

    private void btnĐangKyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnĐangKyMousePressed

    }//GEN-LAST:event_btnĐangKyMousePressed

    private void btnĐangKyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnĐangKyMouseExited

    }//GEN-LAST:event_btnĐangKyMouseExited

    private void btnĐangKyMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnĐangKyMouseMoved

    }//GEN-LAST:event_btnĐangKyMouseMoved

    private boolean KiemTraChuaChuVaSo(String chuoiCanKiemTra) {
        boolean ketQua = false;
        Pattern p = Pattern.compile(".*[a-zA-Z].*");
        Matcher m = p.matcher(chuoiCanKiemTra);
        if (!(chuoiCanKiemTra == chuoiCanKiemTra.toLowerCase())) {
            ketQua = m.find();
        }
        return ketQua;
    }

    public static void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao,
                tieuDeThongBao, icon);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnĐangKy;
    private javax.swing.JCheckBox chkbNhoMatKhau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRegisterTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel pnlCopyright;
    private javax.swing.JPanel pnlRegisterInfo;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}

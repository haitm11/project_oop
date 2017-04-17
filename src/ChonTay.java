
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TranMinhHai
 */
public class ChonTay extends javax.swing.JFrame {
    private String mon;
    private DeThi dethi = new DeThi();
    private TracNghiem[] tn = new TracNghiem[500];
    DapAn[] da = new DapAn[50];
    private TuLuan[] tl = new TuLuan[500];
    private int itl = 0;
    private int itn = 0;
    private int ida = 0;
    private DefaultListModel<String> motl = new DefaultListModel<>();
    private DefaultListModel<String> motn = new DefaultListModel<>();
    private Hashtable<String,TuLuan> htbtl = new Hashtable();
    private Hashtable<String,TracNghiem> htbtn = new Hashtable();
    private String string[] = new String[100];
    private int istr=1;
    private String stringtn[] = new String[100];
    private int istrtn=1;
    private String stringtl[] = new String[100];
    private int istrtl=1;
    private int[] flag=new int[100];
    private int iflag=0;
    
    /** Creates new form ChonTay */
    public ChonTay(String Mon) {
        
        try {
            String url = System.getProperty("user.dir", null);
            initComponents();
            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            jLabel5.setText(Mon);
            mon = Mon;
            string[0] = "                    KIEM TRA MON: "+mon+"\n\n";
            stringtn[0] = "Trac Nghiem\n";
            stringtl[0] = "Tu Luan\n";
            
            
            String pathtl = url+"\\BTLOOP\\"+mon+"tl.txt";
            String pathtn = url+"\\BTLOOP\\"+mon+"tn.txt";
            
            String s = null;
            BufferedReader in = null;
            
            in = new BufferedReader(new InputStreamReader(new FileInputStream(pathtl), "UTF8"));
            s = in.readLine(); 
            do {
                String[] str = s.split("&");
                String chuongchuong[] = str[1].split("#");
                TuLuan tuluan = new TuLuan(mon,str[0],chuongchuong, str[2],str[3]);
                htbtl.put(str[0], tuluan);
                if(str[2].equals("1")) str[0]=String.format("<html><b><font color=\"blue\">" + str[0]+ "</font></b></html>", str[0]);
                if(str[2].equals("2")) str[0]=String.format("<html><b><font color=\"green\">" + str[0]+ "</font></b></html>", str[0]);
                if(str[2].equals("3")) str[0]=String.format("<html><b><font color=\"red\">" + str[0]+ "</font></b></html>", str[0]);
                motl.addElement(str[0]);
                s = in.readLine(); 
            } while(s!=null);
            jList4.setModel(motl);
            
            in = new BufferedReader(new InputStreamReader(new FileInputStream(pathtn), "UTF8"));
            s = in.readLine(); 
            do {
                String[] str = s.split("&");
                String chuongchuong[] = str[1].split("#");
                DapAn dapan[] = new DapAn[100];
                int ii=0;
                String dapann[] = str[3].split("#");
                for(int kk=0;kk<dapann.length;kk=kk+2) {
                    dapan[ii] = new DapAn(dapann[kk],Integer.parseInt(dapann[kk+1]));
                    ii++;
                }
                TracNghiem tracnghiem = new TracNghiem(mon,str[0],chuongchuong, str[2],dapan);
                htbtn.put(str[0], tracnghiem);
                if(str[2].equals("1")) str[0]=String.format("<html><b><font color=\"blue\">" + str[0]+ "</font></b></html>", str[0]);
                if(str[2].equals("2")) str[0]=String.format("<html><b><font color=\"green\">" + str[0]+ "</font></b></html>", str[0]);
                if(str[2].equals("3")) str[0]=String.format("<html><b><font color=\"red\">" + str[0]+ "</font></b></html>", str[0]);
                motn.addElement(str[0]);
                s = in.readLine(); 
            } while(s!=null);
            jList3.setModel(motn);
            
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ChonTay.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ChonTay.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jRadioButton3.setText("jRadioButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MÔN:");

        jLabel2.setText("Danh sách câu hỏi TRẮC NGHIỆM");

        jLabel3.setText("Danh sách câu hỏi TỰ LUẬN");

        jLabel4.setText("ĐỀ THI");

        jButton1.setText("SINH ĐỀ THI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList3);

        jList4.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList4MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jList4);

        jLabel5.setText("jLabel5");

        jButton2.setText("QUAY LẠI");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("ĐẢO ĐÁP ÁN");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("ĐẢO CÂU HỎI");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setText("Kích đúp vào câu hỏi muốn chọn");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(jScrollPane5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(0, 177, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 47, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseClicked
        if(evt.getClickCount() == 2) {
            flag[iflag]=2;
            iflag++;
            //System.out.println(iflag);
            String name = (String)jList3.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            TracNghiem tracnghiem = (TracNghiem)htbtn.get(cauHoi[6]);
            
            
            stringtn[istrtn] = stringtn[istrtn-1] + tracnghiem.xuatCauHoi()+"\n"+tracnghiem.xuatDapAn()+"\n\n";
            istrtn++;
            string[istr] = string[0]+stringtn[istrtn-1] + "\n\n" + stringtl[istrtl-1];
            jTextArea2.setText(string[istr]);
            istr++;
            tn[itn] = tracnghiem;
            itn++;
            
        }
    }//GEN-LAST:event_jList3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        istr--;
        jTextArea2.setText(string[istr-1]);
        if(flag[iflag-1]==1) {
            istrtl--;
            tl[itl-1] = null;
            itl--;
            iflag--;
        } 
        else {
            istrtn--;
            tn[itn-1] = null;
            itn--;
            iflag--;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jList4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList4MouseClicked
        if(evt.getClickCount() == 2) {
            flag[iflag]=1;
            iflag++;
            String name = (String)jList4.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            TuLuan tuluan = (TuLuan)htbtl.get(cauHoi[6]);
            stringtl[istrtl] = stringtl[istrtl-1] + tuluan.xuatCauHoi()+"\n";
            istrtl++;
            string[istr] = string[0]+stringtn[istrtn-1] + "\n\n" + stringtl[istrtl-1];
            jTextArea2.setText(string[istr]);
            istr++;
            
            tl[itl] = tuluan;
            itl++;
            
        }
    }//GEN-LAST:event_jList4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        /*for(TuLuan tll:tl) {
            if(tll==null) break;
            System.out.println(tll.getCauHoi());
        }
        for(TracNghiem tll:tn) {
            if(tll==null) break;
            System.out.println(tll.getCauHoi());
        }*/
        dethi = new DeThi(tn,tl);
        dethi.daoCauHoi();
        String str="                    KIEM TRA MON: "+mon+"\n\n"+"Trac Nghiem\n";
        for(TracNghiem tn: dethi.xuatTN()) {
            if(tn==null) break;
            str = str + tn.xuatCauHoi() + "\n" + tn.xuatDapAn() + "\n\n";
        }
        str = str +"\n\nTu Luan\n";
        for(TuLuan tl: dethi.xuatTL()) {
            if(tl==null) break;
            str = str + tl.xuatCauHoi()+"\n";
        }
        jTextArea2.setText(str);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dethi = new DeThi(tn,tl);
        int i=0;
        while(dethi.xuatTN()[i]!=null) {
            dethi.xuatTN()[i].daoDapAn();
            i++;
        }
        String str="                    KIEM TRA MON: "+mon+"\n\n"+"Trac Nghiem\n";
        for(TracNghiem tn: dethi.xuatTN()) {
            if(tn==null) break;
            str = str + tn.xuatCauHoi() + "\n" + tn.xuatDapAn() + "\n\n";
        }
        str = str +"\n\nTu Luan\n";
        for(TuLuan tl: dethi.xuatTL()) {
            if(tl==null) break;
            str = str + tl.xuatCauHoi()+"\n";
        }
        jTextArea2.setText(str);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dethi = new DeThi(tn,tl);
        new TenFileXuatDeThi(dethi).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ChonTay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChonTay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChonTay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChonTay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChonTay("toan").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList jList3;
    private javax.swing.JList jList4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables

}

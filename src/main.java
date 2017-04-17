
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import static javax.swing.UIManager.get;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TranMinhHai
 */
public class main extends javax.swing.JFrame {
    private DefaultListModel<String> moSuChuong1TN = new DefaultListModel<>();
    private DefaultListModel<String> moSuChuong2TN = new DefaultListModel<>();
    private DefaultListModel<String> moSuChuong3TN = new DefaultListModel<>();
    private DefaultListModel<String> moSuChuong4TN = new DefaultListModel<>();
    private DefaultListModel<String> moSuChuong5TN = new DefaultListModel<>();
    private DefaultListModel<String> moNgoaiChuong1TN = new DefaultListModel<>();
    private DefaultListModel<String> moNgoaiChuong2TN = new DefaultListModel<>();
    private DefaultListModel<String> moDiaChuong1TN = new DefaultListModel<>();
    private DefaultListModel<String> moDiaChuong2TN = new DefaultListModel<>();
    private DefaultListModel<String> moDiaChuong3TN = new DefaultListModel<>();
    private DefaultListModel<String> moVanChuong1TN = new DefaultListModel<>();
    private DefaultListModel<String> moVanChuong2TN = new DefaultListModel<>();
    private DefaultListModel<String> moHoaChuong1TN = new DefaultListModel<>();
    private DefaultListModel<String> moHoaChuong2TN = new DefaultListModel<>();
    private DefaultListModel<String> moLyChuong1TN = new DefaultListModel<>();
    private DefaultListModel<String> moLyChuong2TN = new DefaultListModel<>();
    private DefaultListModel<String> moLyChuong3TN = new DefaultListModel<>();
    private DefaultListModel<String> moLyChuong4TN = new DefaultListModel<>();
    private DefaultListModel<String> moToanChuong1TN = new DefaultListModel<>();
    private DefaultListModel<String> moToanChuong2TN = new DefaultListModel<>();
    private DefaultListModel<String> moToanChuong3TN = new DefaultListModel<>();
    private DefaultListModel<String> motoantlchuong1 = new DefaultListModel<>();
    private DefaultListModel<String> motoantlchuong2 = new DefaultListModel<>();
    private DefaultListModel<String> motoantlchuong3 = new DefaultListModel<>();
    private DefaultListModel<String> motoantnchuong1 = new DefaultListModel<>();
    private DefaultListModel<String> motoantnchuong2 = new DefaultListModel<>();
    private DefaultListModel<String> motoantnchuong3 = new DefaultListModel<>();
    private DefaultListModel<String> mosutlchuong1 = new DefaultListModel<>();
    private DefaultListModel<String> mosutlchuong2 = new DefaultListModel<>();
    private DefaultListModel<String> mosutlchuong3 = new DefaultListModel<>();
    private DefaultListModel<String> mosutlchuong4 = new DefaultListModel<>();
    private DefaultListModel<String> mosutlchuong5 = new DefaultListModel<>();
    private DefaultListModel<String> mosutnchuong1 = new DefaultListModel<>();
    private DefaultListModel<String> mosutnchuong2 = new DefaultListModel<>();
    private DefaultListModel<String> mosutnchuong3 = new DefaultListModel<>();
    private DefaultListModel<String> mosutnchuong4 = new DefaultListModel<>();
    private DefaultListModel<String> mosutnchuong5 = new DefaultListModel<>();
    private DefaultListModel<String> mohoatlchuong1 = new DefaultListModel<>();
    private DefaultListModel<String> mohoatlchuong2 = new DefaultListModel<>();
    private DefaultListModel<String> mohoatnchuong1 = new DefaultListModel<>();
    private DefaultListModel<String> mohoatnchuong2 = new DefaultListModel<>();
    private DefaultListModel<String> molytlchuong1 = new DefaultListModel<>();
    private DefaultListModel<String> molytlchuong2 = new DefaultListModel<>();
    private DefaultListModel<String> molytlchuong3 = new DefaultListModel<>();
    private DefaultListModel<String> molytlchuong4 = new DefaultListModel<>();
    private DefaultListModel<String> molytnchuong1 = new DefaultListModel<>();
    private DefaultListModel<String> molytnchuong2 = new DefaultListModel<>();
    private DefaultListModel<String> molytnchuong3 = new DefaultListModel<>();
    private DefaultListModel<String> molytnchuong4 = new DefaultListModel<>();
    private DefaultListModel<String> movantlchuong1 = new DefaultListModel<>();
    private DefaultListModel<String> movantlchuong2 = new DefaultListModel<>();
    private DefaultListModel<String> movantnchuong1 = new DefaultListModel<>();
    private DefaultListModel<String> movantnchuong2 = new DefaultListModel<>();
    private DefaultListModel<String> modiatlchuong1 = new DefaultListModel<>();
    private DefaultListModel<String> modiatlchuong2 = new DefaultListModel<>();
    private DefaultListModel<String> modiatlchuong3 = new DefaultListModel<>();
    private DefaultListModel<String> modiatnchuong1 = new DefaultListModel<>();
    private DefaultListModel<String> modiatnchuong2 = new DefaultListModel<>();
    private DefaultListModel<String> modiatnchuong3 = new DefaultListModel<>();
    private DefaultListModel<String> mongoaitlchuong1 = new DefaultListModel<>();
    private DefaultListModel<String> mongoaitlchuong2 = new DefaultListModel<>();
    private DefaultListModel<String> mongoaitnchuong1 = new DefaultListModel<>();
    private DefaultListModel<String> mongoaitnchuong2 = new DefaultListModel<>();
    private Hashtable htbtoantl = new Hashtable();
    private Hashtable htbtoantn = new Hashtable();
    private Hashtable htbsutl = new Hashtable();
    private Hashtable htbsutn = new Hashtable();
    private Hashtable htbhoatl = new Hashtable();
    private Hashtable htbhoatn = new Hashtable();
    private Hashtable htbvantl = new Hashtable();
    private Hashtable htbvantn = new Hashtable();
    private Hashtable htbngoaitl = new Hashtable();
    private Hashtable htbngoaitn = new Hashtable();
    private Hashtable htblytl = new Hashtable();
    private Hashtable htblytn = new Hashtable();
    private Hashtable htbdiatl = new Hashtable();
    private Hashtable htbdiatn = new Hashtable();

    /**
     * Creates new form main
     */
    public main() {
        
        String url = System.getProperty("user.dir", null);
        String s = null,k = "1",path = null;    
        BufferedReader in = null;
        int flag=1;  // đánh dấu đang đọc đến file nào
        try {
            initComponents();
            
            for(int i=1;i<=14;i++) {
                if(flag == 1) path = url+"\\BTLOOP\\toantl.txt";
                if(flag == 2) path = url+"\\BTLOOP\\sutl.txt";
                if(flag == 3) path = url+"\\BTLOOP\\hoatl.txt";
                if(flag == 4) path = url+"\\BTLOOP\\vantl.txt";
                if(flag == 5) path = url+"\\BTLOOP\\lytl.txt";
                if(flag == 6) path = url+"\\BTLOOP\\diatl.txt";
                if(flag == 7) path = url+"\\BTLOOP\\ngoaitl.txt";
                if(flag == 8) path = url+"\\BTLOOP\\toantn.txt";
                if(flag == 9) path = url+"\\BTLOOP\\sutn.txt";
                if(flag == 10) path = url+"\\BTLOOP\\hoatn.txt";
                if(flag == 11) path = url+"\\BTLOOP\\vantn.txt";
                if(flag == 12) path = url+"\\BTLOOP\\lytn.txt";
                if(flag == 13) path = url+"\\BTLOOP\\diatn.txt";
                if(flag == 14) path = url+"\\BTLOOP\\ngoaitn.txt";

                do {
                    in = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF8"));
                    s = in.readLine();
                    do {
                        String str[] = s.split("&");
                        String strr[];
                        if(flag == 1) htbtoantl.put(str[0], str[3]);
                        if(flag == 2) htbsutl.put(str[0], str[3]);
                        if(flag == 3) htbhoatl.put(str[0], str[3]);
                        if(flag == 4) htbvantl.put(str[0], str[3]);
                        if(flag == 5) htblytl.put(str[0], str[3]);
                        if(flag == 6) htbdiatl.put(str[0], str[3]);
                        if(flag == 7) htbngoaitl.put(str[0], str[3]);
                        if(flag == 8) htbtoantn.put(str[0], str[3]);
                        if(flag == 9) htbsutn.put(str[0], str[3]);
                        if(flag == 10) htbhoatn.put(str[0], str[3]);
                        if(flag == 11) htbvantn.put(str[0], str[3]);
                        if(flag == 12) htblytn.put(str[0], str[3]);
                        if(flag == 13) htbdiatn.put(str[0], str[3]);
                        if(flag == 14) htbngoaitn.put(str[0], str[3]);
                        
                        if(str[2].equals(k)) {
                            if("1".equals(k)) str[0]=String.format("<html><b><font color=\"blue\">" + str[0]+ "</font></b></html>", str[0]);
                            if("2".equals(k)) str[0]=String.format("<html><b><font color=\"green\">" + str[0]+ "</font></b></html>", str[0]);
                            if("3".equals(k)) str[0]=String.format("<html><b><font color=\"red\">" + str[0]+ "</font></b></html>", str[0]);
                            
                            strr = str[1].split("#");
                            for(String strrr:strr) {
                            if("1".equals(strrr)) {
                                if(flag == 1) motoantlchuong1.addElement(str[0]);
                                if(flag == 2) mosutlchuong1.addElement(str[0]);
                                if(flag == 3) mohoatlchuong1.addElement(str[0]);
                                if(flag == 4) movantlchuong1.addElement(str[0]);
                                if(flag == 5) molytlchuong1.addElement(str[0]);
                                if(flag == 6) modiatlchuong1.addElement(str[0]);
                                if(flag == 7) mongoaitlchuong1.addElement(str[0]);
                                if(flag == 8) motoantnchuong1.addElement(str[0]);
                                if(flag == 9) mosutnchuong1.addElement(str[0]);
                                if(flag == 10) mohoatnchuong1.addElement(str[0]);
                                if(flag == 11) movantnchuong1.addElement(str[0]);
                                if(flag == 12) molytnchuong1.addElement(str[0]);
                                if(flag == 13) modiatnchuong1.addElement(str[0]);
                                if(flag == 14) mongoaitnchuong1.addElement(str[0]);
                            }
                            if("2".equals(strrr)) {
                                if(flag == 1) motoantlchuong2.addElement(str[0]);
                                if(flag == 2) mosutlchuong2.addElement(str[0]);
                                if(flag == 3) mohoatlchuong2.addElement(str[0]);
                                if(flag == 4) movantlchuong2.addElement(str[0]);
                                if(flag == 5) molytlchuong2.addElement(str[0]);
                                if(flag == 6) modiatlchuong2.addElement(str[0]);
                                if(flag == 7) mongoaitlchuong2.addElement(str[0]);
                                if(flag == 8) motoantnchuong2.addElement(str[0]);
                                if(flag == 9) mosutnchuong2.addElement(str[0]);
                                if(flag == 10) mohoatnchuong2.addElement(str[0]);
                                if(flag == 11) movantnchuong2.addElement(str[0]);
                                if(flag == 12) molytnchuong2.addElement(str[0]);
                                if(flag == 13) modiatnchuong2.addElement(str[0]);
                                if(flag == 14) mongoaitnchuong2.addElement(str[0]);
                            }
                            if("3".equals(strrr)) {
                                if(flag == 1) motoantlchuong3.addElement(str[0]);
                                if(flag == 2) mosutlchuong3.addElement(str[0]);
                                if(flag == 5) molytlchuong3.addElement(str[0]);
                                if(flag == 6) modiatlchuong3.addElement(str[0]);
                                if(flag == 8) motoantnchuong3.addElement(str[0]);
                                if(flag == 9) mosutnchuong3.addElement(str[0]);
                                if(flag == 12) molytnchuong3.addElement(str[0]);
                                if(flag == 13) modiatnchuong3.addElement(str[0]);
                            }
                            if("4".equals(strrr)) {
                                if(flag == 2) mosutlchuong4.addElement(str[0]);
                                if(flag == 5) molytlchuong4.addElement(str[0]);
                                if(flag == 9) mosutnchuong4.addElement(str[0]);
                                if(flag == 12) molytnchuong4.addElement(str[0]);
                            }
                            if("5".equals(strrr)) {
                                if(flag == 2) mosutlchuong5.addElement(str[0]);
                                if(flag == 9) mosutnchuong5.addElement(str[0]);
                            } 
                            }
                        }
                        s = in.readLine();
                    } while(s != null);
                    if(k == "3") k = "4";
                    if(k == "2") k = "3";
                    if(k == "1") k = "2";
                } while(k.equals("2") || k.equals("3"));
                k = "1";
                if(flag == 1) {
                    jList1.setModel(motoantlchuong1);
                    jList3.setModel(motoantlchuong2);
                    jList4.setModel(motoantlchuong3);
                    jList2.setModel(motoantnchuong1);
                    jList6.setModel(motoantnchuong2);
                    jList5.setModel(motoantnchuong3);
                }
                if(flag == 2) {
                    jList7.setModel(mosutlchuong1);
                    jList13.setModel(mosutlchuong2);
                    jList10.setModel(mosutlchuong3);
                    jList11.setModel(mosutlchuong4);
                    jList12.setModel(mosutlchuong5);
                    jList8.setModel(mosutnchuong1);
                    jList9.setModel(mosutnchuong2);
                    jList14.setModel(mosutnchuong3);
                    jList15.setModel(mosutnchuong4);
                    jList16.setModel(mosutnchuong5);
                }
                if(flag == 3) {
                    jList19.setModel(mohoatlchuong1);
                    jList21.setModel(mohoatlchuong2);
                    jList18.setModel(mohoatnchuong1);
                    jList20.setModel(mohoatnchuong2);
                }
                if(flag == 4) {
                    jList23.setModel(movantlchuong1);
                    jList24.setModel(movantlchuong2);
                    jList22.setModel(movantnchuong1);
                    jList25.setModel(movantnchuong2);
                }
                if(flag == 5) {
                    jList49.setModel(molytlchuong1);
                    jList50.setModel(molytlchuong2);
                    jList53.setModel(molytlchuong3);
                    jList58.setModel(molytlchuong4);
                    jList47.setModel(molytnchuong1);
                    jList51.setModel(molytnchuong2);
                    jList54.setModel(molytnchuong3);
                    jList56.setModel(molytnchuong4);
                }
                if(flag == 6) {
                    jList30.setModel(modiatlchuong1);
                    jList33.setModel(modiatlchuong2);
                    jList36.setModel(modiatlchuong3);
                    jList31.setModel(modiatnchuong1);
                    jList34.setModel(modiatnchuong2);
                    jList37.setModel(modiatnchuong3);
                }
                if(flag == 7) {
                    jList29.setModel(mongoaitlchuong1);
                    jList27.setModel(mongoaitlchuong2);
                    jList28.setModel(mongoaitnchuong1);
                    jList26.setModel(mongoaitnchuong2);
                }
                flag++;
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane9 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jScrollPane73 = new javax.swing.JScrollPane();
        jList45 = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane10 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList();
        jScrollPane74 = new javax.swing.JScrollPane();
        jList46 = new javax.swing.JList();
        jTabbedPane11 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList();
        jScrollPane33 = new javax.swing.JScrollPane();
        jList17 = new javax.swing.JList();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane12 = new javax.swing.JTabbedPane();
        jPanel36 = new javax.swing.JPanel();
        jScrollPane77 = new javax.swing.JScrollPane();
        jList49 = new javax.swing.JList();
        jScrollPane78 = new javax.swing.JScrollPane();
        jTextArea24 = new javax.swing.JTextArea();
        jPanel37 = new javax.swing.JPanel();
        jScrollPane75 = new javax.swing.JScrollPane();
        jList47 = new javax.swing.JList();
        jScrollPane76 = new javax.swing.JScrollPane();
        jList48 = new javax.swing.JList();
        jTabbedPane13 = new javax.swing.JTabbedPane();
        jPanel38 = new javax.swing.JPanel();
        jScrollPane79 = new javax.swing.JScrollPane();
        jList50 = new javax.swing.JList();
        jScrollPane80 = new javax.swing.JScrollPane();
        jTextArea26 = new javax.swing.JTextArea();
        jPanel39 = new javax.swing.JPanel();
        jScrollPane81 = new javax.swing.JScrollPane();
        jList51 = new javax.swing.JList();
        jScrollPane82 = new javax.swing.JScrollPane();
        jList52 = new javax.swing.JList();
        jTabbedPane14 = new javax.swing.JTabbedPane();
        jPanel40 = new javax.swing.JPanel();
        jScrollPane83 = new javax.swing.JScrollPane();
        jList53 = new javax.swing.JList();
        jScrollPane84 = new javax.swing.JScrollPane();
        jTextArea31 = new javax.swing.JTextArea();
        jPanel41 = new javax.swing.JPanel();
        jScrollPane85 = new javax.swing.JScrollPane();
        jList54 = new javax.swing.JList();
        jScrollPane86 = new javax.swing.JScrollPane();
        jList55 = new javax.swing.JList();
        jTabbedPane15 = new javax.swing.JTabbedPane();
        jPanel42 = new javax.swing.JPanel();
        jScrollPane89 = new javax.swing.JScrollPane();
        jList58 = new javax.swing.JList();
        jScrollPane90 = new javax.swing.JScrollPane();
        jTextArea32 = new javax.swing.JTextArea();
        jPanel43 = new javax.swing.JPanel();
        jScrollPane87 = new javax.swing.JScrollPane();
        jList56 = new javax.swing.JList();
        jScrollPane88 = new javax.swing.JScrollPane();
        jList57 = new javax.swing.JList();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jTabbedPane24 = new javax.swing.JTabbedPane();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane35 = new javax.swing.JScrollPane();
        jList19 = new javax.swing.JList();
        jScrollPane36 = new javax.swing.JScrollPane();
        jTextArea17 = new javax.swing.JTextArea();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jList18 = new javax.swing.JList();
        jScrollPane71 = new javax.swing.JScrollPane();
        jList43 = new javax.swing.JList();
        jTabbedPane25 = new javax.swing.JTabbedPane();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane39 = new javax.swing.JScrollPane();
        jList21 = new javax.swing.JList();
        jScrollPane40 = new javax.swing.JScrollPane();
        jTextArea19 = new javax.swing.JTextArea();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane37 = new javax.swing.JScrollPane();
        jList20 = new javax.swing.JList();
        jScrollPane72 = new javax.swing.JScrollPane();
        jList44 = new javax.swing.JList();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jTabbedPane30 = new javax.swing.JTabbedPane();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane43 = new javax.swing.JScrollPane();
        jList23 = new javax.swing.JList();
        jScrollPane44 = new javax.swing.JScrollPane();
        jTextArea21 = new javax.swing.JTextArea();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane41 = new javax.swing.JScrollPane();
        jList22 = new javax.swing.JList();
        jScrollPane69 = new javax.swing.JScrollPane();
        jList41 = new javax.swing.JList();
        jTabbedPane31 = new javax.swing.JTabbedPane();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane45 = new javax.swing.JScrollPane();
        jList24 = new javax.swing.JList();
        jScrollPane46 = new javax.swing.JScrollPane();
        jTextArea22 = new javax.swing.JTextArea();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane47 = new javax.swing.JScrollPane();
        jList25 = new javax.swing.JList();
        jScrollPane70 = new javax.swing.JScrollPane();
        jList42 = new javax.swing.JList();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jTabbedPane51 = new javax.swing.JTabbedPane();
        jPanel30 = new javax.swing.JPanel();
        jScrollPane57 = new javax.swing.JScrollPane();
        jList30 = new javax.swing.JList();
        jScrollPane58 = new javax.swing.JScrollPane();
        jTextArea28 = new javax.swing.JTextArea();
        jPanel31 = new javax.swing.JPanel();
        jScrollPane59 = new javax.swing.JScrollPane();
        jList31 = new javax.swing.JList();
        jScrollPane60 = new javax.swing.JScrollPane();
        jList32 = new javax.swing.JList();
        jTabbedPane52 = new javax.swing.JTabbedPane();
        jPanel32 = new javax.swing.JPanel();
        jScrollPane61 = new javax.swing.JScrollPane();
        jList33 = new javax.swing.JList();
        jScrollPane62 = new javax.swing.JScrollPane();
        jTextArea29 = new javax.swing.JTextArea();
        jPanel33 = new javax.swing.JPanel();
        jScrollPane63 = new javax.swing.JScrollPane();
        jList34 = new javax.swing.JList();
        jScrollPane64 = new javax.swing.JScrollPane();
        jList35 = new javax.swing.JList();
        jTabbedPane53 = new javax.swing.JTabbedPane();
        jPanel34 = new javax.swing.JPanel();
        jScrollPane65 = new javax.swing.JScrollPane();
        jList36 = new javax.swing.JList();
        jScrollPane66 = new javax.swing.JScrollPane();
        jTextArea30 = new javax.swing.JTextArea();
        jPanel35 = new javax.swing.JPanel();
        jScrollPane67 = new javax.swing.JScrollPane();
        jList37 = new javax.swing.JList();
        jScrollPane68 = new javax.swing.JScrollPane();
        jList38 = new javax.swing.JList();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jTabbedPane60 = new javax.swing.JTabbedPane();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane55 = new javax.swing.JScrollPane();
        jList29 = new javax.swing.JList();
        jScrollPane56 = new javax.swing.JScrollPane();
        jTextArea27 = new javax.swing.JTextArea();
        jPanel29 = new javax.swing.JPanel();
        jScrollPane53 = new javax.swing.JScrollPane();
        jList28 = new javax.swing.JList();
        jScrollPane54 = new javax.swing.JScrollPane();
        jList39 = new javax.swing.JList();
        jTabbedPane61 = new javax.swing.JTabbedPane();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane51 = new javax.swing.JScrollPane();
        jList27 = new javax.swing.JList();
        jScrollPane52 = new javax.swing.JScrollPane();
        jTextArea25 = new javax.swing.JTextArea();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane49 = new javax.swing.JScrollPane();
        jList26 = new javax.swing.JList();
        jScrollPane50 = new javax.swing.JScrollPane();
        jList40 = new javax.swing.JList();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jTabbedPane36 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jList7 = new javax.swing.JList();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jList8 = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList59 = new javax.swing.JList();
        jTabbedPane37 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane25 = new javax.swing.JScrollPane();
        jList13 = new javax.swing.JList();
        jScrollPane26 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jList9 = new javax.swing.JList();
        jScrollPane12 = new javax.swing.JScrollPane();
        jList60 = new javax.swing.JList();
        jTabbedPane38 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jList10 = new javax.swing.JList();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane27 = new javax.swing.JScrollPane();
        jList14 = new javax.swing.JList();
        jScrollPane34 = new javax.swing.JScrollPane();
        jList61 = new javax.swing.JList();
        jTabbedPane39 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane21 = new javax.swing.JScrollPane();
        jList11 = new javax.swing.JList();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane29 = new javax.swing.JScrollPane();
        jList15 = new javax.swing.JList();
        jScrollPane38 = new javax.swing.JScrollPane();
        jList62 = new javax.swing.JList();
        jTabbedPane40 = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane23 = new javax.swing.JScrollPane();
        jList12 = new javax.swing.JList();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane31 = new javax.swing.JScrollPane();
        jList16 = new javax.swing.JList();
        jScrollPane42 = new javax.swing.JScrollPane();
        jList63 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel1.setText("kích đúp vào câu hỏi để hiện gợi ý");

        jLabel4.setText("câu hỏi sắp xếp theo thứ tự dễ->TB->khó phân biệt qua màu sắc ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        jTabbedPane9.addTab("Tự Luận", jPanel2);

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList2);

        jScrollPane73.setViewportView(jList45);

        jLabel2.setText("kích đúp vào câu hỏi để hiện đáp án");

        jLabel3.setText("màu đỏ là phương án đúng");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane73, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane73, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane9.addTab("Trắc Nghiệm", jPanel3);

        jTabbedPane2.addTab("Chương 1: Lượng giác", jTabbedPane9);

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
        jScrollPane5.setViewportView(jList3);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane6.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane10.addTab("Tự Luận", jPanel4);

        jList6.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList6MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(jList6);

        jScrollPane74.setViewportView(jList46);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane74, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane74)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane10.addTab("Trắc Nghiệm", jPanel5);

        jTabbedPane2.addTab("Chương 2: Tổ hợp, xác suất", jTabbedPane10);

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
        jScrollPane7.setViewportView(jList4);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane8.setViewportView(jTextArea4);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane8)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane11.addTab("Tự Luận", jPanel6);

        jList5.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList5MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jList5);

        jScrollPane33.setViewportView(jList17);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane33, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane33)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane11.addTab("Trắc Nghiệm", jPanel7);

        jTabbedPane2.addTab("Chương 3: Khảo sát hàm số", jTabbedPane11);

        jTabbedPane1.addTab("Toán", jTabbedPane2);

        jList49.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList49MouseClicked(evt);
            }
        });
        jScrollPane77.setViewportView(jList49);

        jTextArea24.setColumns(20);
        jTextArea24.setRows(5);
        jScrollPane78.setViewportView(jTextArea24);

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane77, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane78, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane78)
                    .addComponent(jScrollPane77, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane12.addTab("Tự luận", jPanel36);

        jList47.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList47MouseClicked(evt);
            }
        });
        jScrollPane75.setViewportView(jList47);

        jList48.setToolTipText("");
        jScrollPane76.setViewportView(jList48);

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane75, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane76, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane76, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jScrollPane75))
                .addContainerGap())
        );

        jTabbedPane12.addTab("Trắc nghiệm", jPanel37);

        jTabbedPane3.addTab("Chương 1: Động học chất điểm", jTabbedPane12);

        jList50.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList50MouseClicked(evt);
            }
        });
        jScrollPane79.setViewportView(jList50);

        jTextArea26.setColumns(20);
        jTextArea26.setRows(5);
        jScrollPane80.setViewportView(jTextArea26);

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane79, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane80, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane80)
                    .addComponent(jScrollPane79, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane13.addTab("Tự luận", jPanel38);

        jList51.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList51MouseClicked(evt);
            }
        });
        jScrollPane81.setViewportView(jList51);

        jList52.setToolTipText("");
        jScrollPane82.setViewportView(jList52);

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane81, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane82, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane82, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jScrollPane81))
                .addContainerGap())
        );

        jTabbedPane13.addTab("Trắc nghiệm", jPanel39);

        jTabbedPane3.addTab("Chương 2: Chất khí", jTabbedPane13);

        jList53.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList53MouseClicked(evt);
            }
        });
        jScrollPane83.setViewportView(jList53);

        jTextArea31.setColumns(20);
        jTextArea31.setRows(5);
        jScrollPane84.setViewportView(jTextArea31);

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane83, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane84, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane84)
                    .addComponent(jScrollPane83, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane14.addTab("Tự luận", jPanel40);

        jList54.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList54MouseClicked(evt);
            }
        });
        jScrollPane85.setViewportView(jList54);

        jScrollPane86.setViewportView(jList55);

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane85, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane86, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane86, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jScrollPane85))
                .addContainerGap())
        );

        jTabbedPane14.addTab("Trắc nghiệm", jPanel41);

        jTabbedPane3.addTab("Chương 3: Chất rắn", jTabbedPane14);

        jList58.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList58MouseClicked(evt);
            }
        });
        jScrollPane89.setViewportView(jList58);

        jTextArea32.setColumns(20);
        jTextArea32.setRows(5);
        jScrollPane90.setViewportView(jTextArea32);

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane89, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane90, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane90)
                    .addComponent(jScrollPane89, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane15.addTab("Tự luận", jPanel42);

        jList56.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList56MouseClicked(evt);
            }
        });
        jScrollPane87.setViewportView(jList56);

        jScrollPane88.setViewportView(jList57);

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane87, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane88, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane88, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jScrollPane87))
                .addContainerGap())
        );

        jTabbedPane15.addTab("Trắc nghiệm", jPanel43);

        jTabbedPane3.addTab("Chương 4: Chất lỏng", jTabbedPane15);

        jTabbedPane1.addTab("Vật Lý", jTabbedPane3);

        jList19.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList19MouseClicked(evt);
            }
        });
        jScrollPane35.setViewportView(jList19);

        jTextArea17.setColumns(20);
        jTextArea17.setRows(5);
        jScrollPane36.setViewportView(jTextArea17);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane36, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane36)
                    .addComponent(jScrollPane35, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane24.addTab("Tự luận", jPanel18);

        jList18.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList18MouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(jList18);

        jScrollPane71.setViewportView(jList43);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane71, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane71, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jScrollPane10))
                .addContainerGap())
        );

        jTabbedPane24.addTab("Trắc nghiệm", jPanel19);

        jTabbedPane4.addTab("Chương 1: hóa học vô cơ", jTabbedPane24);

        jList21.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList21MouseClicked(evt);
            }
        });
        jScrollPane39.setViewportView(jList21);

        jTextArea19.setColumns(20);
        jTextArea19.setRows(5);
        jScrollPane40.setViewportView(jTextArea19);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane40, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane40)
                    .addComponent(jScrollPane39, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane25.addTab("Tự luận", jPanel20);

        jList20.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList20MouseClicked(evt);
            }
        });
        jScrollPane37.setViewportView(jList20);

        jScrollPane72.setViewportView(jList44);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane72, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane72, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jScrollPane37))
                .addContainerGap())
        );

        jTabbedPane25.addTab("Trắc nghiệm", jPanel21);

        jTabbedPane4.addTab("hóa học hữu cơ", jTabbedPane25);

        jTabbedPane1.addTab("Hóa Học", jTabbedPane4);

        jList23.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList23MouseClicked(evt);
            }
        });
        jScrollPane43.setViewportView(jList23);

        jTextArea21.setColumns(20);
        jTextArea21.setRows(5);
        jScrollPane44.setViewportView(jTextArea21);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane44, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane44)
                    .addComponent(jScrollPane43, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane30.addTab("Tự luận", jPanel22);

        jList22.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList22MouseClicked(evt);
            }
        });
        jScrollPane41.setViewportView(jList22);

        jScrollPane69.setViewportView(jList41);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane69, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane69, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jScrollPane41))
                .addContainerGap())
        );

        jTabbedPane30.addTab("Trắc nghiệm", jPanel23);

        jTabbedPane5.addTab("Chương 1: văn học cận đại", jTabbedPane30);

        jList24.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList24MouseClicked(evt);
            }
        });
        jScrollPane45.setViewportView(jList24);

        jTextArea22.setColumns(20);
        jTextArea22.setRows(5);
        jScrollPane46.setViewportView(jTextArea22);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane46, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane46)
                    .addComponent(jScrollPane45, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane31.addTab("Tự luận", jPanel24);

        jList25.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList25MouseClicked(evt);
            }
        });
        jScrollPane47.setViewportView(jList25);

        jScrollPane70.setViewportView(jList42);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane70, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane70, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jScrollPane47))
                .addContainerGap())
        );

        jTabbedPane31.addTab("Trắc nghiệm", jPanel25);

        jTabbedPane5.addTab("Chương 2: văn học hiện đại", jTabbedPane31);

        jTabbedPane1.addTab("Văn Học", jTabbedPane5);

        jList30.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList30MouseClicked(evt);
            }
        });
        jScrollPane57.setViewportView(jList30);

        jTextArea28.setColumns(20);
        jTextArea28.setRows(5);
        jScrollPane58.setViewportView(jTextArea28);

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane57, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane58, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane58)
                    .addComponent(jScrollPane57, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane51.addTab("Tự luận", jPanel30);

        jList31.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList31MouseClicked(evt);
            }
        });
        jScrollPane59.setViewportView(jList31);

        jScrollPane60.setViewportView(jList32);

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane59, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane60, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane60, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jScrollPane59))
                .addContainerGap())
        );

        jTabbedPane51.addTab("Trắc nghiệm", jPanel31);

        jTabbedPane7.addTab("Chương 1: Vũ trụ", jTabbedPane51);

        jList33.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList33MouseClicked(evt);
            }
        });
        jScrollPane61.setViewportView(jList33);

        jTextArea29.setColumns(20);
        jTextArea29.setRows(5);
        jScrollPane62.setViewportView(jTextArea29);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane61, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane62, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane61, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jScrollPane62))
                .addContainerGap())
        );

        jTabbedPane52.addTab("Tự luận", jPanel32);

        jList34.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList34MouseClicked(evt);
            }
        });
        jScrollPane63.setViewportView(jList34);

        jScrollPane64.setViewportView(jList35);

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane63, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane64, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane64, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jScrollPane63))
                .addContainerGap())
        );

        jTabbedPane52.addTab("Trắc nghiệm", jPanel33);

        jTabbedPane7.addTab("Chương 2: Địa lý tự nhiên", jTabbedPane52);

        jList36.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList36MouseClicked(evt);
            }
        });
        jScrollPane65.setViewportView(jList36);

        jTextArea30.setColumns(20);
        jTextArea30.setRows(5);
        jScrollPane66.setViewportView(jTextArea30);

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane65, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane66, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane66)
                    .addComponent(jScrollPane65, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane53.addTab("Tự luận", jPanel34);

        jList37.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList37MouseClicked(evt);
            }
        });
        jScrollPane67.setViewportView(jList37);

        jScrollPane68.setViewportView(jList38);

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane67, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane68, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane68, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jScrollPane67))
                .addContainerGap())
        );

        jTabbedPane53.addTab("Trắc nghiệm", jPanel35);

        jTabbedPane7.addTab("Chương 3: Địa lý kinh tế", jTabbedPane53);

        jTabbedPane1.addTab("Địa Lý", jTabbedPane7);

        jList29.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList29MouseClicked(evt);
            }
        });
        jScrollPane55.setViewportView(jList29);

        jTextArea27.setColumns(20);
        jTextArea27.setRows(5);
        jScrollPane56.setViewportView(jTextArea27);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane55, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane56, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane56)
                    .addComponent(jScrollPane55, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane60.addTab("Tự luận", jPanel28);

        jList28.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList28MouseClicked(evt);
            }
        });
        jScrollPane53.setViewportView(jList28);

        jScrollPane54.setViewportView(jList39);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane53, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane54, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane54, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jScrollPane53))
                .addContainerGap())
        );

        jTabbedPane60.addTab("Trắc nghiệm", jPanel29);

        jTabbedPane8.addTab("Chương 1: English For life", jTabbedPane60);

        jList27.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList27MouseClicked(evt);
            }
        });
        jScrollPane51.setViewportView(jList27);

        jTextArea25.setColumns(20);
        jTextArea25.setRows(5);
        jScrollPane52.setViewportView(jTextArea25);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane52, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane52)
                    .addComponent(jScrollPane51, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane61.addTab("Tự luận", jPanel26);

        jList26.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList26MouseClicked(evt);
            }
        });
        jScrollPane49.setViewportView(jList26);

        jScrollPane50.setViewportView(jList40);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane50, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane50, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jScrollPane49))
                .addContainerGap())
        );

        jTabbedPane61.addTab("Trắc nghiệm", jPanel27);

        jTabbedPane8.addTab("Chương 2: English For IT", jTabbedPane61);

        jTabbedPane1.addTab("Tiếng Anh", jTabbedPane8);

        jList7.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList7MouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(jList7);

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jScrollPane14.setViewportView(jTextArea7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane14)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane36.addTab("Tự luận", jPanel8);

        jList8.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList8MouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(jList8);

        jScrollPane4.setViewportView(jList59);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane36.addTab("Trắc nghiệm", jPanel9);

        jTabbedPane6.addTab("Chương 1: Lịch sử cổ đại", jTabbedPane36);

        jList13.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList13MouseClicked(evt);
            }
        });
        jScrollPane25.setViewportView(jList13);

        jTextArea13.setColumns(20);
        jTextArea13.setRows(5);
        jScrollPane26.setViewportView(jTextArea13);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane26)
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane37.addTab("Tự luận", jPanel10);

        jList9.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList9MouseClicked(evt);
            }
        });
        jScrollPane17.setViewportView(jList9);

        jScrollPane12.setViewportView(jList60);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane12)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane37.addTab("Trắc nghiệm", jPanel11);

        jTabbedPane6.addTab("Chương 2: lịch sử trung đại", jTabbedPane37);

        jList10.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList10MouseClicked(evt);
            }
        });
        jScrollPane19.setViewportView(jList10);

        jTextArea10.setColumns(20);
        jTextArea10.setRows(5);
        jScrollPane20.setViewportView(jTextArea10);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane20)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane38.addTab("Tự luận", jPanel12);

        jList14.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList14MouseClicked(evt);
            }
        });
        jScrollPane27.setViewportView(jList14);

        jScrollPane34.setViewportView(jList61);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane34, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane34)
                    .addComponent(jScrollPane27, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane38.addTab("Trắc nghiệm", jPanel13);

        jTabbedPane6.addTab("Chương 3: lịch sử hiện đại", jTabbedPane38);

        jList11.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList11MouseClicked(evt);
            }
        });
        jScrollPane21.setViewportView(jList11);

        jTextArea11.setColumns(20);
        jTextArea11.setRows(5);
        jScrollPane22.setViewportView(jTextArea11);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane22)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane39.addTab("Tự luận", jPanel14);

        jList15.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList15MouseClicked(evt);
            }
        });
        jScrollPane29.setViewportView(jList15);

        jScrollPane38.setViewportView(jList62);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane38, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane38)
                    .addComponent(jScrollPane29, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane39.addTab("Trắc nghiệm", jPanel15);

        jTabbedPane6.addTab("Chương 4: chiến tranh thế giới", jTabbedPane39);

        jList12.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList12MouseClicked(evt);
            }
        });
        jScrollPane23.setViewportView(jList12);

        jTextArea12.setColumns(20);
        jTextArea12.setRows(5);
        jScrollPane24.setViewportView(jTextArea12);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane24)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane40.addTab("Tự luận", jPanel16);

        jList16.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList16MouseClicked(evt);
            }
        });
        jScrollPane31.setViewportView(jList16);

        jScrollPane42.setViewportView(jList63);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane42, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane42)
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane40.addTab("Trắc nghiệm", jPanel17);

        jTabbedPane6.addTab("Chương 5: Lịch sử Việt Nam", jTabbedPane40);

        jTabbedPane1.addTab("Lịch Sử", jTabbedPane6);

        jButton1.setText("Sinh ngẫu nhiên");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Chọn tay");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Thêm câu hỏi");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
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

    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseClicked
        if(evt.getClickCount() == 2) {
            String name=(String)jList3.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String goiY = (String)htbtoantl.get(cauHoi[6]);
            jTextArea3.setText(goiY);
        }
    }//GEN-LAST:event_jList3MouseClicked

    private void jList4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList4MouseClicked
        if(evt.getClickCount() == 2) {
            String name=(String)jList4.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String goiY = (String)htbtoantl.get(cauHoi[6]);
            jTextArea4.setText(goiY);
        }
    }//GEN-LAST:event_jList4MouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        if(evt.getClickCount() == 2) {
            String name=(String)jList1.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String goiY = (String)htbtoantl.get(cauHoi[6]);
            jTextArea1.setText(goiY);
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jList5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList5MouseClicked
        if(evt.getClickCount() == 2) {
            moToanChuong3TN.removeAllElements();
            String name=(String)jList5.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String dapAn = (String)htbtoantn.get(cauHoi[6]);
            String dapAnTN[] = dapAn.split("#");
            for(int n = 0; n < dapAnTN.length; n = n + 2) {
                String da = dapAnTN[n];
                String giaTri = dapAnTN[n+1];
                if(giaTri.equals("1")) da = String.format("<html><b><font color=\"red\">" + da + "</font></b></html>", da); 
                moToanChuong3TN.addElement(da);
            }
            jList17.setModel(moToanChuong3TN);
        }
    }//GEN-LAST:event_jList5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new NgauNhienChonMon().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
        if(evt.getClickCount() == 2) {
            moToanChuong1TN.removeAllElements();
            String name=(String)jList2.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String dapAn = (String)htbtoantn.get(cauHoi[6]);
            String dapAnTN[] = dapAn.split("#");
            for(int n = 0; n < dapAnTN.length; n = n + 2) {
                String da = dapAnTN[n];
                String giaTri = dapAnTN[n+1];
                if(giaTri.equals("1")) da = String.format("<html><b><font color=\"red\">" + da + "</font></b></html>", da); 
                moToanChuong1TN.addElement(da);
            }
            jList45.setModel(moToanChuong1TN);
        }
    }//GEN-LAST:event_jList2MouseClicked

    private void jList6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList6MouseClicked
        if(evt.getClickCount() == 2) {
            moToanChuong2TN.removeAllElements();
            String name=(String)jList6.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String dapAn = (String)htbtoantn.get(cauHoi[6]);
            String dapAnTN[] = dapAn.split("#");
            for(int n = 0; n < dapAnTN.length; n = n + 2) {
                String da = dapAnTN[n];
                String giaTri = dapAnTN[n+1];
                if(giaTri.equals("1")) da = String.format("<html><b><font color=\"red\">" + da + "</font></b></html>", da); 
                moToanChuong2TN.addElement(da);
            }
            jList46.setModel(moToanChuong2TN);
        }
    }//GEN-LAST:event_jList6MouseClicked

    private void jList49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList49MouseClicked
        if(evt.getClickCount() == 2) {
            String name=(String)jList49.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String goiY = (String)htblytl.get(cauHoi[6]);
            jTextArea24.setText(goiY);
        }
    }//GEN-LAST:event_jList49MouseClicked

    private void jList50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList50MouseClicked
        if(evt.getClickCount() == 2) {
            String name=(String)jList50.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String goiY = (String)htblytl.get(cauHoi[6]);
            jTextArea26.setText(goiY);
        }
    }//GEN-LAST:event_jList50MouseClicked

    private void jList53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList53MouseClicked
        if(evt.getClickCount() == 2) {
            String name=(String)jList53.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String goiY = (String)htblytl.get(cauHoi[6]);
            jTextArea31.setText(goiY);
        }
    }//GEN-LAST:event_jList53MouseClicked

    private void jList58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList58MouseClicked
        if(evt.getClickCount() == 2) {
            String name=(String)jList58.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String goiY = (String)htblytl.get(cauHoi[6]);
            jTextArea32.setText(goiY);
        }
    }//GEN-LAST:event_jList58MouseClicked

    private void jList47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList47MouseClicked
        if(evt.getClickCount() == 2) {
            moLyChuong1TN.removeAllElements();
            String name=(String)jList47.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String dapAn = (String)htblytn.get(cauHoi[6]);
            String dapAnTN[] = dapAn.split("#");
            for(int n = 0; n < dapAnTN.length; n = n + 2) {
                String da = dapAnTN[n];
                String giaTri = dapAnTN[n+1];
                if(giaTri.equals("1")) da = String.format("<html><b><font color=\"red\">" + da + "</font></b></html>", da); 
                moLyChuong1TN.addElement(da);
            }
            jList48.setModel(moLyChuong1TN);
        }
    }//GEN-LAST:event_jList47MouseClicked

    private void jList51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList51MouseClicked
        if(evt.getClickCount() == 2) {
            moLyChuong2TN.removeAllElements();
            String name=(String)jList51.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String dapAn = (String)htblytn.get(cauHoi[6]);
            String dapAnTN[] = dapAn.split("#");
            for(int n = 0; n < dapAnTN.length; n = n + 2) {
                String da = dapAnTN[n];
                String giaTri = dapAnTN[n+1];
                if(giaTri.equals("1")) da = String.format("<html><b><font color=\"red\">" + da + "</font></b></html>", da); 
                moLyChuong2TN.addElement(da);
            }
            jList52.setModel(moLyChuong2TN);
        }
    }//GEN-LAST:event_jList51MouseClicked

    private void jList54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList54MouseClicked
        if(evt.getClickCount() == 2) {
            moLyChuong3TN.removeAllElements();
            String name=(String)jList54.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String dapAn = (String)htblytn.get(cauHoi[6]);
            String dapAnTN[] = dapAn.split("#");
            for(int n = 0; n < dapAnTN.length; n = n + 2) {
                String da = dapAnTN[n];
                String giaTri = dapAnTN[n+1];
                if(giaTri.equals("1")) da = String.format("<html><b><font color=\"red\">" + da + "</font></b></html>", da); 
                moLyChuong3TN.addElement(da);
            }
            jList55.setModel(moLyChuong3TN);
        }
    }//GEN-LAST:event_jList54MouseClicked

    private void jList56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList56MouseClicked
        if(evt.getClickCount() == 2) {
            moLyChuong4TN.removeAllElements();
            String name=(String)jList56.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String dapAn = (String)htblytn.get(cauHoi[6]);
            String dapAnTN[] = dapAn.split("#");
            for(int n = 0; n < dapAnTN.length; n = n + 2) {
                String da = dapAnTN[n];
                String giaTri = dapAnTN[n+1];
                if(giaTri.equals("1")) da = String.format("<html><b><font color=\"red\">" + da + "</font></b></html>", da); 
                moLyChuong4TN.addElement(da);
            }
            jList57.setModel(moLyChuong4TN);
        }
    }//GEN-LAST:event_jList56MouseClicked

    private void jList19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList19MouseClicked
        if(evt.getClickCount() == 2) {
            String name=(String)jList19.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String goiY = (String)htbhoatl.get(cauHoi[6]);
            jTextArea17.setText(goiY);
        }
    }//GEN-LAST:event_jList19MouseClicked

    private void jList21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList21MouseClicked
        if(evt.getClickCount() == 2) {
            String name=(String)jList21.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String goiY = (String)htbhoatl.get(cauHoi[6]);
            jTextArea19.setText(goiY);
        }
    }//GEN-LAST:event_jList21MouseClicked

    private void jList18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList18MouseClicked
        if(evt.getClickCount() == 2) {
            moHoaChuong1TN.removeAllElements();
            String name=(String)jList18.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String dapAn = (String)htbhoatn.get(cauHoi[6]);
            String dapAnTN[] = dapAn.split("#");
            for(int n = 0; n < dapAnTN.length; n = n + 2) {
                String da = dapAnTN[n];
                String giaTri = dapAnTN[n+1];
                if(giaTri.equals("1")) da = String.format("<html><b><font color=\"red\">" + da + "</font></b></html>", da); 
                moHoaChuong1TN.addElement(da);
            }
            jList43.setModel(moHoaChuong1TN);
        }
    }//GEN-LAST:event_jList18MouseClicked

    private void jList20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList20MouseClicked
        if(evt.getClickCount() == 2) {
            moHoaChuong2TN.removeAllElements();
            String name=(String)jList20.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String dapAn = (String)htbhoatn.get(cauHoi[6]);
            String dapAnTN[] = dapAn.split("#");
            for(int n = 0; n < dapAnTN.length; n = n + 2) {
                String da = dapAnTN[n];
                String giaTri = dapAnTN[n+1];
                if(giaTri.equals("1")) da = String.format("<html><b><font color=\"red\">" + da + "</font></b></html>", da); 
                moHoaChuong2TN.addElement(da);
            }
            jList44.setModel(moHoaChuong2TN);
        }
    }//GEN-LAST:event_jList20MouseClicked

    private void jList23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList23MouseClicked
        if(evt.getClickCount() == 2) {
            String name=(String)jList23.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String goiY = (String)htbvantl.get(cauHoi[6]);
            jTextArea21.setText(goiY);
        }
    }//GEN-LAST:event_jList23MouseClicked

    private void jList24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList24MouseClicked
        if(evt.getClickCount() == 2) {
            String name=(String)jList24.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String goiY = (String)htbvantl.get(cauHoi[6]);
            jTextArea22.setText(goiY);
        }
    }//GEN-LAST:event_jList24MouseClicked

    private void jList22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList22MouseClicked
        if(evt.getClickCount() == 2) {
            moVanChuong1TN.removeAllElements();
            String name=(String)jList22.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String dapAn = (String)htbvantn.get(cauHoi[6]);
            String dapAnTN[] = dapAn.split("#");
            for(int n = 0; n < dapAnTN.length; n = n + 2) {
                String da = dapAnTN[n];
                String giaTri = dapAnTN[n+1];
                if(giaTri.equals("1")) da = String.format("<html><b><font color=\"red\">" + da + "</font></b></html>", da); 
                moVanChuong1TN.addElement(da);
            }
            jList41.setModel(moVanChuong1TN);
        }
    }//GEN-LAST:event_jList22MouseClicked

    private void jList25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList25MouseClicked
        if(evt.getClickCount() == 2) {
            moVanChuong2TN.removeAllElements();
            String name=(String)jList25.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String dapAn = (String)htbvantn.get(cauHoi[6]);
            String dapAnTN[] = dapAn.split("#");
            for(int n = 0; n < dapAnTN.length; n = n + 2) {
                String da = dapAnTN[n];
                String giaTri = dapAnTN[n+1];
                if(giaTri.equals("1")) da = String.format("<html><b><font color=\"red\">" + da + "</font></b></html>", da); 
                moVanChuong2TN.addElement(da);
            }
            jList42.setModel(moVanChuong2TN);
        }
    }//GEN-LAST:event_jList25MouseClicked

    private void jList30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList30MouseClicked
        if(evt.getClickCount() == 2) {
            String name=(String)jList30.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String goiY = (String)htbdiatl.get(cauHoi[6]);
            jTextArea28.setText(goiY);
        }
    }//GEN-LAST:event_jList30MouseClicked

    private void jList33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList33MouseClicked
        if(evt.getClickCount() == 2) {
            String name=(String)jList33.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String goiY = (String)htbdiatl.get(cauHoi[6]);
            jTextArea29.setText(goiY);
        }
    }//GEN-LAST:event_jList33MouseClicked

    private void jList36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList36MouseClicked
        if(evt.getClickCount() == 2) {
            String name=(String)jList36.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String goiY = (String)htbdiatl.get(cauHoi[6]);
            jTextArea30.setText(goiY);
        }
    }//GEN-LAST:event_jList36MouseClicked

    private void jList31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList31MouseClicked
        if(evt.getClickCount() == 2) {
            moDiaChuong1TN.removeAllElements();
            String name=(String)jList31.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String dapAn = (String)htbdiatn.get(cauHoi[6]);
            String dapAnTN[] = dapAn.split("#");
            for(int n = 0; n < dapAnTN.length; n = n + 2) {
                String da = dapAnTN[n];
                String giaTri = dapAnTN[n+1];
                if(giaTri.equals("1")) da = String.format("<html><b><font color=\"red\">" + da + "</font></b></html>", da); 
                moDiaChuong1TN.addElement(da);
            }
            jList32.setModel(moDiaChuong1TN);
        }
    }//GEN-LAST:event_jList31MouseClicked

    private void jList34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList34MouseClicked
        if(evt.getClickCount() == 2) {
            moDiaChuong2TN.removeAllElements();
            String name=(String)jList34.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String dapAn = (String)htbdiatn.get(cauHoi[6]);
            String dapAnTN[] = dapAn.split("#");
            for(int n = 0; n < dapAnTN.length; n = n + 2) {
                String da = dapAnTN[n];
                String giaTri = dapAnTN[n+1];
                if(giaTri.equals("1")) da = String.format("<html><b><font color=\"red\">" + da + "</font></b></html>", da); 
                moDiaChuong2TN.addElement(da);
            }
            jList35.setModel(moDiaChuong2TN);
        }
    }//GEN-LAST:event_jList34MouseClicked

    private void jList37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList37MouseClicked
        if(evt.getClickCount() == 2) {
            moDiaChuong3TN.removeAllElements();
            String name=(String)jList37.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String dapAn = (String)htbdiatn.get(cauHoi[6]);
            String dapAnTN[] = dapAn.split("#");
            for(int n = 0; n < dapAnTN.length; n = n + 2) {
                String da = dapAnTN[n];
                String giaTri = dapAnTN[n+1];
                if(giaTri.equals("1")) da = String.format("<html><b><font color=\"red\">" + da + "</font></b></html>", da); 
                moDiaChuong3TN.addElement(da);
            }
            jList38.setModel(moDiaChuong3TN);
        }
    }//GEN-LAST:event_jList37MouseClicked

    private void jList29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList29MouseClicked
        if(evt.getClickCount() == 2) {
            String name=(String)jList29.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String goiY = (String)htbngoaitl.get(cauHoi[6]);
            jTextArea27.setText(goiY);
        }
    }//GEN-LAST:event_jList29MouseClicked

    private void jList27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList27MouseClicked
        if(evt.getClickCount() == 2) {
            String name=(String)jList27.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String goiY = (String)htbngoaitl.get(cauHoi[6]);
            jTextArea25.setText(goiY);
        }
    }//GEN-LAST:event_jList27MouseClicked

    private void jList28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList28MouseClicked
        if(evt.getClickCount() == 2) {
            moNgoaiChuong1TN.removeAllElements();
            String name=(String)jList28.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String dapAn = (String)htbngoaitn.get(cauHoi[6]);
            String dapAnTN[] = dapAn.split("#");
            for(int n = 0; n < dapAnTN.length; n = n + 2) {
                String da = dapAnTN[n];
                String giaTri = dapAnTN[n+1];
                if(giaTri.equals("1")) da = String.format("<html><b><font color=\"red\">" + da + "</font></b></html>", da); 
                moNgoaiChuong1TN.addElement(da);
            }
            jList39.setModel(moNgoaiChuong1TN);
        }
    }//GEN-LAST:event_jList28MouseClicked

    private void jList26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList26MouseClicked
        if(evt.getClickCount() == 2) {
            moNgoaiChuong2TN.removeAllElements();
            String name=(String)jList26.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String dapAn = (String)htbngoaitn.get(cauHoi[6]);
            String dapAnTN[] = dapAn.split("#");
            for(int n = 0; n < dapAnTN.length; n = n + 2) {
                String da = dapAnTN[n];
                String giaTri = dapAnTN[n+1];
                if(giaTri.equals("1")) da = String.format("<html><b><font color=\"red\">" + da + "</font></b></html>", da); 
                moNgoaiChuong2TN.addElement(da);
            }
            jList40.setModel(moNgoaiChuong2TN);
        }
    }//GEN-LAST:event_jList26MouseClicked

    private void jList7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList7MouseClicked
        if(evt.getClickCount() == 2) {
            String name=(String)jList7.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String goiY = (String)htbsutl.get(cauHoi[6]);
            jTextArea7.setText(goiY);
        }
    }//GEN-LAST:event_jList7MouseClicked

    private void jList13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList13MouseClicked
        if(evt.getClickCount() == 2) {
            String name=(String)jList13.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String goiY = (String)htbsutl.get(cauHoi[6]);
            jTextArea13.setText(goiY);
        }
    }//GEN-LAST:event_jList13MouseClicked

    private void jList10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList10MouseClicked
        if(evt.getClickCount() == 2) {
            String name=(String)jList10.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String goiY = (String)htbsutl.get(cauHoi[6]);
            jTextArea10.setText(goiY);
        }
    }//GEN-LAST:event_jList10MouseClicked

    private void jList11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList11MouseClicked
        if(evt.getClickCount() == 2) {
            String name=(String)jList11.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String goiY = (String)htbsutl.get(cauHoi[6]);
            jTextArea11.setText(goiY);
        }
    }//GEN-LAST:event_jList11MouseClicked

    private void jList12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList12MouseClicked
        if(evt.getClickCount() == 2) {
            String name=(String)jList12.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String goiY = (String)htbsutl.get(cauHoi[6]);
            jTextArea12.setText(goiY);
        }
    }//GEN-LAST:event_jList12MouseClicked

    private void jList8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList8MouseClicked
        if(evt.getClickCount() == 2) {
            moSuChuong1TN.removeAllElements();
            String name=(String)jList8.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String dapAn = (String)htbsutn.get(cauHoi[6]);
            String dapAnTN[] = dapAn.split("#");
            for(int n = 0; n < dapAnTN.length; n = n + 2) {
                String da = dapAnTN[n];
                String giaTri = dapAnTN[n+1];
                if(giaTri.equals("1")) da = String.format("<html><b><font color=\"red\">" + da + "</font></b></html>", da); 
                moSuChuong1TN.addElement(da);
            }
            jList59.setModel(moSuChuong1TN);
        }
    }//GEN-LAST:event_jList8MouseClicked

    private void jList9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList9MouseClicked
        if(evt.getClickCount() == 2) {
            moSuChuong2TN.removeAllElements();
            String name=(String)jList9.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String dapAn = (String)htbsutn.get(cauHoi[6]);
            String dapAnTN[] = dapAn.split("#");
            for(int n = 0; n < dapAnTN.length; n = n + 2) {
                String da = dapAnTN[n];
                String giaTri = dapAnTN[n+1];
                if(giaTri.equals("1")) da = String.format("<html><b><font color=\"red\">" + da + "</font></b></html>", da); 
                moSuChuong2TN.addElement(da);
            }
            jList60.setModel(moSuChuong2TN);
        }
    }//GEN-LAST:event_jList9MouseClicked

    private void jList14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList14MouseClicked
        if(evt.getClickCount() == 2) {
            moSuChuong3TN.removeAllElements();
            String name=(String)jList14.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String dapAn = (String)htbsutn.get(cauHoi[6]);
            String dapAnTN[] = dapAn.split("#");
            for(int n = 0; n < dapAnTN.length; n = n + 2) {
                String da = dapAnTN[n];
                String giaTri = dapAnTN[n+1];
                if(giaTri.equals("1")) da = String.format("<html><b><font color=\"red\">" + da + "</font></b></html>", da); 
                moSuChuong3TN.addElement(da);
            }
            jList61.setModel(moSuChuong3TN);
        }
    }//GEN-LAST:event_jList14MouseClicked

    private void jList15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList15MouseClicked
        if(evt.getClickCount() == 2) {
            moSuChuong4TN.removeAllElements();
            String name=(String)jList15.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String dapAn = (String)htbsutn.get(cauHoi[6]);
            String dapAnTN[] = dapAn.split("#");
            for(int n = 0; n < dapAnTN.length; n = n + 2) {
                String da = dapAnTN[n];
                String giaTri = dapAnTN[n+1];
                if(giaTri.equals("1")) da = String.format("<html><b><font color=\"red\">" + da + "</font></b></html>", da); 
                moSuChuong4TN.addElement(da);
            }
            jList62.setModel(moSuChuong4TN);
        }
    }//GEN-LAST:event_jList15MouseClicked

    private void jList16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList16MouseClicked
        if(evt.getClickCount() == 2) {
            moSuChuong5TN.removeAllElements();
            String name=(String)jList16.getSelectedValue();
            String cauHoi[] = name.split("[><]");
            String dapAn = (String)htbsutn.get(cauHoi[6]);
            String dapAnTN[] = dapAn.split("#");
            for(int n = 0; n < dapAnTN.length; n = n + 2) {
                String da = dapAnTN[n];
                String giaTri = dapAnTN[n+1];
                if(giaTri.equals("1")) da = String.format("<html><b><font color=\"red\">" + da + "</font></b></html>", da); 
                moSuChuong5TN.addElement(da);
            }
            jList63.setModel(moSuChuong5TN);
        }
    }//GEN-LAST:event_jList16MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        motoantlchuong1.removeAllElements();
        mosutlchuong1.removeAllElements();
        mohoatlchuong1.removeAllElements();
        movantlchuong1.removeAllElements();
        molytlchuong1.removeAllElements();
        modiatlchuong1.removeAllElements();
        mongoaitlchuong1.removeAllElements();
        motoantnchuong1.removeAllElements();
        mosutnchuong1.removeAllElements();
        mohoatnchuong1.removeAllElements();
        movantnchuong1.removeAllElements();
        molytnchuong1.removeAllElements();
        modiatnchuong1.removeAllElements();
        mongoaitnchuong1.removeAllElements();
        
        motoantlchuong2.removeAllElements();
        mosutlchuong2.removeAllElements();
        mohoatlchuong2.removeAllElements();
        movantlchuong2.removeAllElements();
        molytlchuong2.removeAllElements();
        modiatlchuong2.removeAllElements();
        mongoaitlchuong2.removeAllElements();
        motoantnchuong2.removeAllElements();
        mosutnchuong2.removeAllElements();
        mohoatnchuong2.removeAllElements();
        movantnchuong2.removeAllElements();
        molytnchuong2.removeAllElements();
        modiatnchuong2.removeAllElements();
        mongoaitnchuong2.removeAllElements();
        
        motoantlchuong3.removeAllElements();
        mosutlchuong3.removeAllElements();
        molytlchuong3.removeAllElements();
        modiatlchuong3.removeAllElements();
        motoantnchuong3.removeAllElements();
        mosutnchuong3.removeAllElements();
        molytnchuong3.removeAllElements();
        modiatnchuong3.removeAllElements();
                            
        mosutlchuong4.removeAllElements();
        molytlchuong4.removeAllElements();
        mosutnchuong4.removeAllElements();
        molytnchuong4.removeAllElements();
                            
        mosutlchuong5.removeAllElements();
        mosutnchuong5.removeAllElements();
        
        
        
        String s = null,k = "1",path = null;  
        String url = System.getProperty("user.dir", null);
        BufferedReader in = null;
        int flag=1;  // đánh dấu đang đọc đến file nào
        try {
            
            for(int i=1;i<=14;i++) {
                //url+"\\BTLOOP\\toantl.txt"
                //if(flag == 1) path = "E:\\BTLOOP\\toantl.txt";
                //if(flag == 2) path = "E:\\BTLOOP\\sutl.txt";
                //if(flag == 3) path = "E:\\BTLOOP\\hoatl.txt";
                //if(flag == 4) path = "E:\\BTLOOP\\vantl.txt";
                //if(flag == 5) path = "E:\\BTLOOP\\lytl.txt";
                //if(flag == 6) path = "E:\\BTLOOP\\diatl.txt";
                //if(flag == 7) path = "E:\\BTLOOP\\ngoaitl.txt";
                //if(flag == 8) path = "E:\\BTLOOP\\toantn.txt";
                //if(flag == 9) path = "E:\\BTLOOP\\sutn.txt";
                //if(flag == 10) path = "E:\\BTLOOP\\hoatn.txt";
                //if(flag == 11) path = "E:\\BTLOOP\\vantn.txt";
                //if(flag == 12) path = "E:\\BTLOOP\\lytn.txt";
                //if(flag == 13) path = "E:\\BTLOOP\\diatn.txt";
                //if(flag == 14) path = "E:\\BTLOOP\\ngoaitn.txt";
                
                if(flag == 1) path = url+"\\BTLOOP\\toantl.txt";
                if(flag == 2) path = url+"\\BTLOOP\\sutl.txt";
                if(flag == 3) path = url+"\\BTLOOP\\hoatl.txt";
                if(flag == 4) path = url+"\\BTLOOP\\vantl.txt";
                if(flag == 5) path = url+"\\BTLOOP\\lytl.txt";
                if(flag == 6) path = url+"\\BTLOOP\\diatl.txt";
                if(flag == 7) path = url+"\\BTLOOP\\ngoaitl.txt";
                if(flag == 8) path = url+"\\BTLOOP\\toantn.txt";
                if(flag == 9) path = url+"\\BTLOOP\\sutn.txt";
                if(flag == 10) path = url+"\\BTLOOP\\hoatn.txt";
                if(flag == 11) path = url+"\\BTLOOP\\vantn.txt";
                if(flag == 12) path = url+"\\BTLOOP\\lytn.txt";
                if(flag == 13) path = url+"\\BTLOOP\\diatn.txt";
                if(flag == 14) path = url+"\\BTLOOP\\ngoaitn.txt";

                do {
                    in = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF8"));
                    s = in.readLine();
                    do {
                        String str[] = s.split("&");
                        String strr[];
                        if(flag == 1) htbtoantl.put(str[0], str[3]);
                        if(flag == 2) htbsutl.put(str[0], str[3]);
                        if(flag == 3) htbhoatl.put(str[0], str[3]);
                        if(flag == 4) htbvantl.put(str[0], str[3]);
                        if(flag == 5) htblytl.put(str[0], str[3]);
                        if(flag == 6) htbdiatl.put(str[0], str[3]);
                        if(flag == 7) htbngoaitl.put(str[0], str[3]);
                        if(flag == 8) htbtoantn.put(str[0], str[3]);
                        if(flag == 9) htbsutn.put(str[0], str[3]);
                        if(flag == 10) htbhoatn.put(str[0], str[3]);
                        if(flag == 11) htbvantn.put(str[0], str[3]);
                        if(flag == 12) htblytn.put(str[0], str[3]);
                        if(flag == 13) htbdiatn.put(str[0], str[3]);
                        if(flag == 14) htbngoaitn.put(str[0], str[3]);
                        
                        if(str[2].equals(k)) {
                            if("1".equals(k)) str[0]=String.format("<html><b><font color=\"blue\">" + str[0]+ "</font></b></html>", str[0]);
                            if("2".equals(k)) str[0]=String.format("<html><b><font color=\"green\">" + str[0]+ "</font></b></html>", str[0]);
                            if("3".equals(k)) str[0]=String.format("<html><b><font color=\"red\">" + str[0]+ "</font></b></html>", str[0]);
                            
                            strr = str[1].split("#");
                            
                            for(String strrr:strr) {
                            if("1".equals(strrr)) {
                                if(flag == 1) motoantlchuong1.addElement(str[0]);
                                if(flag == 2) mosutlchuong1.addElement(str[0]);
                                if(flag == 3) mohoatlchuong1.addElement(str[0]);
                                if(flag == 4) movantlchuong1.addElement(str[0]);
                                if(flag == 5) molytlchuong1.addElement(str[0]);
                                if(flag == 6) modiatlchuong1.addElement(str[0]);
                                if(flag == 7) mongoaitlchuong1.addElement(str[0]);
                                if(flag == 8) motoantnchuong1.addElement(str[0]);
                                if(flag == 9) mosutnchuong1.addElement(str[0]);
                                if(flag == 10) mohoatnchuong1.addElement(str[0]);
                                if(flag == 11) movantnchuong1.addElement(str[0]);
                                if(flag == 12) molytnchuong1.addElement(str[0]);
                                if(flag == 13) modiatnchuong1.addElement(str[0]);
                                if(flag == 14) mongoaitnchuong1.addElement(str[0]);
                            }
                            if("2".equals(strrr)) {
                                if(flag == 1) motoantlchuong2.addElement(str[0]);
                                if(flag == 2) mosutlchuong2.addElement(str[0]);
                                if(flag == 3) mohoatlchuong2.addElement(str[0]);
                                if(flag == 4) movantlchuong2.addElement(str[0]);
                                if(flag == 5) molytlchuong2.addElement(str[0]);
                                if(flag == 6) modiatlchuong2.addElement(str[0]);
                                if(flag == 7) mongoaitlchuong2.addElement(str[0]);
                                if(flag == 8) motoantnchuong2.addElement(str[0]);
                                if(flag == 9) mosutnchuong2.addElement(str[0]);
                                if(flag == 10) mohoatnchuong2.addElement(str[0]);
                                if(flag == 11) movantnchuong2.addElement(str[0]);
                                if(flag == 12) molytnchuong2.addElement(str[0]);
                                if(flag == 13) modiatnchuong2.addElement(str[0]);
                                if(flag == 14) mongoaitnchuong2.addElement(str[0]);
                            }
                            if("3".equals(strrr)) {
                                if(flag == 1) motoantlchuong3.addElement(str[0]);
                                if(flag == 2) mosutlchuong3.addElement(str[0]);
                                if(flag == 5) molytlchuong3.addElement(str[0]);
                                if(flag == 6) modiatlchuong3.addElement(str[0]);
                                if(flag == 8) motoantnchuong3.addElement(str[0]);
                                if(flag == 9) mosutnchuong3.addElement(str[0]);
                                if(flag == 12) molytnchuong3.addElement(str[0]);
                                if(flag == 13) modiatnchuong3.addElement(str[0]);
                            }
                            if("4".equals(strrr)) {
                                if(flag == 2) mosutlchuong4.addElement(str[0]);
                                if(flag == 5) molytlchuong4.addElement(str[0]);
                                if(flag == 9) mosutnchuong4.addElement(str[0]);
                                if(flag == 12) molytnchuong4.addElement(str[0]);
                            }
                            if("5".equals(strrr)) {
                                if(flag == 2) mosutlchuong5.addElement(str[0]);
                                if(flag == 9) mosutnchuong5.addElement(str[0]);
                            } 
                            }
                        }
                        s = in.readLine();
                    } while(s != null);
                    if(k == "3") k = "4";
                    if(k == "2") k = "3";
                    if(k == "1") k = "2";
                } while(k.equals("2") || k.equals("3"));
                k = "1";
                if(flag == 1) {
                    jList1.setModel(motoantlchuong1);
                    jList3.setModel(motoantlchuong2);
                    jList4.setModel(motoantlchuong3);
                    jList2.setModel(motoantnchuong1);
                    jList6.setModel(motoantnchuong2);
                    jList5.setModel(motoantnchuong3);
                }
                if(flag == 2) {
                    jList7.setModel(mosutlchuong1);
                    jList13.setModel(mosutlchuong2);
                    jList10.setModel(mosutlchuong3);
                    jList11.setModel(mosutlchuong4);
                    jList12.setModel(mosutlchuong5);
                    jList8.setModel(mosutnchuong1);
                    jList9.setModel(mosutnchuong2);
                    jList14.setModel(mosutnchuong3);
                    jList15.setModel(mosutnchuong4);
                    jList16.setModel(mosutnchuong5);
                }
                if(flag == 3) {
                    jList19.setModel(mohoatlchuong1);
                    jList21.setModel(mohoatlchuong2);
                    jList18.setModel(mohoatnchuong1);
                    jList20.setModel(mohoatnchuong2);
                }
                if(flag == 4) {
                    jList23.setModel(movantlchuong1);
                    jList24.setModel(movantlchuong2);
                    jList22.setModel(movantnchuong1);
                    jList25.setModel(movantnchuong2);
                }
                if(flag == 5) {
                    jList49.setModel(molytlchuong1);
                    jList50.setModel(molytlchuong2);
                    jList53.setModel(molytlchuong3);
                    jList58.setModel(molytlchuong4);
                    jList47.setModel(molytnchuong1);
                    jList51.setModel(molytnchuong2);
                    jList54.setModel(molytnchuong3);
                    jList56.setModel(molytnchuong4);
                }
                if(flag == 6) {
                    jList30.setModel(modiatlchuong1);
                    jList33.setModel(modiatlchuong2);
                    jList36.setModel(modiatlchuong3);
                    jList31.setModel(modiatnchuong1);
                    jList34.setModel(modiatnchuong2);
                    jList37.setModel(modiatnchuong3);
                }
                if(flag == 7) {
                    jList29.setModel(mongoaitlchuong1);
                    jList27.setModel(mongoaitlchuong2);
                    jList28.setModel(mongoaitnchuong1);
                    jList26.setModel(mongoaitnchuong2);
                }
                flag++;
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new ThemCauHoi().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new ChonTayChonMon().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new main().setVisible(true);
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
    private javax.swing.JList jList1;
    private javax.swing.JList jList10;
    private javax.swing.JList jList11;
    private javax.swing.JList jList12;
    private javax.swing.JList jList13;
    private javax.swing.JList jList14;
    private javax.swing.JList jList15;
    private javax.swing.JList jList16;
    private javax.swing.JList jList17;
    private javax.swing.JList jList18;
    private javax.swing.JList jList19;
    private javax.swing.JList jList2;
    private javax.swing.JList jList20;
    private javax.swing.JList jList21;
    private javax.swing.JList jList22;
    private javax.swing.JList jList23;
    private javax.swing.JList jList24;
    private javax.swing.JList jList25;
    private javax.swing.JList jList26;
    private javax.swing.JList jList27;
    private javax.swing.JList jList28;
    private javax.swing.JList jList29;
    private javax.swing.JList jList3;
    private javax.swing.JList jList30;
    private javax.swing.JList jList31;
    private javax.swing.JList jList32;
    private javax.swing.JList jList33;
    private javax.swing.JList jList34;
    private javax.swing.JList jList35;
    private javax.swing.JList jList36;
    private javax.swing.JList jList37;
    private javax.swing.JList jList38;
    private javax.swing.JList jList39;
    private javax.swing.JList jList4;
    private javax.swing.JList jList40;
    private javax.swing.JList jList41;
    private javax.swing.JList jList42;
    private javax.swing.JList jList43;
    private javax.swing.JList jList44;
    private javax.swing.JList jList45;
    private javax.swing.JList jList46;
    private javax.swing.JList jList47;
    private javax.swing.JList jList48;
    private javax.swing.JList jList49;
    private javax.swing.JList jList5;
    private javax.swing.JList jList50;
    private javax.swing.JList jList51;
    private javax.swing.JList jList52;
    private javax.swing.JList jList53;
    private javax.swing.JList jList54;
    private javax.swing.JList jList55;
    private javax.swing.JList jList56;
    private javax.swing.JList jList57;
    private javax.swing.JList jList58;
    private javax.swing.JList jList59;
    private javax.swing.JList jList6;
    private javax.swing.JList jList60;
    private javax.swing.JList jList61;
    private javax.swing.JList jList62;
    private javax.swing.JList jList63;
    private javax.swing.JList jList7;
    private javax.swing.JList jList8;
    private javax.swing.JList jList9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane44;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane46;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane49;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane50;
    private javax.swing.JScrollPane jScrollPane51;
    private javax.swing.JScrollPane jScrollPane52;
    private javax.swing.JScrollPane jScrollPane53;
    private javax.swing.JScrollPane jScrollPane54;
    private javax.swing.JScrollPane jScrollPane55;
    private javax.swing.JScrollPane jScrollPane56;
    private javax.swing.JScrollPane jScrollPane57;
    private javax.swing.JScrollPane jScrollPane58;
    private javax.swing.JScrollPane jScrollPane59;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane60;
    private javax.swing.JScrollPane jScrollPane61;
    private javax.swing.JScrollPane jScrollPane62;
    private javax.swing.JScrollPane jScrollPane63;
    private javax.swing.JScrollPane jScrollPane64;
    private javax.swing.JScrollPane jScrollPane65;
    private javax.swing.JScrollPane jScrollPane66;
    private javax.swing.JScrollPane jScrollPane67;
    private javax.swing.JScrollPane jScrollPane68;
    private javax.swing.JScrollPane jScrollPane69;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane70;
    private javax.swing.JScrollPane jScrollPane71;
    private javax.swing.JScrollPane jScrollPane72;
    private javax.swing.JScrollPane jScrollPane73;
    private javax.swing.JScrollPane jScrollPane74;
    private javax.swing.JScrollPane jScrollPane75;
    private javax.swing.JScrollPane jScrollPane76;
    private javax.swing.JScrollPane jScrollPane77;
    private javax.swing.JScrollPane jScrollPane78;
    private javax.swing.JScrollPane jScrollPane79;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane80;
    private javax.swing.JScrollPane jScrollPane81;
    private javax.swing.JScrollPane jScrollPane82;
    private javax.swing.JScrollPane jScrollPane83;
    private javax.swing.JScrollPane jScrollPane84;
    private javax.swing.JScrollPane jScrollPane85;
    private javax.swing.JScrollPane jScrollPane86;
    private javax.swing.JScrollPane jScrollPane87;
    private javax.swing.JScrollPane jScrollPane88;
    private javax.swing.JScrollPane jScrollPane89;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JScrollPane jScrollPane90;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane10;
    private javax.swing.JTabbedPane jTabbedPane11;
    private javax.swing.JTabbedPane jTabbedPane12;
    private javax.swing.JTabbedPane jTabbedPane13;
    private javax.swing.JTabbedPane jTabbedPane14;
    private javax.swing.JTabbedPane jTabbedPane15;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane24;
    private javax.swing.JTabbedPane jTabbedPane25;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane30;
    private javax.swing.JTabbedPane jTabbedPane31;
    private javax.swing.JTabbedPane jTabbedPane36;
    private javax.swing.JTabbedPane jTabbedPane37;
    private javax.swing.JTabbedPane jTabbedPane38;
    private javax.swing.JTabbedPane jTabbedPane39;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane40;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane51;
    private javax.swing.JTabbedPane jTabbedPane52;
    private javax.swing.JTabbedPane jTabbedPane53;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane60;
    private javax.swing.JTabbedPane jTabbedPane61;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTabbedPane jTabbedPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea17;
    private javax.swing.JTextArea jTextArea19;
    private javax.swing.JTextArea jTextArea21;
    private javax.swing.JTextArea jTextArea22;
    private javax.swing.JTextArea jTextArea24;
    private javax.swing.JTextArea jTextArea25;
    private javax.swing.JTextArea jTextArea26;
    private javax.swing.JTextArea jTextArea27;
    private javax.swing.JTextArea jTextArea28;
    private javax.swing.JTextArea jTextArea29;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea30;
    private javax.swing.JTextArea jTextArea31;
    private javax.swing.JTextArea jTextArea32;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea7;
    // End of variables declaration//GEN-END:variables
}

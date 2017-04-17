
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TranMinhHai
 */
public class TracNghiem extends CauHoi{
    private DapAn[] dapAn = new DapAn[20];
    private int i = 0;     // số đáp án

    public TracNghiem(String s1,String s2,String[] s3,String s4,DapAn[] DA) {
        super(s1,s2,s3,s4);
        for(DapAn da:DA) {
            if(da == null) break;
            dapAn[i] = da;
            i++;
        }
    }
    
    @Override
    public void ghiDuLieu() {
        FileInputStream fileInPutStream = null;
        try {
            String url = System.getProperty("user.dir", null);
            String pathFile = null,line = null;
            String[] strLine;
            int flag = 0;
            switch(tenMonHoc) {
                case "toan":
                    pathFile = url+"\\BTLOOP\\toantn.txt";
                    break;
                case "ly":
                    pathFile = url+"\\BTLOOP\\lytn.txt";
                    break;
                case "hoa":
                    pathFile = url+"\\BTLOOP\\hoatn.txt";
                    break;
                case "van":
                    pathFile = url+"\\BTLOOP\\vantn.txt";
                    break;
                case "dia":
                    pathFile = url+"\\BTLOOP\\diatn.txt";
                    break;
                case "ngoai":
                    pathFile = url+"\\BTLOOP\\ngoaitn.txt";
                    break;
                case "su":
                    pathFile = url+"\\BTLOOP\\sutn.txt";
                    break;
                case "test":
                    pathFile = url+"\\BTLOOP\\test.txt";
                    break;
            }   
            
            fileInPutStream = new FileInputStream(pathFile);
            Reader reader = new java.io.InputStreamReader(fileInPutStream, "UTF8");
            BufferedReader buffReader = new BufferedReader(reader);
            while ((line = buffReader.readLine()) != null) {
                strLine = line.split("&");
                if(strLine[0].equals(tenCauHoi)) flag = 1;
            }
            reader.close();
            
            if(flag == 1) {
                JOptionPane.showMessageDialog(null, "Câu hỏi này đã có trong dữ liệu");
            } else {
                String mangchuong = "";
                int ii = 0;
                while(chuong[ii] != null) {
                    if(chuong[ii+1] != null) mangchuong = mangchuong + chuong[ii] + "#";
                    else mangchuong = mangchuong + chuong[ii];
                    ii++;
                }
                String string = tenCauHoi+"&"+mangchuong+"&"+doKho+"&";
                String string1 = "";
                for(int k = 0; k < i; k++) {
                    string1 = string1 + "#" + dapAn[k].xuatDapAn() + "#" + Integer.toString(dapAn[k].xuatGiaTri());
                }
                string1 = string1.substring(1);
                string = string + string1;
                
                GhiDocFile.WriteFile(pathFile, string, false);
            }
            
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            Logger.getLogger(TuLuan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TuLuan.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileInPutStream.close();
            } catch (IOException ex) {
                Logger.getLogger(TuLuan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void daoDapAn() {
        DapAn da;
        Random rd = new Random();
        int i1 = 0,i2 = 0;
        int n = i;
        for(int k=0;k<50;k++){
            i1 = rd.nextInt(n);
            i2 = rd.nextInt(n);
            da = dapAn[i1];
            dapAn[i1] = dapAn[i2];
            dapAn[i2] = da;
        }
    }
    
    // ví dụ câu trắc nghiệm có 3 phương án "đáp án 1","đáp án 2","đáp án 3" thì phương thức getDapAn() trả về một string
    // là 1. đáp án 1\r\n2. đáp án 2\r\n3. đáp án 3
    public String xuatDapAn() {
        String string = "";
        int n = 0;
        for(n=0;n<i;n++) {
            if(n==i-1) string = string+Integer.toString(n+1)+". "+dapAn[n].xuatDapAn();
            else string = string+Integer.toString(n+1)+". "+dapAn[n].xuatDapAn()+"\r\n";
        }
        return string;
    }
    
    // phương thức getDapAnDung() giống phương thức getDapAn()
    public String xuatDapAnDung() {
        String dapAnDung = "";
        int n = 0, flag = 0;
        for(n=0;n<i;n++) {
            if(dapAn[n].xuatGiaTri() == 1) {
                if(flag == 0) {dapAnDung = dapAnDung + Integer.toString(n+1)+". "+dapAn[n].xuatDapAn();flag=1;}
                else dapAnDung = dapAnDung + "\r\n" + Integer.toString(n+1)+". "+dapAn[n].xuatDapAn();
            }
        }
        return dapAnDung;
    }
    
    public static void main(String[] args) {
        DapAn[] da = new DapAn[20];
        da[0] = new DapAn("hihi",1);
        da[1] = new DapAn("haha",1);
        da[2] = new DapAn("hoho",0);
        TracNghiem tn = new TracNghiem("test", "caau kieemr tra laij tesst", new String[]{"1","2"}, "1", da);
        System.out.println(tn.xuatDapAnDung());
    }
}


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
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
public class TuLuan extends CauHoi{
    private String goiY = "";
    
    public TuLuan(String s1,String s2,String[] s3,String s4,String goiy) {
        super(s1,s2,s3,s4);
        goiY = goiy;
    }

    @Override
    public void ghiDuLieu() {
        String url = System.getProperty("user.dir", null);
        FileInputStream fileInPutStream = null;
        try {
            String pathFile = null,line = null;
            String[] strLine;
            int flag = 0;
            switch(tenMonHoc) {
                case "toan":
                    pathFile = url+"\\BTLOOP\\toantl.txt";
                    break;
                case "ly":
                    pathFile = url+"\\BTLOOP\\lytl.txt";
                    break;
                case "hoa":
                    pathFile = url+"\\BTLOOP\\hoatl.txt";
                    break;
                case "van":
                    pathFile = url+"\\BTLOOP\\vantl.txt";
                    break;
                case "dia":
                    pathFile = url+"\\BTLOOP\\diatl.txt";
                    break;
                case "ngoai":
                    pathFile = url+"\\BTLOOP\\ngoaitl.txt";
                    break;
                case "su":
                    pathFile = url+"\\BTLOOP\\sutl.txt";
                    break;
                case "test":
                    pathFile = url+"\\BTLOOP\\test.txt";
                    break;
            }   
            // kiểm tra xem có trùng câu hỏi không ?
            fileInPutStream = new FileInputStream(pathFile);
            Reader reader = new java.io.InputStreamReader(fileInPutStream, "UTF8");
            BufferedReader buffReader = new BufferedReader(reader);
            while ((line = buffReader.readLine()) != null) {
                strLine = line.split("&");
                if(strLine[0].equals(tenCauHoi)) flag = 1;
            }
            reader.close();
            //
            if(flag == 1) {
                JOptionPane.showMessageDialog(null, "Câu hỏi này đã có trong dữ liệu");
            } else {
                String mangchuong = "";
                int i = 0;
                while(chuong[i] != null) {
                    if(chuong[i+1] != null) mangchuong = mangchuong + chuong[i] + "#";
                    else mangchuong = mangchuong + chuong[i];
                    i++;
                }
                String string = tenCauHoi+"&"+mangchuong+"&"+doKho+"&"+goiY;
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
    
    public String xuatGoiY() {
        return goiY;
    }
}

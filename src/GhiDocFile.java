
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TranMinhHai
 */
public class GhiDocFile {
    public static String ReadFile(String pathFile) {
        try {
            FileInputStream fileInPutStream = new FileInputStream(pathFile);
            Reader reader = new java.io.InputStreamReader(fileInPutStream, "UTF8");
            BufferedReader buffReader = new BufferedReader(reader);
            StringBuilder stringBuilder = new StringBuilder();
            String line = null;
            while ((line = buffReader.readLine()) != null) {
                stringBuilder.append(line + "\r\n");
            }
            reader.close();
            
            return stringBuilder.toString();
        } catch(IOException io) {
            System.out.println("Không tìm thấy file " + pathFile);
        }
        return "";
    }
    public static boolean WriteFile(String pathFile, String text, boolean overwrite) {
        try {
            String oldText = "";
            char cbuf[];
            String string;
            if(!overwrite) {
                oldText = ReadFile(pathFile);
            }
            FileOutputStream fileOutStream = new FileOutputStream(pathFile);
            Writer writer = new OutputStreamWriter(fileOutStream,"UTF8");
            
            writer.write(oldText + text);
            writer.close();
            return true;
        }
        catch(IOException io) {
            System.out.println("Không ghi được file" + pathFile);
        }
        return false;
    }
    public static void main(String[] args) {
        //System.out.println(ReadFile("E:\\BTLOOP\\dethi\\dethi01.txt"));
        //WriteFile("E:\\BTLOOP\\dethi\\dethi01.txt", "abc\r\nabc", true);
    }
    public static int kiemTraChuaStr(String s1,String s2) {
        String s = s1.replace(s2, "zxcvasdf");
        if(s.equals(s1)) return 0;
        return 1;
    }
}

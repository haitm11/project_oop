
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TranMinhHai
 */
public abstract class CauHoi implements Serializable{
    String tenMonHoc;
    String tenCauHoi;
    String chuong[] = new String[6];
    String doKho;
    
    public CauHoi(String s1,String s2,String[] s3,String s4) {
        tenMonHoc = s1;
        tenCauHoi = s2;
        int i=0;
        for(String str:s3) {
            if(str == null) break;
            chuong[i] = str;
            i++;
        }
        doKho = s4;
    }
    
    public abstract void ghiDuLieu();
    
    public final String xuatTenMonHoc() {
        return tenMonHoc;
    }
    
    public final String xuatCauHoi() {
        return tenCauHoi;
    }
    
    public final String xuatDoKho() {
        return doKho;
    }
    
    // nếu chương là 1 2 3 thì hàm này trả về string là "1#2#3"
    public final String xuatChuong() {
        String str="";
        for(String s:chuong) {
            if(s==null) break;
            str = str + "#" + s;
        }
        str = str.substring(1);
        return str;
    }
}

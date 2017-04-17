
import java.util.Random;
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
public class DeThi {
    private TracNghiem[] tn = new TracNghiem[100];
    private TuLuan[] tl = new TuLuan[20];
    private int itl = 0;
    private int itn = 0;
    
    public DeThi() {}
    
    public DeThi(TracNghiem[] TN,TuLuan[] TL) {   // Nếu TN, TL quá lớn hơn so vs 100 và 20 thì ta lấy 100 và 20 phần tử đầu
        for(TracNghiem tracNghiem:TN) {
            if(tracNghiem == null) break;
            tn[itn] = tracNghiem;
            itn++;
            if(itn == 100) break;
        }
        for(TuLuan tuLuan:TL) {
            if(tuLuan == null) break;
            tl[itl] = tuLuan;
            itl++;
            if(itl == 20) break;
        }
    }
    
    public void themCauHoi(TuLuan tll) { // không bắt lỗi câu hỏi giống nhau
        if(itl >= 20) {
            JOptionPane.showMessageDialog(null, "không đủ bộ nhớ");
        } else {
            tl[itl] = tll;
            itl++;
        }
    }
    
    public void themCauHoi(TracNghiem tnn) { // không bắt lỗi câu hỏi giống nhau
        if(itn >= 100) {
            JOptionPane.showMessageDialog(null, "không đủ bộ nhớ");
        } else {
            tn[itn] = tnn;
            itn++;
        }
    }
    
    public void daoCauHoi() {
        TuLuan tuluan;
        TracNghiem tracnghiem;
        Random rd = new Random();
        int i1 = 0,i2 = 0;
        if(itl > 0) {
            for(int k=0;k<50;k++){
                i1 = rd.nextInt(itl);
                i2 = rd.nextInt(itl);
                tuluan = tl[i1];
                tl[i1] = tl[i2];
                tl[i2] = tuluan;
            }
        }
        if(itn > 0) {
            for(int k=0;k<50;k++){
                i1 = rd.nextInt(itn);
                i2 = rd.nextInt(itn);
                tracnghiem = tn[i1];
                tn[i1] = tn[i2];
                tn[i2] = tracnghiem;
            }
        }
    }
    
    public void xuatDeThi(String tenDeThi) { // thêm thông tin đề thi
        int n=0;
        String url = System.getProperty("user.dir", null);          

        String pathFileDeThi = url+"\\BTLOOP\\dethi\\"+tenDeThi;
        String pathFileDapAn = url+"\\BTLOOP\\dethi\\dapan"+tenDeThi;
        if(GhiDocFile.ReadFile(pathFileDeThi).equals("")) {
            String string = "";
            String string1 = "";
            if(tl[0]!=null) string = "ĐỀ THI MÔN: "+tl[0].xuatTenMonHoc()+"\r\n\r\nTrắc Nghiệm";
            else string = "ĐỀ THI MÔN: "+tn[0].xuatTenMonHoc()+"\r\n\r\nTrắc Nghiệm";
            
            int tnde=0,tntb=0,tnkho=0,tlde=0,tltb=0,tlkho=0;
            for(TuLuan tll:tl) {
                if(tll==null) break;
                if(tll.xuatDoKho().equals("1")) tlde++;
                if(tll.xuatDoKho().equals("2")) tltb++;
                if(tll.xuatDoKho().equals("3")) tlkho++;
            }
            for(TracNghiem tnn:tn) {
                if(tnn==null) break;
                if(tnn.xuatDoKho().equals("1")) tnde++;
                if(tnn.xuatDoKho().equals("2")) tntb++;
                if(tnn.xuatDoKho().equals("3")) tnkho++;
            }
            
            
            string1 = "SỐ CÂU TRẮC NGHIỆM: "+itn+" (dễ:"+tnde+",trung bình:"+tntb+",khó:"+tnkho+")\r\nSỐ CÂU TỰ LUẬN: "+itl+" (dễ:"+tlde+",trung bình:"+tltb+",khó:"+tlkho+")\r\n\r\nTrắc Nghiệm";
            for(n=0;n<itn;n++) {
                string = string + "\r\ncâu "+Integer.toString(n+1)+": "+tn[n].xuatCauHoi()+"\r\n"+tn[n].xuatDapAn();
                string1 = string1 + "\r\ncâu "+Integer.toString(n+1)+": "+tn[n].xuatCauHoi()+"\r\n"+tn[n].xuatDapAnDung();
            }
            string = string + "\r\n\r\nTự Luận";
            for(n=0;n<itl;n++) {
                string = string + "\r\ncâu "+Integer.toString(n+1)+": "+tl[n].xuatCauHoi();
                string1 = string1 + "\r\ncâu "+Integer.toString(n+1)+": "+tl[n].xuatCauHoi()+"\r\nGợi ý: "+tl[n].xuatGoiY();
            }
            GhiDocFile.WriteFile(pathFileDeThi, string, true);
            GhiDocFile.WriteFile(pathFileDapAn, string1, true);
        }
        else {
            JOptionPane.showMessageDialog(null, "trùng tên");
        }
    }
    
    public TracNghiem[] xuatTN() {
        return tn;
    }
    
    public TuLuan[] xuatTL() {
        return tl;
    }
    
    public int xuatitl() {
        return itl;
    }
    
    public int xuatitn() {
        return itn;
    }
    
    public static void main(String[] args) {
        TracNghiem[] tn = new TracNghiem[50];
        TuLuan[] tl = new TuLuan[10];
        
        tl[0] = new TuLuan("test","cau hỏi thứ 1",new String[]{"1","2"},"2","Dùng đạo hàm");
        tl[1] = new TuLuan("test","cau hỏi thứ 3",new String[]{"1","2"},"2","Dùng đạo hàm");
        tl[2] = new TuLuan("test","cau hỏi thứ 13",new String[]{"1","2"},"2","Dùng đạo hàm");
        
        DapAn da[] = {new DapAn("5+2=7",1),new DapAn("5+2=6",0),new DapAn("5+2=10",0),new DapAn("5+0=6",0)};
        
        tn[0] = new TracNghiem("test","cau hỏi thứ 14",new String[]{"1","2"},"2",da);
        tn[1] = new TracNghiem("test","cau hỏi thứ 15",new String[]{"1","2"},"2",da);
        tn[2] = new TracNghiem("test","cau hỏi thứ 16",new String[]{"1","2"},"2",da);
        
        DeThi dt = new DeThi(tn, tl);
        dt.themCauHoi(new TuLuan("test","cau hỏi thứ 13",new String[]{"1","2"},"2","Dùng đạo hàm"));
    }
}

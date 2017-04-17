/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TranMinhHai
 */
public class DapAn {
    private String dapAn = "";
    private int giaTri = 0;
    
    public DapAn(String s, int i) {
        dapAn = s;
        giaTri = i;
    }
    
    public String xuatDapAn() {
        return dapAn;
    }
    
    public int xuatGiaTri() {
        return giaTri;
    }
}

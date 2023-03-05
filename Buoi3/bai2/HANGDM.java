/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3.bai2;

import Buoi3.bai1.*;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class HANGDM extends hanghoa{
    private int thoiGianBH ; 
    private  int dienAP ; 
    private int congSuat ; 

    public HANGDM(int thoiGianBH, int dienAP, int congSuat, String maHang, String tenhang, long dongia) {
        super(maHang, tenhang, dongia);
        this.thoiGianBH = thoiGianBH;
        this.dienAP = dienAP;
        this.congSuat = congSuat;
    }
    
    @Override
    public void nhap(){ 
        super.nhap();
        System.out.println("Nhap thoi gian bao hanh: ");
        this.thoiGianBH = sc.nextInt() ;
        System.out.println("Nhap dien ap: ");
        this.dienAP = sc.nextInt() ; 
        System.out.println("Nhap cong suat: ");
        this.congSuat = sc.nextInt() ;
    }
    
    @Override
    public void xuat()
    {
      super.xuat(); 
        System.out.println("Thoi gian bao hanh: "+ this.thoiGianBH);
        System.out.println("Dien ap: "+ this.dienAP);
        System.out.println("Cong suat: "+ this.congSuat);
    }
    public HANGDM() {
        super(); 
        this.congSuat = 0  ; 
        this.dienAP = 0 ;  
        this.thoiGianBH = 0  ;   
    }

    public int getThoiGianBH() {
        return thoiGianBH;
    }

    public void setThoiGianBH(int thoiGianBH) {
        this.thoiGianBH = thoiGianBH;
    }

    public int getDienAP() {
        return dienAP;
    }

    public void setDienAP(int dienAP) {
        this.dienAP = dienAP;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

   
    
    
    
}

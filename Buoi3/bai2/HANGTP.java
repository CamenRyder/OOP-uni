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
public class HANGTP extends hanghoa{
       private String ngaySx  ;  
       private String ngayHh ; 

    public HANGTP() {
        super() ;  
        this.ngayHh = "" ; 
        this.ngaySx = "" ; 
    }
       
    public HANGTP(String ngaySx, String ngayHh) {
        this.ngaySx = ngaySx;
        this.ngayHh = ngayHh;
    }

    public HANGTP(String ngaySx, String ngayHh, String maHang, String tenhang, long dongia) {
        super(maHang, tenhang, dongia);
        this.ngaySx = ngaySx;
        this.ngayHh = ngayHh;
    }

    public String getNgaySx() {
        return ngaySx;
    }

    public void setNgaySx(String ngaySx) {
        this.ngaySx = ngaySx;
    }

    public String getNgayHh() {
        return ngayHh;
    }

    public void setNgayHh(String ngayHh) {
        this.ngayHh = ngayHh;
    }

    
     @Override
    public void nhap(){ 
        super.nhap();
        sc.nextLine() ;  
        System.out.println("Nhap ngay het han: ");
        this.ngayHh = sc.nextLine();
        System.out.println("Nhap ngay san xuat: ");
        this.ngaySx = sc.nextLine(); 
      
    }
    
    @Override
    public void xuat()
    {
      super.xuat(); 
        System.out.println("Ngay het han : "+ this.ngayHh);
        System.out.println("Ngay san xuat: "+ this.ngaySx);
    }
    
}

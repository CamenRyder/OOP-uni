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
public class hanghoa {
       private  String maHang ; 
       private  String tenhang ;  
       private  long dongia ;  

    public hanghoa() {
        this.maHang = "";
        this.tenhang = "";
        this.dongia =  0;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public long getDongia() {
        return dongia;
    }

    public void setDongia(long dongia) {
        this.dongia = dongia;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public hanghoa(String maHang, String tenhang, long dongia) {
        this.maHang = maHang;
        this.tenhang = tenhang;
        this.dongia = dongia;
    }
     Scanner sc = new Scanner(System.in) ;  
    public void nhap()
    {
        System.out.println("Nhap ma mat hang: ");
        this.maHang = sc.nextLine() ; 
        System.out.println("Nhap ten mat hang: ");
        this.tenhang = sc.nextLine() ;  
        System.out.println("Nhap don gia cua mat hang "+ this.tenhang);
        this.dongia =sc.nextLong() ;   
    }
    public void xuat()
    {
        System.out.println("Mat hang: " + this.tenhang );
        System.out.println("Ma hang: "+ this.maHang);
        System.out.println("Don gia: "+ this.dongia);
    }
    
}

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
public class demo {
    public static void main(String[] args) {
        byte chon,loai ;  
        Scanner doc = new Scanner(System.in) ;  
        DSHANGHOA dshh = new DSHANGHOA() ; 
        hanghoa h  ;  
        do{
            System.out.println("1. Them mot mat hang vao danh sach: ");
            System.out.println("2. Xuat mat hang theo loai: ");
            System.out.println("0. Thoat.");
            System.out.println("Chon chuc nang: ");
            chon = doc.nextByte() ;
            switch(chon)
            {
                case 1:
                    System.out.println("1: Hang dien may.");
                    System.out.println("2. Hang thuc pham.");
                    System.out.println("Hay chon 1 mat hang: ");
                    loai = doc.nextByte();
                    if(loai == 1) h =  new HANGDM() ; 
                    else  h =  new  HANGTP() ; 
                    h.nhap(); 
                    dshh.themMH(h) ; 
                    break ;  
            
                case 2:
                    System.out.println("Xuat danh sach mat hang nao (DM/TP(0/1)): ");
                    byte loaimh = doc.nextByte() ; 
                    dshh.xuatDSTheoLoai(loaimh) ;
                    break ;  
                default: chon = 0 ;
                break;       
            }
        }while(chon != 0);
         
        
        
        
    }
}

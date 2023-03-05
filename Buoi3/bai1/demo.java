/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3.bai1;

/**
 *
 * @author PC
 */
public class demo {
    public static void main(String[] args) {
            // tao hang hoa
        hanghoa a = new hanghoa() ;
        a.nhap(); 
        a.xuat(); 
        
            // HANGDM
         System.out.println("Nhap hang dien may: ");
            HANGDM ab =  new HANGDM() ; 
         ab.nhap(); 
         ab.xuat();
         
         System.out.println("Nhap hang thuc pham: ");
         HANGTP abc = new HANGTP() ;  
         abc.nhap(); 
         abc.xuat();
         
         
         
        
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3.bai2;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class DSHANGHOA {
        private final  ArrayList<hanghoa> dsHH  =  new ArrayList<hanghoa>()  ; 

        private  static int soluong  ;   

    public DSHANGHOA() {
        this.soluong =  0  ;  
    } 

    void themMH(hanghoa h) {
        
        dsHH.add(h) ; 
    }

    void xuatDSTheoLoai(byte loaimh) {
      if(loaimh == 0)
      {
          for(int i=0; i< dsHH.size();i++)
          {
             if(dsHH.get(i).getClass().equals(HANGDM.class))
             {
                 HANGDM a = (HANGDM) dsHH.get(i) ;
                 a.xuat();
             }
          }
      }else
      {
          for(int i=0; i< dsHH.size();i++)
          {
             if(dsHH.get(i).getClass().equals(HANGTP.class))
             {
                 HANGTP ab = (HANGTP) dsHH.get(i) ;
                 ab.xuat();
             }
          }
      }
    }
        
        
}

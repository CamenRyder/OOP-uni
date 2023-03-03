
package Bai3;

import java.util.Scanner;

public class toaDoDiem {
       private  int x ;  
       private  int y ;  
       Scanner sc = new Scanner(System.in);
    public toaDoDiem(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void Input(){
        System.out.println("Nhap toa do x: ");
        int x = sc.nextInt() ;
        System.out.println("Nhap toa do y: ");
        int y = sc.nextInt() ;
        this.x = x ; 
        this.y = y  ;  
    }
    public toaDoDiem() {
        this.x = 0 ;
        this.y = 0  ; 
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
      
    public toaDoDiem KhoangCach(toaDoDiem a)
    {   
           toaDoDiem c =  a ;   
           c.x = this.x + a.x ;  
           c.y = this.y + a.y ;
           return c ; 
    }
    
    public toaDoDiem doiXungQaTrucHoanh()
    {
          toaDoDiem a = this ;  
          a.x = a.x * -1  ; 
          return a ;          
    }
   
    public void inToaDo()
    {
        System.out.printf("[%d,%d]",this.x,this.y);
    }
}

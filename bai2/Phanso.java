
package bai2;

import java.util.Scanner;
public class Phanso {
    private int tuSo ; 
    private int mauSo ; 
       
    public Phanso(){
        this.tuSo = 1 ; 
        this.mauSo = 1 ;  
    }
       
    public Phanso(int tuSo, int mauSo) {
        this.tuSo = tuSo;
       if(this.mauSo == 0)
       {
           this.mauSo = 1   ;  
       }else this.mauSo =mauSo ;  
    }
    
    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        if(mauSo == 0)
            this.mauSo = 1  ;  
        else
        this.mauSo = mauSo;
    }
    
    public void OutPut()
    {
        System.out.printf(" [%d]/[%d] \n",this.tuSo, this.mauSo);
    }
    
    public int  UCLN(int a, int b)
    {
       int tmp;
             while(b != 0) {
        tmp = a % b;
        a = b;
        b = tmp;
    }
    return a;
    }
    
    
    public Phanso rutGon()
    {
           Phanso ps = new Phanso() ; 
           
           int ucln = this.UCLN(this.tuSo,this.mauSo) ;
           ps.setTuSo(this.tuSo/ucln);
           ps.setMauSo(this.mauSo/ucln);
           return ps ;  
    }
    
    public Phanso cong2PS(Phanso psB)
    {
           Phanso ps = psB.rutGon() ;
           this.tuSo = this.tuSo* ps.mauSo + this.mauSo*ps.tuSo ; 
           this.mauSo = this.mauSo *  ps.mauSo ; 
           this.rutGon() ;
           return this ;  
    }
    public Phanso tru2PS(Phanso psB)
    {
           Phanso ps = psB.rutGon() ;
           ps.tuSo = this.tuSo* ps.mauSo - this.mauSo*ps.tuSo ; 
           ps.mauSo = this.mauSo *  ps.mauSo ; 
           ps.rutGon() ;
           return ps ;  
    }
       public Phanso nhan2PS(Phanso psB)
       {
           Phanso ps = psB.rutGon() ;  
           ps.tuSo = this.tuSo*psB.tuSo ; 
           ps.mauSo = this.mauSo*psB.mauSo ; 
           ps.rutGon() ; 
           return ps ;  
       }
       
          public Phanso chia2PS(Phanso psB)
       {
           Phanso ps = psB.rutGon() ;  
           ps.tuSo = this.tuSo*psB.mauSo ; 
           ps.mauSo = this.mauSo*psB.tuSo ; 
           ps.rutGon() ; 
           return ps ;  
       }
     Scanner sc = new Scanner(System.in) ; 

    public void Input() {
        int  tuSo ,  mauSo ;
        System.out.println("Nhap tu : ");
        tuSo = sc.nextInt() ;  
        System.out.println("Nhap mau : ");
        mauSo = sc.nextInt() ;
        this.setMauSo(mauSo);
        this.setTuSo(tuSo);

   }
   
}

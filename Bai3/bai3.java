
package Bai3;
import java.util.Scanner;

public class bai3 {
    static Scanner sc = new Scanner(System.in) ; 
    public static void main(String[] args) {    
        toaDoDiem a = new toaDoDiem() ;  
        a.Input(); 
        a.inToaDo(); 
        toaDoDiem ab=a.doiXungQaTrucHoanh() ;
        ab.inToaDo();
        (ab.KhoangCach(a)).inToaDo();
    }    
}

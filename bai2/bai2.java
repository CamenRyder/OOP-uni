
package bai2;

import java.util.Scanner;
public class bai2 {
    public static void main(String[] args){
        Phanso ps=new Phanso();
        Phanso ps1=new Phanso();
        
        ps.Input();
        ps.OutPut();
        
        ps1.Input();
        ps1.OutPut();
        
        Phanso S = ps.cong2PS(ps1) ; 
        S.OutPut();
        Phanso H = ps.tru2PS(ps1);
        H.OutPut();
        Phanso T = ps.nhan2PS(ps1);
        T.OutPut();
        Phanso Th = ps.chia2PS(ps1);
        Th.OutPut();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptuan7;
import java.util.Scanner;
public class hinhtru extends hinhtron{
      public float chieucao;
  
    
   public hinhtru(){
       ten = "hinh tru";
   }
   public void nhapchieucao(){
       System.out.println("chieu cao ");
       Scanner scanner =new Scanner(System.in);
      chieucao=scanner.nextFloat();
}
 public void nhapthetich(){
     thetich = dientich * chieucao;
 }
}

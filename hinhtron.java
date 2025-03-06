/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptuan7;
import java.util.Scanner;
public class hinhtron extends hinhhoc {
 
    public float bankinh;
  
    
   public hinhtron(){
       ten = "hinh tron";
   }
   public void nhapbankinh(){
       System.out.println("ban kinh= ");
       Scanner scanner =new Scanner(System.in);
      bankinh=scanner.nextFloat();
}
 public void nhapchuvi(){
     chuvi = 2 * PI * bankinh;
 }
  public void nhapdientich(){
      dientich =  PI * bankinh * bankinh;
  }
}

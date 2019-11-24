/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmgmt;

public class surgeons implements hospital{

    
String na,id1;
    int num;

    @Override
    public void name(String a) {
       na=a; 
    }

    @Override
    public void id(String a) {
        id1=a;
    }

    @Override
    public void number(int a) {
        num=a;
    }
    public void print4(){
        System.out.println(na+"  "+id1+"  "+num);
    }
}

package hospitalmgmt;

public class Employee implements hospital{
    
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
    public void print(){
        System.out.println(na+"  "+id1+"  "+num);
    }

   
}

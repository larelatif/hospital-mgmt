
package hospitalmgmt;

public class HospitalMgmt {

public static void main(String[] args) {
        // TODO code application logic here
  Employee p = new Employee();
        p.name("Lare");
        p.id("12");
       p.number(190);
       p.print();
 Patient j = new Patient ();  
      j.name("lava");
      j.id("23");
      j.number(567);
      j.print2();
  Doctor b = new Doctor(); 
       b.name("kosar");
       b.id("l12");
       b.number(1233);
  empReception a = new empReception();
       a.name("koyar");
       a.id("1232");
       a.number(12312323);
       a.print3();
  surgeons i = new surgeons ();
       i.name("komar");
       i.id("1555");
       i.number(53215);
       i.print4();
    }
    
}

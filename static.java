class Emp
{
    int eid;
    int salary;
    static String ceo;
    
    public void show(){
     
        System.out.println(eid+":"+salary+ ":"+ceo );
    }
    
    static{
        ceo="asisa";
    }
            
     public Emp(){
          
             eid=6;
             salary=5000;
     
         
     }
            
}
public class StaticDemo {
    public static void main(String[] args){
        
        Emp sheik=new Emp();
        /*sheik.eid=1;
        sheik.salary=1000;
        Emp.ceo="yyy"; */
        
        Emp navin=new Emp();
        /*navin.eid=2;
        navin.salary=2000;
        Emp.ceo="yyy";
        
        navin.ceo="xxx";*/
        
        sheik.show();
        navin.show();
        
        
        
        
        
        
    }
        
        
}

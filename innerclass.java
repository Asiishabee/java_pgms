class Outer
{
    int num1=6;


    public void show()
    {
      System.out.println(num1);
    }

    class Inner{
        public void display(){
            System.out.println("im asi");
        }
    }

}

public class InnerClass{
    public static void main(String[] args){
        
        Outer obj=new Outer();
        obj.show();
        
        
        Outer.Inner obj1=obj.new Inner();
        obj1.display();
            
          
       
    }
    
}









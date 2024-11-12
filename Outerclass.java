public class Outerclass {
    static class StaticNestedClass{
        void display(){
            System.out.println("Inside static nested class");
        }
    }
    class InnerClass{
        void display(){
            System.out.println("Inside Innerclass");
        }
    }
    public static void main(String[]args){
        Outerclass.StaticNestedClass 
                staticNested = new
                Outerclass.StaticNestedClass();
        staticNested.display();
        Outerclass outer = new
                Outerclass();
        Outerclass.InnerClass inner=outer.new InnerClass();
        inner.display();
    }
}
        
        
        
        
      

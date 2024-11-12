public class StaticExample {
    static int Count=0;
    public StaticExample(){
        Count++;
    }
    public static void displayCount(){
        System.out.println("Total objects created:"+Count);
    }
    public static void main(String[]args){
        StaticExample obj1=new StaticExample();
        StaticExample obj2=new StaticExample(); 
        StaticExample obj3=new StaticExample(); 
        StaticExample.displayCount();
    }
    
}

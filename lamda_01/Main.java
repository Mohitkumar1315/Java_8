package lamda_01;
public class Main 
{
       public static void main(String[] args) 
    {
        System.out.println("test");
        Calculator addition=(a,b)->a+b;

        System.out.println(addition.calculate(10, 20));
        Calculator subtract=(a,b)->a-b;System.out.println("subtracted value"+subtract.calculate(20, 10));

        Calculator div=(a,b)->a/b;
        System.out.println("Diveded value is :"+div.calculate(6, 6));

        Calculator mult=(x,y)->x*y;
        System.out.println("geted value is :"+mult.calculate(7,5));

        Greeting sayHello = (name) -> System.out.println("Hello " + name);
         sayHello.say("Mohit");         
    }    
}

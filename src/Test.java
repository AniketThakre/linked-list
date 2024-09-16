import java.util.ArrayList;
import java.util.List;

class Demo{
    {
        System.out.println("Inside demo instance");
    }
    public Demo(){
        System.out.println("inside dec=mo constructor");
    }
    static {
        System.out.println("inside demo static");
    }
    public void display(){
        System.out.println("inside demo view");
    }
}
public class Test {

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.display();
    }
}
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("**.xml");

        HelloWorld hw1 = (HelloWorld) ctx.getBean("helloWorldImpl1");
        hw1.printHelloWorld();
        System.out.println();
        hw1.doPrint();
        hw1.saying();
//
//        HelloWorld hw2 = (HelloWorld)ctx.getBean("helloWorldImpl2");
//        System.out.println();
//        hw2.printHelloWorld();
//        System.out.println();
//        hw2.doPrint();


    }
}

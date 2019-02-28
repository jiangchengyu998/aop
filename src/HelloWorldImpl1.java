import com.EnableLogRecord;

public class HelloWorldImpl1 implements HelloWorld {
    @EnableLogRecord
    public void printHelloWorld() {
        System.out.println("Enter HelloWorldImpl1.printHelloWorld()");
    }

    public void doPrint() {
        System.out.println("Enter HelloWorldImpl1.doPrint()");
    }

    @EnableLogRecord
    @Override
    public void saying() {
        System.out.println("hao de");
    }
}
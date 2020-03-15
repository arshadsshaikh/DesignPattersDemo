package factoryteluskopattern;

public class MyFactoryDemo {

    public static void main(String[] args) {

        System.out.println(" This is windows OS");

        OsFactory osFactory= new OsFactory();

        OS os=osFactory.getInstance("Android");

        os.systemSpec();


    }
}

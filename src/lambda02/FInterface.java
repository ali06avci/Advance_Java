package lambda02;
import lambda02.FInterface.MyInterface;

public class FInterface {

    @FunctionalInterface
    public interface MyInterface{
        double getValue();
    }

    @FunctionalInterface
    public interface MyInterfaceValue{
        double getValue(double d);
    }

    public static void main(String[] args) {

        //anonymus
//		MyClass mc=new MyClass(new MyInterface() {
//
//			@Override
//			public double getValue() {
//				// TODO Auto-generated method stub
//				return 10;
//			}
//		});
//
//		System.out.println(mc.getMi().getValue());
//
//
//	MyClass mc2=new MyClass(new MyInterface() {
//
//			@Override
//			public double getValue() {
//				// TODO Auto-generated method stub
//				return 50;
//			}
//		});
//
//
//	System.out.println(mc2.getMi().getValue());

        //First usage you dont need braces
        MyInterface mi2=()->50;

        MyInterface mi=()->10;

        System.out.println(mi.getValue());

        //Second usage
        MyInterface mi3=()->{
            double pi=3.1415;
            return pi;
        };
        System.out.println(mi3.getValue());

        MyInterfaceValue doubleRef=(val)->{
            double result=val*3.1415;
            return result;
        };
        System.out.println(doubleRef.getValue(5));
    }
}

class MyClass{

    private MyInterface mi;

    public MyInterface getMi() {
        return mi;
    }

    public void setMi(MyInterface mi) {
        this.mi = mi;
    }

    public MyClass(MyInterface mi) {
        this.mi=mi;
    }

}

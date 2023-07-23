package exception;
import java.util.Scanner;

class OpenException extends Exception{}

class CloseException extends OpenException{}

class NewException extends Exception{}
public class ArrayIndex {
	public ArrayIndex() throws OpenException{}
	public void f() throws OpenException{}
//	public static int open() {
////		
////		 =10;
//		return -1;
//	}
//	
//	public static void readFile() throws OpenException,CloseException{
//		if(open()==-1) {
//			throw new CloseException();
//		}
//	}
	
	public static void main(String[] args) {
//		try {
//			readFile();
//		} catch (NullPointerException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  catch(OpenException e) {
//			e.printStackTrace();
//			System.out.println("Open");
//		}
////		}  catch(Exception e) {
////			e.printStackTrace();
////			System.out.println("Anything");
////		}
	}

//	public static void f() {
//		int[] a=new int[10];
//		a[10]=10;
//		System.out.println("hello");
//
//	}
//	
//	public static void g() {
//		f();
//	}
//	
//	public static void h() {
//		int i=10;
//		if(i<100)
//		{
//			g();
//		}
//	}
//	
//	public static void k() {
//		try{
//			h();
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("k()");
//			throw e;
//		}
//	}
//	
//	public static void main(String[] args) {
//		try {
//			k();
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("caught");
//			System.out.println(e.getMessage());
//			System.out.println(e);//直接是e相当于是e.toString()
//			e.printStackTrace();
//		}
//		
//		System.out.println("main");
////		int[] a=new int[10];
////		int idx;
////		Scanner in=new Scanner(System.in);
////		idx=in.nextInt();//让用户输入一个东西
////		try {//把可能发生的东西放在try里面
////			a[idx]=10;
////			System.out.println("hello");
////		}catch(ArrayIndexOutOfBoundsException e){//捕捉异常
////			System.out.println("caught");
////		}//处理后会继续往下走
////		
//
//	}

}

class NewClass extends ArrayIndex{
	public NewClass() throws OpenException,NewException {}
	public void f(){}
	public static void main(String[] args)  {	
		try {
			ArrayIndex p=new NewClass();
			p.f(); 
		}catch(OpenException e) {
			e.printStackTrace();
		}catch(NewException e) {
			e.printStackTrace();
		}
		
	}
}

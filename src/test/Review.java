package test;

import java.io.Console;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Review {
	public static void main(String[] args) {
		test10
		
		
		();

	}/*
		 * 
		 * public static void test1() { int a = 97; char b = (char) a;
		 * System.out.println(a + "," + b); }
		 * 
		 * public static void test2() { InputStream is = System.in;
		 * 
		 * try { int a = is.read(); System.out.println(a);
		 * System.out.println((char) a); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } finally { try {
		 * is.close(); } catch (IOException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); } } System.out.println(); }
		 * 
		 * public static void test4() { while (true) { InputStream is =
		 * System.in; int a; try { a = is.read(); System.out.println(a);
		 * System.out.println((char) a); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * }
		 * 
		 * }
		 * 
		 * public static void test5() { InputStream is = System.in; while (true)
		 * { try { int a = is.read(); System.out.println(a);
		 * System.out.println((char) a); if ((char) a == 'q')
		 * 
		 * { System.out.println("���������� ��q�����Զ��˳���"); System.exit(0); } } catch
		 * (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace();
		 * 
		 * } }
		 * 
		 * }
		 */

	// public static void test6(){
	/**
	 * ��ȡ����һ���ַ�,ʹ�����Զ��˳�
	 */
	/*
	 * InputStream is = System.in; System.out.println("ϵͳ����������,������:");
	 * while(true){ byte [] b = new byte [4]; try { is.read(b); String str = new
	 * String(b); System.out.println(str);
	 * 
	 * if(str.equals("exit")){
	 * 
	 * System.out.println("��������exit�˳���,�����Զ��˳�!"); System.exit(0); } } catch
	 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace();
	 * }
	 * 
	 * }
	 * 
	 * 
	 * }
	 */
	public static void test7() {
		System.out.println("�Ѿ����������룡");
		if (System.console() != null) {
			String str = null;
			while ((str = System.console().readLine()) != null) {
				System.out.println(str);
				if (str.equals("exit")) {
					System.out.println("��������exit�˳������Զ��˳�");
					System.exit(0);
				}
			}
		} else {
			System.out.println("���������������");
		}
	}
	/**
	 * ���ܣ���eclipse�л�ȡ�������벢���������
	 */
	public static void test8() {
		System.out.println("������һЩ���ݰ���");
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()){
			String str = scanner.nextLine();
			System.out.println(str);
			if(str.equals("exit")){
				System.out.println("��������exit�˳�����ϵͳ�Զ��˳�");
				System.exit(0);
			}
		}
		
	}
	public static void test9(){
		FileInputStream is=null
				;
		try {
			is = new FileInputStream("aa");
			int a=0;
			while(( a=is.read())!=-1){ 
				System.out.print((char)a);
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void test10(){InputStream  is =null;
		try {
		  is = new FileInputStream("aa");
			byte[] a = new byte[6];
			
			while((is.read(a))!=-1){
				
				String str = new String(a);
				System.out.println(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}

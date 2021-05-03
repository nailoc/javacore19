package com.hk.app;

import java.io.*;

public class IsBufStream {

	public static void main(String[] args) throws IOException {
		
		String workpath = System.getProperty("user.dir");
		String filename = "\\src\\text\\binput.txt";
		
		//기반 파일 스트림
		FileInputStream fin = new FileInputStream(workpath+filename);
		//버퍼 스트림
		BufferedInputStream bin = new BufferedInputStream(fin);
		
		int data = bin.read();
		while(data != -1) {
			System.out.print((char)data);
			data = bin.read();
		}
		
		System.out.println();
		System.out.println("데이터 입력 완료");

	}

}

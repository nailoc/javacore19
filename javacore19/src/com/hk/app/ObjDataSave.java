package com.hk.app;

import java.io.*;
import java.util.*;

public class ObjDataSave {

	public static void main(String[] args) throws IOException {
		
		// 클래스로 만들어진 참조변수의 데이터 = 객체데이터
		HashMap userInfo = new HashMap();
		userInfo.put("NAME", "김건우");
		userInfo.put("TEL", "02-9999-3333");
		userInfo.put("PHONE", "010-2222-4444");
		
		String workpath = System.getProperty("user.dir");
		String savefile = "\\src\\text\\userdata.ser";  // ser 는 직렬화데이터라고 정의함
		FileOutputStream fos = new FileOutputStream(workpath+savefile);
		
		//보조스트림 ObjectOutputStream
		ObjectOutputStream oos = new ObjectOutputStream(fos);  // 바이러리 데이터로 저장
		
		oos.writeObject(userInfo);
		
		oos.close();
		
		
		

	}

}

package com.hk.app;

import java.io.*;
import java.util.ArrayList;

public class Exam4 {

	public static void main(String[] args) throws IOException {

		// word.txt 텍스트 파일을 읽어서
		String workpath = System.getProperty("user.dir");
		String wordfile = "\\src\\text\\word.txt";
		
		FileReader fr = new FileReader(workpath+wordfile);
		BufferedReader br = new BufferedReader(fr); //보조스트림
				
		// 안에 있는 단어들 중에 1개만 랜덤하게 출력하시오
		ArrayList<String> wordList = new ArrayList<String>();
		String line="";
		while((line = br.readLine())!=null) {
			wordList.add(line);
		}
		
		br.close(); // 보조스트림을 닫으면 메인스트림도 닫힌다
		
		for(int i=0; i<wordList.size(); i++) {
			System.out.println(wordList.get(i));
		}
		
		// 랜덤하게 한 단어 뽑기
		int sizeOfList = wordList.size();
		int rand = (int)(Math.random()*sizeOfList);
		System.out.println("랜덤하게 한 단어를 뽑으면:"+wordList.get(rand));
		
	}

}

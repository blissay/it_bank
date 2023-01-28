package exception_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExample {

	public static void main(String[] args) throws IOException {
		// 스트림을 이용한다. 데이타를 가져올수 있다.
		
		FileReader fr = new FileReader("C:\\Users\\user\\Desktop\\test.txt"); //자바는 이파일이있는지 없는지 모른다
		char[] buffer = new char[128];
		int readCount = fr.read(buffer);
		while(readCount != -1) {
			String data = new String(buffer);
			System.out.println(data);
			readCount = fr.read(buffer);
		}
		fr.close();
		

	}

}

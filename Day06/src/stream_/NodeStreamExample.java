package stream_;

import java.io.*;

public class NodeStreamExample {

	public static void main(String[] args) {
		// 스트림에 대한 예제. 이걸로 데이타베이스, 웹사이트등 모든 데이타를 가져올 수있다.
		// *Stream 이라는 저미사면 byte 형이다.   *writer,*reader면 char형이다.
		// 파일의 읽어보고 쓸수있다.
		
		FileWriter fw = null;
		FileReader fr = null; //입출력은 잘못된게 올수있으므로 try 캐치문을 무조건 넣는다.
		try {
			fw = new FileWriter("C:\\Users\\user\\Desktop\\file_test.txt"); // 라이트는 파일없어도 직접 만들어준다
			fw.write("이건 테스트용 문장입니다.");
			fw.flush(); // 쓸때는 버퍼메모리가 있다. 이걸 완전 내보낸다.
			System.out.println("파일 작성 완료");
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			if(fw!=null) {try {fw.close();}catch(IOException e) {}}
		}
		
		try {
			fr = new FileReader("C:\\Users\\user\\Desktop\\file_test.txt");
			char[] buffer = new char[128]; //버퍼는 128바이트이므로 128자를 채울수있는 바구니가 된다.
			int readCount = fr.read(buffer); // fr.read() 한글자만 가져온다 // 몇칸차있는지 확인해보자 
			while(readCount != -1) {
				String data = new String(buffer);
				System.out.println("읽어온 데이터 : "+data);
				readCount = fr.read(buffer);
			}
			System.out.println("파일 로드 완료.");
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			if(fr!=null) {try {fr.close();}catch(IOException e) {}}
		}

	}

	

}

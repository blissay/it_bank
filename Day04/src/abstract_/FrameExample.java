package abstract_;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class FrameExample {

	public static void main(String[] args) {
		// 추상을 위한 간단한 예제
		// 객체지향을 제일 잘 이해할수 있는
		// ekdmadp
		Frame f = new Frame("MyFrame");
		f.setVisible(true);
		f.setSize(300, 300);
		Panel p = new Panel();
		Button b1 = new Button("push");
		b1.addActionListener(new ActionListner(){ // 버튼 누르면 구현되는건 비워놓으면 된다
			
			@Override
			public void actionPerformence(ActionEvent e) {
				System.out.println("버튼누름");
			}
			
		});
		p.add(b1);
		f.add(p);

	}

}

package day15.thread.ex03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JFrame;

public class GraphicThread 
						extends JFrame implements Runnable { // 화면에 Fram(window)을 만들어 준다

	int num, x, y;
	Color color;
	Random random;
	
	public GraphicThread(int num) {  // 생성자함수의 주요 역할 : 초기화
		this.num = num;
		color = Color.red;  // 색상은 대소문자 상관 없다
		random = new Random();
		setSize(500, 400);  // 프레임(화면)의 크기 : 너비, 높이
		setVisible(true);  // 화면 보여주기
		setLocation(300, 150);  // 화면 위치 조절
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 닫기(Gui 닫기)
	}

	@Override
	public void paint(Graphics g) {  // paint(Graphics g) : 붓으로 그려주는 역할
		g.setColor(color);
//		g.fillRect(x, y, 3, 3);
		g.fillOval(x, y, 3, 3);
	}

	@Override
	public void run() {
		Rectangle rect = getBounds();
		
		for (int i = 0; i < num; i++) {
			x = random.nextInt(rect.width);  // rect.width : 지정해줬던 500 너비를 벗어나지 않게 해준다
			y = random.nextInt(rect.height);  // rect.height : 지정해줬던 400 높이를 벗어나지 않게 해준다
			
			repaint();
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}  // for end
	}  // run end
	
	public static void main(String[] args) {
		//1.
//		GraphicThread gt = new GraphicThread(100);
//		Thread t1 = new Thread(gt);
//		t1.start();
		
		//2.
		new Thread(new GraphicThread(200)).start();   // 200개 찍어줘
	}

}

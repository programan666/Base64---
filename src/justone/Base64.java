package justone;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Base64 {
	
	public Base64(){
		JFrame Jframe=new JFrame("加解密工具");
		JPanel Jpanel=new JPanel();
		JLabel ming=new JLabel("明文");
		JLabel mi=new JLabel("密文");
		JTextArea left=new JTextArea();
		JTextArea right=new JTextArea();
		JButton encode=new JButton("加密→");
		JButton decode=new JButton("←解密");
		JButton cle=new JButton("清空");
		Font f=new Font("微软雅黑",Font.BOLD,20);
		Font f1=new Font("微软雅黑",Font.BOLD,40);
		Jframe.setResizable(false);
		Jframe.setLayout(null);
		Jpanel.setLayout(null);
		left.setLineWrap(true);
		right.setLineWrap(true);
		JScrollPane scroll1 = new JScrollPane(left); 
		JScrollPane scroll2 = new JScrollPane(right); 
		Jframe.setBounds(380, 200, 1200, 700);
		Jpanel.setBounds(0, 0, 1200, 700);
		scroll1.setBounds(20, 100, 500, 500);
		scroll2.setBounds(670, 100, 500, 500);
		encode.setBounds(540, 200, 110, 50);
		decode.setBounds(540, 300, 110, 50);
		cle.setBounds(540, 400, 110, 50);
		ming.setBounds(225, 30, 160, 50);
		mi.setBounds(875, 30, 160, 50);
		encode.setFont(f);
		decode.setFont(f);
		cle.setFont(f);
		ming.setFont(f1);
		mi.setFont(f1);
		left.setFont(f);
		right.setFont(f);
		Jpanel.add(scroll1);
		Jpanel.add(scroll2);
		Jpanel.add(encode);
		Jpanel.add(decode);
		Jpanel.add(cle);
		Jpanel.add(ming);
		Jpanel.add(mi);
		Jframe.add(Jpanel);
		Jframe.setVisible(true);
		Jframe.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
		encode.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent arg0) {
				// TODO 自动生成的方法存根
				encode.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			public void mouseClicked(MouseEvent arg0) {
				// TODO 自动生成的方法存根
				right.setText(commonsCodesBase64encode(left.getText()));
			}
		});
		
		decode.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent arg0) {
				// TODO 自动生成的方法存根
				decode.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			public void mouseClicked(MouseEvent arg0) {
				// TODO 自动生成的方法存根
				left.setText(commonsCodesBase64decode(right.getText()));
			}
		});
		
		cle.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent arg0) {
				// TODO 自动生成的方法存根
				cle.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			public void mouseClicked(MouseEvent arg0) {
				// TODO 自动生成的方法存根
				left.setText("");
				right.setText("");
			}
		});
		
		
	}
	
	
	
	public String commonsCodesBase64encode(String src){
		byte[] encodeBytes = org.apache.commons.codec.binary.Base64.encodeBase64(src.getBytes());
		return new String(encodeBytes);
	}
	public String commonsCodesBase64decode(String src){
		byte[] decodeBytes = org.apache.commons.codec.binary.Base64.decodeBase64(src.getBytes());
		return new String(decodeBytes);
	}
}

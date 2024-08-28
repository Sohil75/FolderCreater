package com.project.foldercreate;

import javax.swing.JFrame;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.TextField;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.event.*;
import java.io.File;

public class FolderCreater implements ActionListener{
	JFrame frmFoldercreater =new JFrame();
	JPanel panel = new JPanel();
	TextField name = new TextField();
	Button createButton = new Button("Create");

	/**
	 * @wbp.parser.entryPoint
	 */
	public void createFolder()
	{
		frmFoldercreater.getContentPane().setLayout(null);
		frmFoldercreater.setResizable(false);
		frmFoldercreater.setBounds(0,0,450,310);
		
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 436, 280);
		frmFoldercreater.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Desktop Folder Maker");
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(10, 27, 417, 49);
		panel.add(lblNewLabel);
		
		
		name.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		name.setBounds(104, 113, 233, 49);
		panel.add(name);
		createButton.setForeground(Color.WHITE);
		
		
		createButton.setBackground(Color.DARK_GRAY);
		createButton.setFont(new Font("Stencil", Font.ITALIC, 15));
		createButton.setBounds(152, 198, 132, 34);
		panel.add(createButton);
		
		JLabel lblNewLabel_1 = new JLabel("Name your file :");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Stencil", Font.ITALIC, 18));
		lblNewLabel_1.setBounds(104, 86, 192, 21);
		panel.add(lblNewLabel_1);
		frmFoldercreater.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFoldercreater.setTitle("FolderCreater");
		frmFoldercreater.setVisible(true);
		createButton.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object onclick=e.getSource();
		if (onclick==createButton)
		{
			String filename=name.getText();
			String path="C:\\Users\\Sohail\\OneDrive\\Desktop\\";
			File file=new File(path+filename);
			System.out.println(file);
			file.mkdir();
			name.setText("");
		}
		
	}
}

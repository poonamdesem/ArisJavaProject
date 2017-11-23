package aris;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileManager;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class ArisUI extends JFrame {
	private Label lblSrcCode; // Declare a Label component
	private TextArea taSrcCode;
	private TextArea taAst;
	private TextArea taResult;
	private Button btnLoad; // Declare a Button component
	private Button btnSimilarCode;
	private Button btnSimilarSpec;


	public ArisUI() {
		setTitle("Aris Java");
		setSize(1000, 800);
		setLayout(new FlowLayout()); // "super" Frame, which is a Container, sets its layout to FlowLayout to arrange
		// the components from left-to-right, and flow to next row from top-to-bottom.

		lblSrcCode = new Label("Java Source Code");
		add(lblSrcCode);
	
		taSrcCode = new TextArea();
		add(taSrcCode);
		
		btnLoad = new Button("Load");
		add(btnLoad);
		btnSimilarCode = new Button("Similar Code");
		add(btnSimilarCode);
		btnSimilarSpec = new Button("Similar Spec");
		add(btnSimilarSpec);
		
		taAst = new TextArea();
		add(taAst);
		taResult = new TextArea();
		add(taResult);
		
		
		
		btnLoad.addActionListener(new BtnLoadListener());		
		
	}

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ArisUI().setVisible(true);

			}
		});
		// ArisUI aui = new ArisUI();

	}
	  private class BtnLoadListener implements ActionListener {
	      @Override
	      public void actionPerformed(ActionEvent evt) {
	         String codeText = taSrcCode.getText();
	         JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
	         StandardJavaFileManager stdFileManager  = compiler.getStandardFileManager(null, null, null);
	         compiler.getTask(null, null, null, null, null, null);
	         System.out.println(compiler);
	         taAst.setText("hello");
	      }

	
	   }

}

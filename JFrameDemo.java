// JFrameDemo.java

import java.util.EventObject;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;     //使用Swing类，必须引入Swing包

public class JFrameDemo{
  private JFrame  frame;
  private String name;
  public void JFrameDemo() {
  }
  private JButton loginButton;

  public static void main( String args[]) {
    JFrameDemo s = new JFrameDemo();
    s.test();
  }
  public void test() {

         //定义一个窗体对象f，窗体名称为"一个简单窗口"        

         frame = new JFrame("通讯录");

         /*设置窗体左上角与显示屏左上角的坐标，

          离显示屏上边缘300像素，离显示屏左边缘300像素     */

         frame.setLocation(200, 100);           //frame.setLocationRelativeTo(null);本语句实现窗口居屏幕中央

         frame.setSize(300,600);            //设置窗体的大小为300*200像素大小

         frame.setResizable(true);       //设置窗体是否可以调整大小，参数为布尔值

        //用户单击窗口的关闭按钮时程序执行的操作

         frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        //添加面板
        JPanel panel = new JPanel();    
        frame.add(panel);
        /* 
         * 调用用户定义的方法并添加组件到面板
         */
        placeComponents(panel);

         //设置窗体可见，没有该语句，窗体将不可见，此语句必须有，否则没有界面就没有如何意义了
        placeLogin(panel);
        frame.setVisible(true);   


  }
  private void placeComponents(JPanel panel) {

        /* 布局部分我们这边不多做介绍
         * 这边设置布局为 null
         */
        panel.setLayout(null);

        // 创建 JLabel
        JLabel userLabel = new JLabel("User:");
        /* 这个方法定义了组件的位置。
         * setBounds(x, y, width, height)
         * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
         */
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        /* 
         * 创建文本域用于用户输入
         */
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        // 输入密码的文本域
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        /* 
         *这个类似用于输入的文本域
         * 但是输入的信息会以点号代替，用于包含密码的安全性
         */
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        // 创建登录按钮
    }
    private void placeLogin(JPanel panel) {
        loginButton = new JButton("login");
        //添加时间监听器
        loginButton.setActionCommand("Submit");
        loginButton.addActionListener(new ButtonClickListener());

        loginButton.setBounds(142, 90, 80, 25);
        panel.add(loginButton);
    }
    private class ButtonClickListener implements ActionListener{
      public void actionPerformed(ActionEvent e) {
         String command = e.getActionCommand();  
         if( command.equals( "Submit" ))  {
            frame.setVisible(false);
         }
      }
    }
}
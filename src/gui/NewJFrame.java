/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author VS9 X64Bit
 */
public class NewJFrame extends javax.swing.JFrame {
	
    public static String STANDARDLIZE(String s){
        while(s.charAt(0)==' '){
            s=s.substring(1);
        }
        return s;
    }
    public static String REPLACEWHITESPACE(String s){
        s=s.replace(" ","%20");
        return s;
    }
    public static String EDITSYS(JTextArea txt){
        String result="";
        if(!txt.getText().isEmpty()){
        String[] parts = txt.getText().split("\n");
        for(int i=0;i<parts.length;i++){
            result +="<p style=\"text-align: center;\"><strong><span style=\"font-size: 20px;\">"
                           +parts[i]+"</span></strong></p>"+"\n";
        }
        }
        return result;

    }
    public static String EDITLINK(JTextArea txt){
        String result="";
        if(!txt.getText().isEmpty()){
            String[] parts = txt.getText().split("\n");
            if(parts.length==1){
                result+="<p style=\"text-align: center;\"><a href=\""+parts[0]+"\" target=\"_blank\"><strong>DOWNLOAD</strong></a></p>"+"\n";
            }
            else{
            for(int i = 0;i<parts.length;i++){
                result+="<p style=\"text-align: center;\"><a href=\""+parts[i]+"\" target=\"_blank\"><strong>PART "+(i+1)+"</strong></a></p>"+"\n";
            }
            }
        }
        return result;
    }
    /**
     * Creates new form NewJFrame
     * 
     */
     String temp;
     String crack="";
     String outputsys=null;
     String groupcrack;
    public NewJFrame() {
    	super("Link Never Die Tool");
         initComponents();
        // HANDLE inputcrackgroup
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear the TextArea 1st
             output4.removeAll();
              outputg.removeAll();
               outputm.removeAll();
                inputsys.removeAll();
            groupcrack = inputgroupcrack.getText();
      
        if(!groupcrack.isEmpty()){
         //   groupcrack ="BẢN CRACK "+groupcrack;
            if(!groupcrack.contains("REPACK")){
            groupcrack = "<p style=\"text-align: center;\"><strong><span style=\"font-size: 20px;color: #FF0000;\">"+"BẢN CRACK "
                         + groupcrack + "</span></strong></p>";}
            else
             groupcrack = "<p style=\"text-align: center;\"><strong><span style=\"font-size: 20px;color: #FF0000;\">"+"BẢN "+ groupcrack
                          + "</span></strong></p>";
        }
        // Checkbox Crack
        if(check.isSelected()){
            crack="<p style=\"text-align: center;\"><a =\"\"=\"\" href=\" \" target=\"_blank\"><strong><span style=\"font-size: 20px;\">CRACK</span></strong></a></p>";
        }
               outputm.setText(groupcrack+"\n"+EDITLINK(inputm)+"\n"+crack);
               outputg.setText(groupcrack+"\n"+EDITLINK(inputg)+"\n"+crack);
               inputsys.setText(EDITSYS(inputsys));
               // HANDLE 4SHARE INPUT:
               URL url;
               BufferedReader br = null;
               String link = input4.getText();
               if(link.isEmpty())
                   return;
               try {
               url = new URL(link);
               URLConnection conn = url.openConnection();
               br  = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                } catch (IOException e1) {
                // TODO Auto-generated catch block
                JOptionPane.showMessageDialog(rootPane,"URL Không hợp lệ hoặc có vấn đề khi kết nối với LINK, vui lòng thử lại");
                return;
                    }	
            String inputLine;   
            String temp="";
            try {
	    while((inputLine=br.readLine())!=null){
            if(inputLine.contains("style="+"'"+"margin-top: 10px;margin-left: 20px; " +
            "border: 1px solid #ccc; padding: 8px; display: none"+"'"+">")){		
            temp = inputLine.replace("style="+"'"+"margin-top: 10px;margin-left:" +
            "20px; border: 1px solid #ccc; padding: 8px; display: none"+"'"+">","");
            break;
		}	
		}
		} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
		}
            String parts[] = temp.replace("</div>        </div>","").split("  <br/>");
            String[] result =new String[parts.length];
            String aaa="";
            parts[0] = STANDARDLIZE(parts[0].replace("               style='margin-top: 10px;margin-left: 20px; border: 1px solid #ccc; padding: 8px; display: none'> ", ""));
	for(int i=1;i<=parts.length-1;i++){
		aaa +="<p style=\"text-align: center;\"><a href=\""+REPLACEWHITESPACE(parts[i-1])+"\" target=\"_blank\"><strong>PART "+(i)+"</strong></a></p>"+"\n";					
				} 
        output4.setText(groupcrack+"\n \n"+aaa);
        System.out.println(groupcrack);
           }
        });
       
       
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        input4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputgroupcrack = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        inputg = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        inputm = new javax.swing.JTextArea();
        check = new javax.swing.JCheckBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        outputm = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        output4 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        outputg = new javax.swing.JTextArea();
        btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        inputsys = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("4SHARE");

        jLabel2.setText("Nhóm CRACK");

        jLabel3.setText("GOOGLE");

        inputg.setColumns(20);
        inputg.setRows(5);
        jScrollPane3.setViewportView(inputg);

        jLabel4.setText("MEGA");

        inputm.setColumns(20);
        inputm.setRows(5);
        jScrollPane4.setViewportView(inputm);

        check.setText("Thêm mục CRACK");

        outputm.setColumns(20);
        outputm.setRows(5);
        jScrollPane5.setViewportView(outputm);

        output4.setColumns(20);
        output4.setRows(5);
        jScrollPane6.setViewportView(output4);

        outputg.setColumns(20);
        outputg.setRows(5);
        jScrollPane7.setViewportView(outputg);

        btn.setText("GENERATE");

        jLabel5.setText("GOOGLE");

        jLabel6.setText("MEGA");

        jLabel7.setText("4SHARE");

        jLabel8.setText("CẤU HÌNH");

        inputsys.setColumns(20);
        inputsys.setRows(5);
        jScrollPane8.setViewportView(inputsys);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(check)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(0, 81, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputgroupcrack, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(218, 218, 218)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(input4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(0, 41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn)
                .addGap(320, 320, 320))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputgroupcrack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn;
    private javax.swing.JCheckBox check;
    private javax.swing.JTextField input4;
    private javax.swing.JTextArea inputg;
    private javax.swing.JTextField inputgroupcrack;
    private javax.swing.JTextArea inputm;
    private javax.swing.JTextArea inputsys;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea output4;
    private javax.swing.JTextArea outputg;
    private javax.swing.JTextArea outputm;
    // End of variables declaration                   
}

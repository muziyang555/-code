import javax.swing.*;
import java.sql.*;

/**
 * Created by liyang on 2018/1/24.
 */
public class DataBaseII {
    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rs;
    //连接方法
    public Connection getConn(String urlParam,String scamerParam,String userParam,String passwordParam){
        try {
            //1.加载驱动
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //2.创建连接
            //conn = DriverManager.getConnection("jdbc:oracle:thin:@10.1.184.12:1521:zgcyhdb","TELLER9","zgc123@abc");
            String url = "jdbc:oracle:thin:@"+urlParam+":1521:"+scamerParam;
            conn = DriverManager.getConnection(url,userParam,passwordParam);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;
    }
    //关闭方法
    public void closeAll(){
        try {
            if(rs != null){
                rs.close();
            }
            if(pst != null){
                pst.close();
            }
            if(conn != null){
                conn.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    //测试
	public static void main(String[] args) {
        DataBaseII db = new DataBaseII();
        String url = JOptionPane.showInputDialog("请输入数据库IP");
        String scamer = JOptionPane.showInputDialog("请输入UID");
        String user = JOptionPane.showInputDialog("请输入用户名");
        String password = JOptionPane.showInputDialog("请输入密码");
		Connection conn = db.getConn(url,scamer,user,password);
		System.out.println(conn.toString());
	}
}

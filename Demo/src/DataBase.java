import java.sql.*;

/**
 * Created by liyang on 2018/1/24.
 */
public class DataBase {
    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rs;
    //连接方法
    public Connection getConn(){
        try {
            //1.加载驱动
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //2.创建连接
            //conn = DriverManager.getConnection("jdbc:oracle:thin:@10.1.184.12:1521:zgcyhdb","TELLER9","zgc123@abc");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@10.1.184.12:1521/zgcyhdb","ENSEMBLE","2008bjAY");
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
        DataBase db = new DataBase();
		Connection conn = db.getConn();
		System.out.println(conn.toString());
	}
}

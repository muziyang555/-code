import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by liyang on 2018/3/15.
 */
public class ChangeUserStatus {
    public static void main(String[] args) {
        updLoginId();
    }

    public static void updLoginId() {
        try {
            Connection conn = DateBaseProperty.DataBase();
            String userId = JOptionPane.showInputDialog("请输入USER_ID");
            String sql = "UPDATE teller9.sso_userstatus set loginstatusid ='13' WHERE userid=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            System.out.println("sql"+sql);
            ps.setString(1,userId);
            System.out.println("参数"+userId);
            ResultSet rs = ps.executeQuery();
            rs.close();
            ps.close();
            conn.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
    }
}

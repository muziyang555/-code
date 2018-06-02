import Modle.DateBaseModle;

import javax.swing.*;
import java.sql.Connection;

/**
 * Created by liyang on 2018/3/15.
 */
public class DateBaseProperty {

    public static Connection DataBase(){

        DateBaseModle dateBaseModle = new DateBaseModle();
        String host = JOptionPane.showInputDialog("请输入库名");
        if ("UAT".equals(host)||"uat".equals(host)||"12".equals(host)){
            dateBaseModle.setUrl("10.1.184.12");
            dateBaseModle.setScamer("zgcyhdb");
            dateBaseModle.setUser("TELLER9");
            dateBaseModle.setPassword("zgc123@abc");
        }else if ("本地".equals(host)||"16".equals(host)){
            dateBaseModle.setUrl("10.1.184.16");
            dateBaseModle.setScamer("zgcyhdb");
            dateBaseModle.setUser("TELLER9");
            dateBaseModle.setPassword("teller9");
        }else if ("FAT".equals(host)||"fat".equals(host)||"18".equals(host)) {
            dateBaseModle.setUrl("10.1.184.18");
            dateBaseModle.setScamer("zgcyhdb");
            dateBaseModle.setUser("TELLER9");
            dateBaseModle.setPassword("zgc123@abc");
        }
        DataBaseII dataBase = new DataBaseII();
        Connection conn = dataBase.getConn(dateBaseModle.getUrl(),dateBaseModle.getScamer(),dateBaseModle.getUser(),dateBaseModle.getPassword());
        System.out.println(conn.toString());
        return conn;
    }

}

import java.io.*;

/**
 * Created by liyang on 2017/12/18.
 */
public class test {
private String a;
private String b;
    public static void main(String[] args) {
        //DecimalFormat df = new DecimalFormat("#,###,###,##0.00");
        //System.out.println(df.format(-1.01456));
        dealFile();
    }
    //文件拆分
    public static void dealFile(){
         //File file = new File("D:\\Users\\liyang\\Desktop");
                try {
                    FileReader reader = new FileReader("D:\\Users\\liyang\\Desktop\\stdout.log");
                    BufferedReader bufferedReader = new BufferedReader(reader);
                    String row;
                    int rownum = 1;
                    FileWriter fw1 = new FileWriter("D:\\Users\\liyang\\Desktop\\log1.txt");
                    FileWriter fw2 = new FileWriter("D:\\Users\\liyang\\Desktop\\log2.txt");
                    FileWriter fw3 = new FileWriter("D:\\Users\\liyang\\Desktop\\log3.txt");
                    FileWriter fw4 = new FileWriter("D:\\Users\\liyang\\Desktop\\log4.txt");
                    while ((row=bufferedReader.readLine())!=null){
                        if (rownum<(16122536/4)){
                            fw1.append(row+"\r\n");
                        }else if (rownum<=(16122536/2)&&rownum>(16122536/4)){
                            fw2.append(row+"\r\n");
                        }
                        else if (rownum>=(16122536/2)&&rownum<(16122536/4*3)){
                            fw3.append(row+"\r\n");
                        }else {
                            fw4.append(row+"\r\n");
                        }
                        rownum++;
                    }
                    fw1.close();
                    fw2.close();
                    fw3.close();
                    fw4.close();
                    bufferedReader.close();
                    System.out.println("俩傻逼，老子又执行完了，哈哈哈");

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }



    }
}

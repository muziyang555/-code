import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by liyang on 2018/1/12.
 */
public class substring {
    public static void main(String[] args) {
        //substring();
        /*
            option说明
            文件处理：01：删除文件名包含数字和以.sql结尾的
                      02：删除所以文件
         */
//        String f = "TL9_ZONE.xls";
//        if (isNum(f.substring(4,f.length())));{
//            System.out.println(isNum(f.substring(4,f.length())));
//            System.out.println(f.substring(4,f.length()));
//        }
//        System.out.println(f.substring(4,f.length()));
        //file("01");
//        String str = "MB_AGREEMENT_合同/协议信息表";
//        if (str.contains("/")){
//            System.out.println("1");
//            str=str.replace("/","-");
//            System.out.println(str);
//        }else {
//            System.out.println("2");
//        }
//            substring();
        BigDecimal intAccrued = BigDecimal.ZERO;
        String a = BigDecimal.ZERO.toString();
        intAccrued = new BigDecimal((a != null) && (a != "") ? a : "0");
        System.out.println(intAccrued);
    }

    public static void  substring(){
        String a = "";
        String I = a.substring(0,1);
        String II = a.substring(0,3);
        String III = a.substring(0,4);

        System.out.println(I);
        System.out.println(II);
        System.out.println(III);

    }
    public static void file(String option){
            File file = new File("D:\\Users\\liyang\\Desktop\\ceshi");
            String filel[] = file.list();
            System.out.println(Arrays.toString(filel));
            File[] fileary = file.listFiles();
            for (File f:fileary){
                System.out.println(f.getPath());
                if ("01".equals(option)){
                    if ((f.getName().endsWith(".sql")||isNum(f.getName())&&!(f.getName().startsWith("TL9_")))){
                    f.delete();
                    }
                    String fname = f.getName();
                    int flength = f.getName().length();
                    if (isNum(fname.substring(4,flength))){
                        //System.out.println(f.getName()+"因为排除前四位是"+fname.substring(4,flength)+"判断结果是"+isNum(fname.substring(4,flength))+"被删除了");
                        f.delete();
                    }
                }
                if ("02".equals(option)){
                    f.delete();
                }

            }
    }

    private static boolean isNum(String str){
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(str);
        return m.find();
    }

    public void copyFile(String fromFilePath,String toFolderPath,String fileName) throws IOException {
        int hasRead = 0;
        File fromFile = new File(fromFilePath);

        FileInputStream fileInputStream = new FileInputStream(fromFile);
        File toFile = new File(toFolderPath);
        if(!toFile.exists()){
            toFile.mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(toFile+File.separator+fileName);
        byte[] buffer= new byte[2048];
        while((hasRead=fileInputStream.read(buffer))!=-1){
            fileOutputStream.write(buffer,0,hasRead);
        }
        if(fileOutputStream!=null){
            fileOutputStream.close();
        }
        if(fileInputStream!=null){
            fileInputStream.close();
        }
    }

}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by liyang on 2018/3/3.
 */
public class Compareti {
    public static void main(String[] args) {
        //simpleCompare();
        //DateBaseProperty.DataBase();
//        ChangeUserStatus.updLoginId();
        //match();
        //System.out.println("20250505".compareTo("20191007")<0);//"20250505".compareTo("20191007")>0
//        if (isPhoneNumber("15906060606")){
//            System.out.println("Y");
//        }else {
//            System.out.println("N");
//        }
        chu(5);
    }



    private static void compare(){
        String startDate = "20180101";
        String endDate = "20190101";
        String runDate = "20190808";
        if ( startDate.compareTo(runDate) > 0 || endDate.compareTo(runDate) < 0){
            System.out.println("凭证类型[{0}]不存在");
        }else {
            System.out.println("正常");
        }
    }
    private static void simpleCompare(){
        String a = "1";
        String b = "2";
        String c = "3";
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));

    }
    private static void match(){
        String sum = "0";
        System.out.println(sum.matches("^[0-9]*[0-9][0-9]*$"));
    }

    private static boolean isPhoneNumber(String phoneNumber){
        String[] patternArray = {"^(\\+86)?[1][0-9]{10}$","^[0][0-9]{2,3}-[0-9]{5,10}$","^[1-9]{1}[0-9]{5,8}$"};
        Pattern pattern;
        //Pattern telPattern;
        Matcher matcher;
        for (String str : patternArray) {
            pattern = Pattern.compile(str);
            matcher = pattern.matcher(phoneNumber);
            if(matcher.matches()){
                return true;
            }
        }
        return false;
    }

    private static void chu(int i){
        System.out.println(i%2);
    }
}

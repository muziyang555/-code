/*
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
*/

public class CheckEnName{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private static final Log log = LogFactory.getLog(CheckEnName.class);

	public static void main(String[] args) {
		//log.debug("执行英文名称校验");
		String EN_CITY = "123safd@$$阿萨德";
		if (((!isNumberOrLetter(EN_CITY)) && (!isvalidChNmae(EN_CITY))) ||(isChinese(EN_CITY)!=0))
		{
			System.out.printf("英文城市必须字母或数字");
		}else {
			System.out.println("数据格式正确");
		}
		System.out.println(isNumberOrLetter(EN_CITY));
		System.out.println(isvalidChNmae(EN_CITY));
		System.out.println(isChinese(EN_CITY));
	}

	//字符串中文校验
	public static final int isChinese(String ch_name){
		if("".equals(ch_name)){
			return -1;
		}
		char[] tmp = ch_name.toCharArray();
		for(int i = 0 ; i < tmp.length;i++){
			if(!isChinese(tmp[i])){
				return 1;
			}
		}
		return 0;
	}
	//字符中文校验
	public static final boolean isChinese(char c){
		return c >= 0x4E00 && c <= 0x9FA5 || c == 0x3007;
	}

	  public static boolean isNumberOrLetter(String str)
	  {
	    boolean result = false;
	    
	    String reg = "^[0-9a-zA-Z]+$";
	    if (str.matches(reg)) {
	      result = true;
	    }
	    return result;
	  }
	
     public static final boolean isvalidChNmae(String ch_name){
		    boolean checkStatus=false;
    	 	String check_content = "^[/&＠＃￥％……＆×〔〕｛｝——＋【】〖〗《》：。；！？]+$";
    		//特殊字符校验
    		for(int i = 0; i < ch_name.length(); i++){
    			String subStr = ch_name.substring(i,i+1);
    			if(subStr.matches(check_content)){
    			   checkStatus = false; 
    			   return checkStatus;
    			}else{
    			   checkStatus = true;		  
    		    }
    		}
    		return checkStatus;
    	 
  }

}

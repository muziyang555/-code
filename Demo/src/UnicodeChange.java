import java.io.UnsupportedEncodingException;

public class UnicodeChange{

    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "CI3040 =\\u5BA2\\u6237\\u7684\\u82F1\\u6587\\u59D3\\u548C\\u82F1\\u6587\\u540D\\u4E0D\\u80FD\\u4E3A\\u7A7A\\uFF01\n" +
                "CI3041 =\\u5BA2\\u6237\\u7684\\u4E2D\\u6587\\u59D3\\u548C\\u4E2D\\u6587\\u540D\\u4E0D\\u80FD\\u4E3A\\u7A7A\\uFF01\n" +
                "CI3042 =\\u5C45\\u4F4F\\u56FD\\u4E0D\\u80FD\\u4E3A\\u7A7A\\uFF01\n" +
                "CI3043 =\\u7701/\\u5DDE\\u4E0D\\u80FD\\u4E3A\\u7A7A\\uFF01\n" +
                "CI3044 =\\u51FA\\u751F\\u65E5\\u671F\\u4E0D\\u80FD\\u4E3A\\u7A7A\\uFF01\n" +
                "CI3045 =\\u82F1\\u6587\\u73B0\\u5C45\\u5730\\u5740\\u4E0D\\u80FD\\u4E3A\\u7A7A\\uFF01\n" +
                "CI3046 =\\u82F1\\u6587\\u57CE\\u5E02\\u4E0D\\u80FD\\u4E3A\\u7A7A\\uFF01\n" +
                "CI3047 =\\u51FA\\u751F\\u65E5\\u671F\\u4E0D\\u80FD\\u665A\\u4E8E\\u7CFB\\u7EDF\\u65E5\\u671F\\uFF01\n" +
                "CI3048 =\\u4E2D\\u6587\\u59D3\\u540D\\u683C\\u5F0F\\u9519\\u8BEF\\uFF01\n" +
                "CI3049 =\\u82F1\\u6587\\u59D3\\u540D\\u683C\\u5F0F\\u9519\\u8BEF\\uFF01\n" +
                "CI3050 =\\u82F1\\u6587\\u5730\\u5740\\u683C\\u5F0F\\u9519\\u8BEF\\uFF01\n" +
                "CI3051 =\\u82F1\\u6587\\u57CE\\u5E02\\u683C\\u5F0F\\u9519\\u8BEF\\uFF01\n" +
                "CI3052 =\\u53D7\\u76CA\\u4EBA\\u4FE1\\u606F\\u4E0D\\u5168\\uFF01\n" +
                "CI3053 =\\u53D7\\u76CA\\u4EBA\\u8BC1\\u4EF6\\u5DF2\\u8FC7\\u671F\\uFF01";
        System.out.println(s);
        //System.out.println(s+" --的unicode编码是："+gbEncoding(s));
        //System.out.println(gbEncoding(s) + " --转换成中文是："+decodeUnicode(gbEncoding(s)));
        
        //System.out.println(gbEncoding(s) + " --转换成中文是："+decodeUnicode("\u7b80\u4ecb"));
    }


}
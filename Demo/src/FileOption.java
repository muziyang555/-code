import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liyangbd on 2018/6/2.
 */
public class FileOption {
    public static void main(String[] args) throws Exception {
        // 需要处理数据的文件位置
        FileReader fileReader = new FileReader(new File("E:\\tt.txt"));
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Map<String, String> map = new HashMap<String, String>();
        String readLine = null;
        int i = 0;

        while ((readLine = bufferedReader.readLine()) != null) {
            // 每次读取一行数据，与 map 进行比较，如果该行数据 map 中没有，就保存到 map 集合中
            if (!map.containsValue(readLine)) {
                map.put("key" + i, readLine);
                i++;
            }
        }

        for (int j = 0; j < map.size(); j++) {
            System.out.println(map.get("key" + j));
        }
    }
}

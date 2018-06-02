import javax.swing.*;

/**
 * Created by liyang on 2018/3/7.
 */
public class DBKeytoDesc {
    public static void main(String[] args) {
//        String inputValue = JOptionPane.showInputDialog("请输入字段名");
//        System.out.println(inputValue);
//
        Object[] opt = {"01","02"};
        Integer option = JOptionPane.showOptionDialog(null,"请选择","选择框",JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,opt,opt[1]);
        String strOption = option.toString();
        System.out.println(strOption);
    }
}

/**
 * Created by liyang on 2018/1/24.
 */
public class Table {
    //表名
    private String table_name;
    //表描述
    private String table_desc;
//    列名
    private String col_name;
//    数据类型
    private String data_type;
//    数据长度
    private String data_length;
//    列描述
    private String col_desc;
//    是否必输
    private String null_bale;
//    主键
    private String pk;
//    索引
    private String index;
//    索引对应列名
    private String index_col_name;
//    处理number引入两个参数
    private String data_precision;
    private String data_scale;

    @Override
    public String toString() {
        return "Table{" +
                "table_name='" + table_name + '\'' +
                ", table_desc='" + table_desc + '\'' +
                ", col_name='" + col_name + '\'' +
                ", data_type='" + data_type + '\'' +
                ", data_length='" + data_length + '\'' +
                ", col_desc='" + col_desc + '\'' +
                ", null_bale='" + null_bale + '\'' +
                ", pk='" + pk + '\'' +
                ", index='" + index + '\'' +
                ", index_col_name='" + index_col_name + '\'' +
                ", data_precision='" + data_precision + '\'' +
                ", data_scale='" + data_scale + '\'' +
                '}';
    }

    public String getTable_name() {
        return table_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public String getTable_desc() {
        return table_desc;
    }

    public void setTable_desc(String table_desc) {
        this.table_desc = table_desc;
    }

    public String getCol_name() {
        return col_name;
    }

    public void setCol_name(String col_name) {
        this.col_name = col_name;
    }

    public String getData_type() {
        return data_type;
    }

    public void setData_type(String data_type) {
        this.data_type = data_type;
    }

    public String getData_length() {
        return data_length;
    }

    public void setData_length(String data_length) {
        this.data_length = data_length;
    }

    public String getCol_desc() {
        return col_desc;
    }

    public void setCol_desc(String col_desc) {
        this.col_desc = col_desc;
    }

    public String getNull_bale() {
        return null_bale;
    }

    public void setNull_bale(String null_bale) {
        this.null_bale = null_bale;
    }

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getIndex_col_name() {
        return index_col_name;
    }

    public void setIndex_col_name(String index_col_name) {
        this.index_col_name = index_col_name;
    }

    public String getData_precision() {
        return data_precision;
    }

    public void setData_precision(String data_precision) {
        this.data_precision = data_precision;
    }

    public String getData_scale() {
        return data_scale;
    }

    public void setData_scale(String data_scale) {
        this.data_scale = data_scale;
    }
    //    Table(String table_name,String table_desc,String col_name,String data_type,String col_desc){
//        this.table_name = table_name;
//        this.table_desc = table_desc;
//        this.col_name = col_name;
//        this.data_type = data_type;
//        this.col_desc = col_desc;
//
//    };
}

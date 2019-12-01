package com.muheda.udf;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.json.JSONObject;

public class BaseFieldUDF extends UDF {


    public static void main(String[] args) {

        String line = "1541217850324|{\"cm\":{\"mid\":\"m7856\",\"uid\":\"u8739\",\"ln\":\"-74.8\",\"sv\":\"V2.2.2\",\"os\":\"8.1.3\",\"g\":\"P7XC9126@gmail.com\",\"nw\":\"3G\",\"l\":\"es\",\"vc\":\"6\",\"hw\":\"640*960\",\"ar\":\"MX\",\"t\":\"1541204134250\",\"la\":\"-31.7\",\"md\":\"huawei-17\",\"vn\":\"1.1.2\",\"sr\":\"O\",\"ba\":\"Huawei\"},\"ap\":\"weather\",\"et\":[{\"ett\":\"1541146624055\",\"en\":\"display\",\"kv\":{\"goodsid\":\"n4195\",\"copyright\":\"ESPN\",\"content_provider\":\"CNN\",\"extend2\":\"5\",\"action\":\"2\",\"extend1\":\"2\",\"place\":\"3\",\"showtype\":\"2\",\"category\":\"72\",\"newstype\":\"5\"}},{\"ett\":\"1541213331817\",\"en\":\"loading\",\"kv\":{\"extend2\":\"\",\"loading_time\":\"15\",\"action\":\"3\",\"extend1\":\"\",\"type1\":\"\",\"type\":\"3\",\"loading_way\":\"1\"}},{\"ett\":\"1541126195645\",\"en\":\"ad\",\"kv\":{\"entry\":\"3\",\"show_style\":\"0\",\"action\":\"2\",\"detail\":\"325\",\"source\":\"4\",\"behavior\":\"2\",\"content\":\"1\",\"newstype\":\"5\"}},{\"ett\":\"1541202678812\",\"en\":\"notification\",\"kv\":{\"ap_time\":\"1541184614380\",\"action\":\"3\",\"type\":\"4\",\"content\":\"\"}},{\"ett\":\"1541194686688\",\"en\":\"active_background\",\"kv\":{\"active_source\":\"3\"}}]}";

        String evaluate = evaluate(line, "mid,uid,vc,vn,l,sr,os,ar,md,ba,sv,g,hw,nw,ln,la,t");

        System.out.println(evaluate);


    }


    /**
     *
     * @desc 将一列数据分割成对列数据
     * @param line
     * @param jsonkeyString
     * @return
     */
    public static String evaluate(String line, String jsonkeyString){


        /**
         * 准备一个StringBuilder
         */
        StringBuilder sb = new StringBuilder();

        String[] jsonKeys = jsonkeyString.split(",");

        /**
         * 取出真实的日志数据
         */
        String[] logContents = line.split("\\|");

        JSONObject jsonObject = new JSONObject(logContents[1]);

        try {

            /**
             * 取出日志结构中的基础数据
             */
            JSONObject base = jsonObject.getJSONObject("cm");


            for (int i = 0; i < jsonKeys.length; i++) {

                String fieldName = jsonKeys[i].trim();

                if (base.has(fieldName)) {
                    sb.append(base.get(fieldName)).append("\t");
                } else {
                    sb.append("\t");
                }
            }

            /**
             * 将所有的事件信息作为作为一个String
             */
            sb.append(jsonObject.getString("et")).append("\t");
            /**
             * 将时间追加在最后
             */
            sb.append(logContents[0]).append("\t");


        }catch (Exception ex){
            ex.printStackTrace();
        }

        return  sb.toString();
    }




}

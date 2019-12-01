package com.muheda.udtf;


import com.sun.org.apache.regexp.internal.RE;
import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDTF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;
import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc 自定义UDTF数据，将列转成多列
 */
public class EventJsonUDTF extends GenericUDTF {


    @Override
    /**
     * 指定输出参数的名称参数类型
     */
    public StructObjectInspector initialize(StructObjectInspector argOIs) throws UDFArgumentException {

        List<String> fieldNames = new ArrayList<String>();
        List<ObjectInspector> fieldOIs = new ArrayList<>();

        fieldNames.add("event_name");
        fieldOIs.add(PrimitiveObjectInspectorFactory.javaStringObjectInspector);

        fieldNames.add("event_json");
        fieldOIs.add(PrimitiveObjectInspectorFactory.javaStringObjectInspector);

        return ObjectInspectorFactory.getStandardStructObjectInspector(fieldNames,fieldOIs);


    }

    @Override
    public void process(Object[] objects) throws HiveException {
        /**
         * 输入一条数据，输出若干条结果
         */
        String input = objects[0].toString();

        if(null == input || input.isEmpty()){
            return;
        }else {

            /**
             * 获取到每一个事件
             */
            JSONArray jsonArray = new JSONArray(input);

            if (jsonArray == null){
                return;
            }

            for (int i = 0; i < jsonArray.length(); i++) {

                String[] result = new String[2];

                try{
                    /**
                     * 取出该事件的名称
                     */
                    result[0] = jsonArray.getJSONObject(i).getString("en");

                    /**
                     * 取出每一个事件整体
                     */
                    result[1] = jsonArray.getString(i);

                }catch (Exception e) {
                    e.printStackTrace();
                }

                forward(result);
            }




        }


    }

    @Override
    public void close() throws HiveException {



    }
}

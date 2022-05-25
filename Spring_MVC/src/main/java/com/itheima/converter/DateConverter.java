package com.itheima.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {
    public Date convert(String source) {
        //将日期字符串转换成日期对象返回
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try{
            date = format.parse(source);
        }catch (ParseException e){
            e.printStackTrace();
        }
        return date;
    }
}

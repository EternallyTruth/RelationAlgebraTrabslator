package com.antlr;

import com.sun.rowset.internal.Row;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * @author 周飞
 * @date 2018/12/30 20:01
 */
public class Table {
    private String name;                                       //表的名字
    private ArrayList<String> attributes;                      //关系表的属性列表，只考虑名字

    public Table(String aName,ArrayList<String> attrList){
        name=aName;
        attributes = attrList;
    }
    //添加属性
    public boolean addAttribute(String attributeName){
        getAttributes().add(attributeName);
        return true;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<String> attributes) {
        this.attributes = attributes;
    }
}

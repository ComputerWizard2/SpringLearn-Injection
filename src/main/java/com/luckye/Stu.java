package com.luckye;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
public class Stu {

    private String[] cource;
    private List<String> list;
    private Map<String,String> map;
    private Set<String> set;
    private List<Cource> cources;

}

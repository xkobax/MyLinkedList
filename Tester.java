package com.ciklum.study.listtry;


public class Tester {

    public static void main(String[] args) {
        MyList<String> list = new MyList<String>();
        list.add("kozak1");
        list.add("kozak2");
        list.add("kozak3");
        list.add("kozak4");
        list.add("kozak5");
        list.add("semen6");
        list.add("kozak7");
        list.add("kozak8");
        list.add("kozak9");
        list.add("kozak10");
        list.add("kozak11");
        System.out.println("\n" + list.get(3));

    }
}

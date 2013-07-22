package com.ciklum.study.listtry;

public class Tester {

    public static void main(String[] args) {
        MyList<String> list = new MyList<String>();
        MyList.MyIterator it = list.iterator(0);
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
        list.remove(8);
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}

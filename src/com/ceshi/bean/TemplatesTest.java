package com.ceshi.bean;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Wzjz
 * @create 2021-06-06-23:49
 */
public class TemplatesTest {

    //模板6: prsf :可生成private static final
    //private static final Custon cust = new Custon();

    //变形:psf
    public static final int NUM = 1;

    //变形：psfi
    public static final int is = 10;

    //变形：psfs
    public static final String Nation = "china";

    //模板1:main  (psvm)
    public static void main(String[] args) {


        //模板2:输出 (sout)
        System.out.println("hello");
        //变行：soutp/soutm/soutv/xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        int num1 = 10;
        int num2 = 29;
        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);
        System.out.println(num1);


        //模板3:fori
        String[] arr = new String[]{"Tom","JERRY","XJ","sk"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形:iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板4：List.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(213);
        list.add(12421);
        for (Object o : list) {
            
        }
        //变形；list.fori,从头到尾
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形：list.forr，倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }


    }
    public void mehtod(){
        System.out.println("TemplatesTest.mehtod");

        //模板5:ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(213);
        list.add(12421);

        if (list == null) {

        }
        //变形:inn
        if (list != null) {
            
        }
        //变形：xxx.nn / xxx.null
        if (list != null) {

        }
        if (list == null) {

        }


    }

}

package Strings;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class basic {
    public static void main(String[] args) {
        String s="abi";
        String s1="abi";
        System.out.println(s==s1);

        String s2=new String("abi");
        System.out.println(s1==s2);
        s2=s2.intern();
        System.out.println(s1==s2);


        //charAT()
        System.out.println(s.charAt(0));
        //System.out.println(s.charAt(s.length()));

        //compareTo()
        String a1="hello";
        String a2="Hello";
        System.out.println(a1.compareTo(a2));

        //concat() vs +
        System.out.println(a1+a2);
        System.out.println(s1.concat(a2));
        System.out.println(a1.concat(""));

        //contains()
        System.out.println(a1.contains("hello"));
        System.out.println(a1.contains(""));

        //endswith()
        System.out.println(a1.endsWith("o"));

        //equals()
        System.out.println(a1.equals(a2));

        //equalsIgnoreCase()
        System.out.println(s1.equalsIgnoreCase(a2));

        //format() as same as printf() in c
        String a4=String.format("%d",101);
        System.out.println(a4);

        //getByes()
        byte b[]=a1.getBytes();
        System.out.println(Arrays.toString(b));

        //getChars()
        String a6="this is fucking awesome";
        char ch[]=new char[10];
        a6.getChars(9,16,ch,0);
        System.out.println(Arrays.toString(ch));

        //indexOf()
        System.out.println(a6.indexOf("fucking"));
        System.out.println(a6.indexOf("some",10));
        System.out.println(a6.indexOf('e'));
        System.out.println(a6.indexOf(5,'e'));

        //lastIndexOf()
        System.out.println(a6.lastIndexOf("e"));
        System.out.println(a6.lastIndexOf("some",10));
        System.out.println(a6.lastIndexOf('e'));
        System.out.println(a6.lastIndexOf(5,'e'));

        //intern() change a new keyword STring to literal
        String a7=new String("lol");
        a7=a7.intern();
        System.out.println(a7);

        //isEmpty()
        System.out.println(a7.isEmpty());

        //join() delimits every string with given delimiter
        a6=a6.join("-",a6,"bharath");
        System.out.println(a6);

        //length()
        System.out.println(a6.length());

        //replace() replace all old char with new chars  :::note:regex is not allowed
        System.out.println(a6.replace("e",""));

        //replaceALl() regex and string is allowed
        System.out.println(a6.replaceAll(".*",""));
        System.out.println(a6.replaceFirst(".*",""));
        //split(); uses regex
        String arr[]=s1.split("");
        System.out.println(Arrays.toString(arr));

        //startsWith()
        System.out.println(s1.startsWith("a"));

        //substring
        System.out.println(a1.substring(0,3));

        //toCharArray()
        char ch3[]=a1.toCharArray();
        System.out.println(Arrays.toString(ch3));

        //toUpperCase() and toLowerCase
        System.out.println(s1.toLowerCase()+" "+s1.toUpperCase());

        //trim()
        String a8="   abishek    ";
        System.out.println(a8.trim());

        //indexOf()
        int m=10;
        String a9= String.valueOf(m);
        System.out.println(a9);

    }
}

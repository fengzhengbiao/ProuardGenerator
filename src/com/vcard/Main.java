package com.vcard;

public class Main {
    public static void main(String[] args) {
//        ChineseProguard.start();
        new SpecificCharacterProguard("dict2019.txt", "算撒顶火箭萨蒂Sadi请我卡萨丁第四ui请问".toCharArray()).start();
//        new SpecificCharacterProguard("dict.txt", '0','6', '8', '9','q', 'o',  'p', 'd','b').start();
    }
}

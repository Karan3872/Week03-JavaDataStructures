package com.tit.day0405searchingreadingstringtype.stringbuilder.reversestring;

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sb = sc.next();

        System.out.println( ReverseString.reverse(sb));

    }
}
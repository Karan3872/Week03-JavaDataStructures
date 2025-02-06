package com.tit.day0405searchingreadingstringtype.stringbuilder.reversestring;

class ReverseString {

        public static String reverse(String sb){

            StringBuilder s = new StringBuilder();
            s.append(sb);
            s.reverse();

            return s.toString();
        }

}

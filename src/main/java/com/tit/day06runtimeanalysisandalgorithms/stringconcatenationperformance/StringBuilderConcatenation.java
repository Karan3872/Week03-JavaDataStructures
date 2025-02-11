package com.tit.day06runtimeanalysisandalgorithms.stringconcatenationperformance;

// Creating a class for StringBuilder concatenation
public class StringBuilderConcatenation {
    // Method to concatenate strings using StringBuilder
    public void concatenateWithStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
    }
}
package com.tit.day02stackqueueandhashing.stackandqueue.stockspanproblem;

public class Main {

    public static void main(String[] args) {
        // Array of stock prices
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        // Array to store the spans
        int[] spans = new int[prices.length];

        // Calculate spans for the given prices
        stockSpan.calculateSpan(prices, spans);

        // Print the stock prices
        System.out.println("Prices: ");
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println("\nSpans: ");
        // Print the spans for each day
        for (int span : spans) {
            System.out.print(span + " ");
        }
    }
}

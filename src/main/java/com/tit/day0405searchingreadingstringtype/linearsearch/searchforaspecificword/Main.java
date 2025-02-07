package com.tit.day0405searchingreadingstringtype.linearsearch.searchforaspecificword;

import java.util.Scanner;

// Creating a class Problem2 to demonstrate the usage of LinearSearch class
public class Main
{
    public static void main(String[] args) {
        // Example array of sentences for testing
        String[] sentences = {
                "The quick brown fox jumps over the lazy dog.",
                "Java is a popular programming language.",
                "Artificial Intelligence is the future.",
                "I enjoy coding and solving problems."
        };

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // enter the word to search for
        System.out.print("Enter the word to search for: ");

        // Read the input word
        String word = sc.nextLine();

        // Find and print the first sentence containing the specific word
        String result = LinearSearch.findFirstSentenceContainingWord(sentences, word);
        System.out.println("The first sentence containing the word '" + word + "': " + result);
    }
}

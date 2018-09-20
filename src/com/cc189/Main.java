package com.cc189;

import com.cc189.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // test IsUnique
        testIsUnique();
        //test CheckPermutation
        testCheckPermutation();
        //test PalindromePermutation
        testCheckPalindromePermutation();
        //test OneAway
        testOneAway();
        //test StringCompression
        testStringCompression();
        //test RotateMatrix
        testRotateMatrix();
        //test MyLinkedList
        testMyLinkedList();
        //test KthToLast
        testKthToLast();
        //test Partition
        testPartition();
        //test SumLists
        testSumLists();
        //test Palindrome
        testLLPalindrome();
        //test MultiStack
        testMultiStack();
        //test QueueViaStacks
        testQueueViaStacks();
        //test TripleStep
        testTripleStep();
        //test RobotInAGrid
        testRobotInAGrid();
    }

    private static void testIsUnique() {
        String[] inputs = {"a", "abc", "abb"};
        boolean[] results = {true, true, false};
        IsUnique isUnique = new IsUnique();
        for (int i = 0; i < inputs.length; i++) {
            boolean result = isUnique.isUniqueCars(inputs[i]);
            assert result == results[i];
        }
    }

    private static void testCheckPermutation() {
        String[] inputsOne = {"a", "abc", "abb", "acc"};
        String[] inputsTwo = {"a", "cba", "bab", "abc"};
        boolean[] results = {true, true, true, false};
        CheckPermutation checkPermutation = new CheckPermutation();
        for (int i = 0; i < inputsOne.length; i++) {
            boolean result = checkPermutation.isPermutation(inputsOne[i], inputsTwo[i]);
            assert result == results[i];
        }
    }

    private static void testCheckPalindromePermutation() {
        String[] inputs = {"a", "abcba", "accbb", "aaabbb"};
        boolean[] results = {true, true, true, false};
        PalindromePermutation palindromePermutation = new PalindromePermutation();
        for (int i = 0; i < inputs.length; i++) {
            boolean result = palindromePermutation.isPalindromePermutation(inputs[i]);
            assert result == results[i];
            boolean newResult = palindromePermutation.isPalindromePermutationByBits(inputs[i]);
            assert  newResult == results[i];
        }
    }

    private static void testOneAway() {
        String[] inputs1 = {"a", "abc", "abcd", "abcde", "abcdef"};
        String[] inputs2 = {"b", "abcd", "abc", "abcdf", "abedcf"};
        boolean[] results = {true, true, true, true, false};
        OneAway oneAway = new OneAway();
        for (int i = 0; i < inputs1.length; i++) {
            boolean result = oneAway.oneEditAway(inputs1[i], inputs1[i]);
            assert result == results[i];
        }
    }

    private static void testStringCompression() {
        String[] inputs = {"aabbccddd", "abcde"};
        String[] results = {"a2b2c2d3", "abcde"};
        StringCompression stringCompression = new StringCompression();
        for (int i = 0; i < inputs.length; i++) {
            String result = stringCompression.stringCompression(inputs[i]);
            assert result.equals(results[i]);
        }
    }

    private static void testRotateMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        RotateMatrix rotateMatrix = new RotateMatrix();
        rotateMatrix.rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void testMyLinkedList() {
        MyLinkedList myLinkedList = new MyLinkedList(33);
        MyNode head = myLinkedList.getHead();
        // System.out.print(head.getData());
        // System.out.println();
        myLinkedList.addToEnd(99);
        myLinkedList.addToStart(3);
        // myLinkedList.printAllNodes();
        // System.out.print(myLinkedList.getLength());
        // System.out.println();
    }

    private static void testKthToLast() {
        MyLinkedList myLinkedList = new MyLinkedList(33);
        myLinkedList.addToEnd(99);
        myLinkedList.addToEnd(333);
        myLinkedList.addToEnd(9999);
        KthToLast kthToLast = new KthToLast();
        int k = kthToLast.printKthToLast(myLinkedList.getHead(), 2);
        MyNode node = kthToLast.kthToLast(myLinkedList.getHead(), 2);
        // System.out.print(node.getData());
        // System.out.println();
        MyNode nodeTwo = kthToLast.kthToLastTwo(myLinkedList.getHead(), 2);
        assert node.getData().equals(nodeTwo.getData());
    }

    private static void testPartition() {
        MyLinkedList myLinkedList = new MyLinkedList(33);
        myLinkedList.addToEnd(99);
        myLinkedList.addToEnd(3);
        myLinkedList.addToEnd(18);
        // myLinkedList.printAllNodes();
        Partition partition = new Partition();
        MyNode node = partition.partition(myLinkedList, 33);
        MyLinkedList ll = new MyLinkedList(node);
        // ll.printAllNodes();
    }

    private static void testSumLists() {
        SumLists sumLists = new SumLists();
        MyLinkedList list1 = new MyLinkedList(5);
        MyLinkedList list2 = new MyLinkedList(6);
        list1.addToEnd(1);
        list1.addToEnd(6);
        list2.addToEnd(3);
        list2.addToEnd(9);
        MyNode result1 = sumLists.sumLists(list1.getHead(), list2.getHead(), 0);
        MyLinkedList results1 = new MyLinkedList(result1);
        // results1.printAllNodes();

        list1.addToEnd(9);
        MyNode result2 = sumLists.addLists(list1, list2);
        MyLinkedList results2 = new MyLinkedList(result2);
        results2.printAllNodes();
    }

    private static void testLLPalindrome() {
        MyLinkedList testList = new MyLinkedList(1);
        testList.addToEnd(0);
        testList.addToEnd(3);
        testList.addToEnd(3);
        testList.addToEnd(0);
        testList.addToEnd(1);
        Palindrome palindrome = new Palindrome();
        assert palindrome.isPalindrome(testList);
    }

    private static void testMultiStack() {
        MultiStack multiStack = new MultiStack(3, 10);
    }

    private static void testQueueViaStacks() {
        QueueViaStacks queueViaStacks = new QueueViaStacks();
        queueViaStacks.add(1);
        queueViaStacks.add(2);
        queueViaStacks.add(3);
        System.out.print(queueViaStacks.peek());
        System.out.print(queueViaStacks.remove());
        System.out.print(queueViaStacks.peek());
        System.out.println();
    }

    private static void testTripleStep() {
        TripleStep tripleStep = new TripleStep();
        assert tripleStep.countWays(3) == 6;
    }

    private static void testRobotInAGrid() {
        RobotInACrid robotInACrid = new RobotInACrid();
        boolean[][] matrix = {{true, true}, {false, true}, {true, true}};
        System.out.print(robotInACrid.getPath(matrix));
    }
}

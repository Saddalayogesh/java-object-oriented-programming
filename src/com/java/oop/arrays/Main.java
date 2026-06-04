package com.java.oop.arrays;

public class Main {
        public static void main(String[] args) {
            int[] ids;
            ids = new int[5];

            System.out.println(ids[0]);

            ids[0] = 101;
            ids[1] = 102;
            ids[2] = 103;
            ids[3] = 104;
            ids[4] = 105;

            System.out.println(ids[2]);

            for (int i = 0; i < ids.length; i++) {
                System.out.println(ids[i]);
            }

            for (int id : ids) {
                System.out.println(id);
            }

            for (int i = 0; i < ids.length; i++) {
                ids[i] += 10000;
            }

            System.out.println("After updating ids:");
            for (int id : ids) {
                System.out.println(id);
            }

            char[] chs = {'a', 'b', 'c', 'd', 'e'};

            for (int i = 0; i < chs.length; i++) {
                System.out.println(chs[i]);
            }

            for (char ch : chs) {
                System.out.println(ch);
            }
        }
    }

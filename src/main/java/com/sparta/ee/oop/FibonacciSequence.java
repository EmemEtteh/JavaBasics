package com.sparta.ee.oop;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class FibonacciSequence {

        public static final int COUNTNUMBER = 8;

        public static int getPosition(int positionToFind) {

           // positionToFind = COUNTNUMBER;

            if (positionToFind == 0) {
                return 0;
            } else if (positionToFind == 1) {
                return 1;
            } else if (positionToFind >= 2){
                return getPosition(positionToFind - 1) + getPosition(positionToFind - 2);
            } else {
                return -1;
            }
        }

//        public static ArrayList<Integer> makeFibonacci(int count) {
//
//            count = COUNTNUMBER;
//
//            int positionOne = 0;
//            int positionTwo = 0;
//            int positionThree = 0;
//            ArrayList<Integer> fibonacciSequenceArray = new ArrayList<>();
//
//            if (count>0) {
//                positionThree = positionOne + positionTwo;
//                positionOne = positionTwo;
//                positionTwo = positionThree;
//
//                fibonacciSequenceArray.add(0, positionOne);
//                fibonacciSequenceArray.add(1, positionTwo);
//
//            }
//                //fibonacciSequenceArray.add(2, positionThree);
//
//            for (int i = 2; i < count; i++) {
//                int numberFromFib = 0;
//                numberFromFib = getPosition(count);
//                fibonacciSequenceArray.add(i, numberFromFib );
//            }
//
//            return fibonacciSequenceArray;
//
//        }

        public static ArrayList<Integer> fibonacciIterator(int count) {

            ArrayList<Integer> fibonacciSequenceArray = new ArrayList<>();



//            count = COUNTNUMBER;
//            int number = 0;
//            int firstNumber = 0;
//            int secondNumber = 1;

            //fibonacciSequenceArray.add(firstNumber);
            //fibonacciSequenceArray.add(secondNumber);

            for (int i = 0; i < count; i++) {
//                if (i <=1) {
//                    number = i;
//                } else {
//                    number = firstNumber + secondNumber;
//                    firstNumber = secondNumber;
//                    secondNumber = number;
//                }
                fibonacciSequenceArray.add(getPosition(i));
            }
            return fibonacciSequenceArray;
        }

        public static void main(String[] args) {

          //  System.out.println(getPosition());
        }
}

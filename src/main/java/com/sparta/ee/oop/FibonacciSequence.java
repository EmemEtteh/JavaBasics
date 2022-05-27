package com.sparta.ee.oop;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class FibonacciSequence {

        public static int getPosition(int positionToFind) {
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

    /*    public static ArrayList<Integer> makeFibonacci(int count) {

            //count = getPosition(3);

            int positionOne = 0;
            int positionTwo = 0;
            int positionThree = 0;
            ArrayList<Integer> fibonacciSequenceArray = new ArrayList<>();

            if (count>0) {
                positionThree = positionOne + positionTwo;
                positionOne = positionTwo;
                positionTwo = positionThree;

                fibonacciSequenceArray.add(0, positionOne);
                fibonacciSequenceArray.add(1, positionTwo);

            }
                //fibonacciSequenceArray.add(2, positionThree);

                for (int i = 2; i < fibonacciSequenceArray.size(); i++) {
                    fibonacciSequenceArray makeFibonacci(count-2);
                }



        } */

        public static void main(String[] args) {

          //  System.out.println(getPosition());
        }
}

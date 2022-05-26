package com.sparta.ee.oop;

import javax.sound.midi.Soundbank;

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

    /*    public static int[] makeFibonacci() {

        }
    */
        public static void main(String[] args) {

          //  System.out.println(getPosition());
        }
}

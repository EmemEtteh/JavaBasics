package com.sparta.ee;


public class App 
{
    public static void main( String[] args ) {
        int timeOfDay = 10; //Strongly typed, Statically typed
        String welcomeMessage = greeting(timeOfDay);
        System.out.println(welcomeMessage);
    }

    public static String greeting(int timeOfDay) {
        String message;
        if ( (timeOfDay >= 5 && timeOfDay <= 11) || (timeOfDay >= 0 && timeOfDay <=4) ){
            message = "Good Morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            message = "Good Afternoon";
        } else if (timeOfDay >= 19 && timeOfDay <= 23) {
            message = "Good Evening";
        } else {
            message = "You're in another dimension";
        }
        return message;
    }
}

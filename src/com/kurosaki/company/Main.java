package com.kurosaki.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int switchValue = 2;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, 5");
                break;
        }

        char charValue = 'E';
        switch (charValue){
            case 'A':
                System.out.println("It is A");
                break;
            case 'B':
                System.out.println("It is B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("It is " + charValue);
                break;
            default:
                System.out.println("It is not A, B, C, D, E");
                break;
        }

        String month = "FEBRUARY";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("It is January");
                break;
            case "february":
                System.out.println("It is February");
                break;
            default:
                System.out.println("Not found");
        }
    }
}

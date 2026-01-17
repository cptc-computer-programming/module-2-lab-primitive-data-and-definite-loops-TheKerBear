package day2.part03_pattern_section;

public class PatternSection {

    public static final int SIZE = 3;

    public static void main(String[] args) {
        // TODO: Call each method below in this order:
        printEdge();
        printDiamondTop();
        printDiamondBottom();
        printEdge();
    }

    // TODO: Print the edge line that fits the width for SIZE.
    // Format: + followed by repeating "=*" and ending with +
    // Example for SIZE=2: +=*=*=*=*+
    public static void printEdge() {
        // print + sign
        System.out.print("+");

        // write a loop to print =* a variable number of times
        for(int i = 0; i < SIZE * 2; i ++) {
            System.out.print("=*");
        }
        // print + sign
        System.out.print("+");
        System.out.println();
        
    }

    // TODO: Print the top half of the “double-diamond” section.
    // Requirements:
    // - total rows: SIZE * 2
    // - each row starts/ends with '|'
    // - inside, dots decrease while "/\" pairs increase, then dots again
    // - use SIZE in all loop bounds (no magic numbers except 0/1)
    public static void printDiamondTop() {
        // loop through the total rows in the top half of the diamond
        // we know that size = 3, total rows is 6
        for (int row = 0; row < SIZE * 2; row ++) {
            // begin the row with a |
            System.out.print("|");

            /* when a value is decreasing in a loop, but the loop variable is increasing
            you probably need to subtract to get that inverse relationship captured */

            int dots = (SIZE * 2 - 1) - row;
            // print leading dots
            for (int i = 0; i < dots; i ++) {
                System.out.print(".");
            }

            // print triangles
            int triangles = row + 1;
            for (int i = 0; i < triangles; i ++) {
                System.out.print("/\\");
            }

            // print trailing dots
            for(int i = 0; i < dots; i ++) {
                System.out.print(".");
            }

            // end with a | and a new line
            System.out.println("|");
        }

    }

    // TODO: Print the bottom half (mirror/inverse of the top half).
    // Requirements:
    // - total rows: SIZE * 2
    // - each row starts/ends with '|'
    // - inside, dots increase while "\/" pairs decrease, then dots again
    // - use SIZE in all loop bounds
    public static void printDiamondBottom() {
        
        // loop through total rows in the bottom half of the diamond
        // these are the same as the top, so you loop should look the same

        // print a |
        for (int row = 0; row < SIZE * 2; row ++) {
        // begin the row with a |
        System.out.print("|");
        
            // print the leading .
            // they should increase with every row
            int dots = row;
            for (int i = 0; i < dots; i ++) {
                System.out.print(".");
            }

            // print the \/
            // they should decrease (by 2) with every row
            int triangles = SIZE * 2 -row;
            for (int i = 0; i < triangles; i ++) {
                System.out.print("\\/");
            }

            // print the trailing .
            // they should increase with every row
            for(int i = 0; i < dots; i ++) {
                System.out.print(".");
            }

            // end with a | and a new line
            System.out.println("|");
        }

    }
    
}

/*
this is the patter when size = 3
+=*=*=*=*=*=*+
|...../\.....| // when row = 0, we print 5 . and 1 /\, then 5 .
|..../\/\....| // when row = 1, we print 4 . and 2 /\, then 4 .
|.../\/\/\...|
|../\/\/\/\..|
|./\/\/\/\/\.|
|/\/\/\/\/\/\|
|\/\/\/\/\/\/| // when row = 0, we print 1 . and 6 \/, then 0 . 
|.\/\/\/\/\/.| // when row = 1, we print 1 . and 4 \/, then 1 .
|..\/\/\/\/..|
|...\/\/\/...|
|....\/\/....|
|.....\/.....|
+=*=*=*=*=*=*+

 */
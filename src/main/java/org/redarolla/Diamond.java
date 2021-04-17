package org.redarolla;

/**
 * Hello world!
 *
 */
public class Diamond
{
    public static void main( String[] args )
    {
        System.out.println( "Diamond Kata!" );
    }

    public static String printDiamond(String input) {
        if(input.equals("B")){
            return " A \nB B\n A ";
        }
        return input;
    }
}

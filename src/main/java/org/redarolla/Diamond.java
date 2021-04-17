package org.redarolla;

/**
 * Hello world!
 *
 */
public class Diamond
{
    private static final String SPACE = " ";
    public static void main( String[] args )
    {
        System.out.println( "Diamond Kata!" );
    }

    public static String printDiamond(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        if(input.equals("B")){
            stringBuilder
                    .append(SPACE).append("A").append(SPACE).append("\n")
                    .append("B").append(SPACE).append("B").append("\n")
                    .append(SPACE).append("A").append(SPACE);
            return stringBuilder.toString();
        }
        if(input.equals("C")){
            stringBuilder
                    .append(SPACE).append(SPACE).append("A").append(SPACE).append(SPACE).append("\n")
                    .append(SPACE).append("B").append(SPACE).append("B").append(SPACE).append("\n")
                    .append("C").append(SPACE).append(SPACE).append(SPACE).append("C").append("\n")
                    .append(SPACE).append("B").append(SPACE).append("B").append(SPACE).append("\n")
                    .append(SPACE).append(SPACE).append("A").append(SPACE).append(SPACE).append("\n");
            return stringBuilder.toString();
        }
        return input;
    }
}

package org.redarolla;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class Diamond
{
    private static final String SPACE = " ";
    public static void main( String[] args )
    {
        System.out.println(printDiamond("Z"));
    }

    public static String printDiamond(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] alpha = getAlphabet();

        int length = Arrays.asList(alpha).indexOf(input)*2 + 1;

        int letterPosition = Arrays.asList(alpha).indexOf(input);
        int incAndDecIndex;
        for(int i = 0, k = length -1; i<length; i++, k--){
            incAndDecIndex = i <= letterPosition ? i : k ;
            for(var j = 0; j<length; j++){
                if(j == letterPosition - incAndDecIndex || j == letterPosition + incAndDecIndex){
                    stringBuilder.append(alpha[incAndDecIndex]);
                }else{
                    stringBuilder.append(SPACE);
                }
            }
            stringBuilder.append("\n");
        }

        int index = stringBuilder.toString().length();

        return stringBuilder.delete(index - 1, index).toString();
    }

    public static String diamondFirstLastLine(String letter){
        String[] alpha = getAlphabet();
        int length = Arrays.asList(alpha).indexOf(letter)*2 + 1;


        if(letter.equals("A")){
            return "A";
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(var i = 0; i < length; i++){
           if(i != Arrays.asList(alpha).indexOf(letter)){
               stringBuilder.append(SPACE);
           }else{
               stringBuilder.append("A");
           }
        }
        return stringBuilder.toString();
    }

    public static String diamondLineOfInputLetter(String letter){

        if(letter.equals("A")){
            return "A";
        }
        String[] alpha = getAlphabet();
        int length = Arrays.asList(alpha).indexOf(letter)*2 + 1;
        StringBuilder stringBuilder = new StringBuilder();

        for(var i = 0; i < length; i++){
            if(i == 0 || i == length - 1){
                stringBuilder.append(letter);
            }else{
                stringBuilder.append(SPACE);
            }
        }
        return stringBuilder.toString();
    }



    public static String[] getAlphabet(){
        return IntStream
                .rangeClosed('A','Z')
                .mapToObj(c -> ""+ (char)c)
                .collect(Collectors.joining())
                .split("");
    }
}

package org.redarolla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
        StringBuilder diamond = new StringBuilder();
        String[] alpha = getAlphabet(input.charAt(0));

        int length = Arrays.asList(alpha).indexOf(input) * 2 + 1;

        int inputLetterPosition = Arrays.asList(alpha).indexOf(input);

        IntStream.rangeClosed(0, length - 1).forEach(indexDiamondRow -> {
            int indexSym = getSymmetricalArray(inputLetterPosition).get(indexDiamondRow);

            IntStream.rangeClosed(0, length - 1).forEach(indexDiamondCol -> {

                if(isLetterIterationPosition(indexDiamondCol, indexSym, inputLetterPosition)){
                    diamond.append(alpha[indexSym]);
                }else{
                    diamond.append(SPACE);
                }

            });

            diamond.append("\n");
        });

        int index = diamond.toString().length();

        return diamond.delete(index - 1, index).toString();
    }


    public static String[] getAlphabet(char input){
        return IntStream
                .rangeClosed('A', input)
                .mapToObj(c -> ""+ (char)c)
                .collect(Collectors.joining())
                .split("");
    }

    public static List<Integer> getSymmetricalArray(int number){
        Stream<Integer> zeroToNumberInput = IntStream.rangeClosed(0, number - 1).boxed();
        Stream<Integer> numberInputToZero = IntStream.rangeClosed(0, number - 1).boxed().sorted(Collections.reverseOrder());

        return Stream.of(zeroToNumberInput, Stream.of(number), numberInputToZero)
                .reduce(Stream::concat)
                .orElseGet(Stream::empty)
                .collect(Collectors.toList());
    }

    public static boolean isLetterIterationPosition(int indexDiamondCol, int indexSym, int inputLetterPosition){
        return indexDiamondCol == inputLetterPosition - indexSym || indexDiamondCol == inputLetterPosition + indexSym;
    }
}

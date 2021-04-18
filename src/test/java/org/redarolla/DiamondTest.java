package org.redarolla;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

 class DiamondTest
{
    private static final String SPACE =" ";
    @Test
    void givenA_whenPrintDiamond_shouldReturnA()
    {
        //GIVEN
        String input = "A";
        String expectedOutput = "A";

        //WHEN
        String result = Diamond.printDiamond(input);

        //THEN
        assertThat(result).isEqualTo(expectedOutput);
    }

    @Test
    void givenB_whenPrintDiamond_shouldReturnABBA()
    {
        //GIVEN
        String input = "B";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(SPACE).append("A").append(SPACE).append("\n")
                .append("B").append(SPACE).append("B").append("\n")
                .append(SPACE).append("A").append(SPACE);

        String expectedOutput = stringBuilder.toString();

        //WHEN
        String result = Diamond.printDiamond(input);
        System.out.println(result);
        //THEN
        assertThat("\n"+result).isEqualTo("\n"+expectedOutput);
    }

    @Test
    void givenC_whenPrintDiamond_shouldReturnABCCBA()
    {
        //GIVEN
        String input = "C";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(SPACE).append(SPACE).append("A").append(SPACE).append(SPACE).append("\n")
                .append(SPACE).append("B").append(SPACE).append("B").append(SPACE).append("\n")
                .append("C").append(SPACE).append(SPACE).append(SPACE).append("C").append("\n")
                .append(SPACE).append("B").append(SPACE).append("B").append(SPACE).append("\n")
                .append(SPACE).append(SPACE).append("A").append(SPACE).append(SPACE);
        String expectedOutput = stringBuilder.toString();
        //WHEN
        String result = Diamond.printDiamond(input);
        System.out.println(result);
        //THEN
        assertThat("\n"+result).isEqualTo("\n"+expectedOutput);
    }

    @Test
    void givenA_whenDiamondFirstLastLine_shouldReturnLine()
    {
        //GIVEN
        String input = "A";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A");
        String expectedOutput = stringBuilder.toString();
        //WHEN
        String result = Diamond.diamondFirstLastLine(input);
        System.out.println(result);
        //THEN
        assertThat("\n"+result).isEqualTo("\n"+expectedOutput);
    }

    @Test
    void givenB_whenDiamondFirstLastLine_shouldReturnLine()
    {
        //GIVEN
        String input = "B";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SPACE).append("A").append(SPACE);
        String expectedOutput = stringBuilder.toString();
        //WHEN
        String result = Diamond.diamondFirstLastLine(input);
        System.out.println(result);
        //THEN
        assertThat("\n"+result).isEqualTo("\n"+expectedOutput);
    }

    @Test
    void givenC_whenDiamondFirstLastLine_shouldReturnLine()
    {
        //GIVEN
        String input = "C";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SPACE).append(SPACE).append("A").append(SPACE).append(SPACE);
        String expectedOutput = stringBuilder.toString();
        //WHEN
        String result = Diamond.diamondFirstLastLine(input);
        System.out.println(result);
        //THEN
        assertThat("\n"+result).isEqualTo("\n"+expectedOutput);
    }

    @Test
    void givenA_whenDiamondLineOfInputLetter_shouldReturnLineOfInputLetter()
    {
        //GIVEN
        String input = "A";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input);
        String expectedOutput = stringBuilder.toString();
        //WHEN
        String result = Diamond.diamondLineOfInputLetter(input);
        System.out.println(result);
        //THEN
        assertThat("\n"+result).isEqualTo("\n"+expectedOutput);
    }

    @Test
    void givenB_whenDiamondLineOfInputLetter_shouldReturnLineOfInputLetter()
    {
        //GIVEN
        String input = "B";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input).append(SPACE).append(input);
        String expectedOutput = stringBuilder.toString();
        //WHEN
        String result = Diamond.diamondLineOfInputLetter(input);
        System.out.println(result);
        //THEN
        assertThat("\n"+result).isEqualTo("\n"+expectedOutput);
    }

    @Test
    void givenC_whenDiamondLineOfInputLetter_shouldReturnLineOfInputLetter()
    {
        //GIVEN
        String input = "C";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input).append(SPACE).append(SPACE).append(SPACE).append(input);
        String expectedOutput = stringBuilder.toString();
        //WHEN
        String result = Diamond.diamondLineOfInputLetter(input);
        System.out.println(result);
        //THEN
        assertThat("\n"+result).isEqualTo("\n"+expectedOutput);
    }

}

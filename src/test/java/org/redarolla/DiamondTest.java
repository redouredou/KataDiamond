package org.redarolla;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

 class DiamondTest
{

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
        String expectedOutput = " A \nB B\n A ";

        //WHEN
        String result = Diamond.printDiamond(input);
        System.out.println(result);
        //THEN
        assertThat("\n"+result).isEqualTo("\n"+expectedOutput);
    }
}

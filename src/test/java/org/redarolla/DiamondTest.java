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
}

package multibracketvalidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void multiBracketValidation() {

        assertTrue("expect true", MultiBracketValidation.multiBracketValidation("{}"));
        assertTrue("expect true", MultiBracketValidation.multiBracketValidation("{}(){}"));
        assertTrue("expect true", MultiBracketValidation.multiBracketValidation("()[[Extra Characters]]"));
        assertTrue("expect true", MultiBracketValidation.multiBracketValidation("(){}[[]]"));
        assertTrue("expect true", MultiBracketValidation.multiBracketValidation("{}"));
        assertFalse("expect false", MultiBracketValidation.multiBracketValidation("[({}]"));
        assertFalse("expect false", MultiBracketValidation.multiBracketValidation("{(})"));
        assertFalse("expect false", MultiBracketValidation.multiBracketValidation("(]("));
        assertFalse("expect false", MultiBracketValidation.multiBracketValidation("("));
        assertFalse("expect false", MultiBracketValidation.multiBracketValidation("]"));
    }
}
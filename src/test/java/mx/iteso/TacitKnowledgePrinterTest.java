package mx.iteso;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class TacitKnowledgePrinterTest {

    //Test printNumbers with a limit of 10
        //Verify calculate being called 10 times
        //Verify expected result

    //Test printNumbers with a limit of 0o
        //Verify Exception

    //What else can we test?
        //What should we verify?

	private Printer printer;
	
	@Before
	public void setUp() {
		printer = mock(Printer.class);
	}
	
	@Test
	public void printNumbers_10() {
		TacitKnowledgePrinter tacitPrinter = new TacitKnowledgePrinter(printer);
		tacitPrinter.printNumbers(10);
		verify(printer, times(10)).print(anyString());
	}
	
	@Test
	public void printNumbers_0() {
		TacitKnowledgePrinter tacitPrinter = new TacitKnowledgePrinter(printer);
		boolean thrown;
		try {
			tacitPrinter.printNumbers(0);
			thrown = false;
		} catch (RuntimeException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
    
    @Test
    public void calculate_15() {
    	TacitKnowledgePrinter tacitPrinter = new TacitKnowledgePrinter(printer);
    	assertEquals("TacitKnowledge", tacitPrinter.calculate(15));
    }

    @Test
    public void calculate_3() {
    	TacitKnowledgePrinter tacitPrinter = new TacitKnowledgePrinter(printer);
    	assertEquals("Tacit", tacitPrinter.calculate(3));
    }
    
    @Test
    public void calculate_5() {
    	TacitKnowledgePrinter tacitPrinter = new TacitKnowledgePrinter(printer);
    	assertEquals("Knowledge", tacitPrinter.calculate(5));
    }
    
    @Test
    public void calculate_7() {
    	TacitKnowledgePrinter tacitPrinter = new TacitKnowledgePrinter(printer);
    	assertEquals("7", tacitPrinter.calculate(7));
    }
}

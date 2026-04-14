package org.yourcompany.yourproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberAnalyzerTest {

    @Test
    public void testStatementCoverage() {
        NumberAnalyzer analyzer = new NumberAnalyzer();
        
        // Mảng có cả số âm và số dương để chạy qua mọi dòng code
        int[] input = {-1, 5, 10}; 
        
        // Có 2 số dương là 5 và 10, nên kết quả mong đợi là 2
        assertEquals(2, analyzer.countPositiveNumbers(input));
    }
}
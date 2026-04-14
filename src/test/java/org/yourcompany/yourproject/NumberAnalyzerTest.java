package org.yourcompany.yourproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NumberAnalyzerTest {

    @Test
    public void testStatementCoverage() {
        NumberAnalyzer analyzer = new NumberAnalyzer();
        
        // Mảng có cả số âm và số dương để chạy qua mọi dòng code
        int[] input = {-1, 5, 10}; 
        
        // Có 2 số dương là 5 và 10, nên kết quả mong đợi là 2
        assertEquals(2, analyzer.countPositiveNumbers(input));
    }
    
    @Test
    public void testPath_EmptyArray() {
        NumberAnalyzer analyzer = new NumberAnalyzer();
        // Đường đi 1: Mảng rỗng
        int[] input = {}; 
        assertEquals(0, analyzer.countPositiveNumbers(input));
    }

    @Test
    public void testPath_AllNegative() {
        NumberAnalyzer analyzer = new NumberAnalyzer();
        // Đường đi 2: Mảng toàn số âm
        int[] input = {-2, -4, -6}; 
        assertEquals(0, analyzer.countPositiveNumbers(input));
    }
}
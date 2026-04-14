/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

/**
 *
 * @author ADMIN
 */
public class NumberAnalyzer {

    // Phương thức đếm các số dương trong mảng
    public int countPositiveNumbers(int[] numbers) {
        int count = 0;
        
        // Vòng lặp: Duyệt qua từng số trong mảng
        for (int number : numbers) {
            // Rẽ nhánh: Nếu số đó lớn hơn 0 thì tăng biến đếm lên 1
            if (number > 0) {
                count++;
            }
        }
        
        return count;
    }
}

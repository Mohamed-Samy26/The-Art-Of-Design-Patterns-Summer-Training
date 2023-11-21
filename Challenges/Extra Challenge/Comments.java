// public class PayCalculator {
//     public double calculatePay(double hourlyPayRate, double workHours,
//                         double overtimePayRate, double overtimeWorkHours,
//                         boolean isEligibleOvertimeRate) {
//         double totalPay = 0;
//         double regularPay = hourlyPayRate * workHours;
        
//         if (isEligibleOvertimeRate) {
//             double overtimePay = overtimePayRate * overtimeWorkHours;
//             totalPay = regularPay + overtimePay;
//         } else {
//             double overtimePay = hourlyPayRate * overtimeWorkHours;
//             totalPay = regularPay + overtimePay;
//         }
        
//         return totalPay;
//     }
// }

// public class PayCalculator {
//     /**
//      * Function to calculate pay of a specific employee
//      * Parameters:
//      * r: the hourly pay rate
//      * h: the work hours
//      * ovt: the overtime pay rate
//      * ovh: the overtime work hours
//      * e: indicate if employee is eligible for overtime pay
//      * Return: the total amount of pay
//      */
//     public double calculatePay(double r, double h, double ovt, double ovh, boolean e) {
//         // calculate pay for normal working hours
//         double t = r * h;
//         // check if employee is eligible for overtime pay
//         if (e) {
//             // if yes, apply overtime rate
//             t = t + ovt * ovh;
//         } else {
//             // if no, apply normal rate
//             t = t + r * ovh;
//         }
//         // return total pay
//         return t;
//     }

//     public static void main(String[] args) {
//         double hourlyRate = 15.0;
//         double workHours = 40.0;
//         double overtimeRate = 1.5 * hourlyRate;
//         double overtimeHours = 10.0;
//         boolean isEligibleForOvertime = true;

//         double totalPay = calculatePay(hourlyRate, workHours, overtimeRate, overtimeHours, isEligibleForOvertime);
//         System.out.println("Total pay: " + totalPay);
//     }
// }

package Lab3;
import java.util.Date;
import java.util.Scanner;
import java.lang.Math;

public class Lab3_qns1{
        double annualInterestRate, loanAmount;
        int numberofYear;
        java.util.Date date = new Date();
       

        public Lab3_qns1() {
            annualInterestRate = 2.5;
            loanAmount = 1000;
            numberofYear = 1;
        }

        public Lab3_qns1(double annualInterestRate, double loanAmount, int numberofYear, java.util.Date date) {  
            this.annualInterestRate = annualInterestRate;
            this.loanAmount = loanAmount;
            this.numberofYear = numberofYear;
            this.date = date;
        }

        public double getAnnualInterestRate() {  
            return annualInterestRate; 
        }

        public int getNumberOfYears() {  
            return numberofYear;
        }

        public double getLoanAmount() {
            return loanAmount;
        }

        public java.util.Date getLoanDate() {
            return date;
        }

        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }

        public void setNumberOfYears(int numberofYear) {
            this.numberofYear = numberofYear;
        }

        public void setLoanAmount(double loanAmount) {
            this.loanAmount = loanAmount;
        }

        public double getMonthlyPayment() {
            double numerator = this.loanAmount*(this.annualInterestRate/1200);
            double denominator = (1-(1/Math.pow(1+(this.annualInterestRate/1200),numberofYear*12)));
            return numerator/denominator;
        }

        public double getTotalPayment() {
            return this.getMonthlyPayment()*this.numberofYear*12;
        }

        public class loan {
            

            public static void main(String[] args) {

                Lab3_qns1 loan1 = new Lab3_qns1();

                Scanner input = new Scanner(System.in);
                System.out.print("Enter annual interest rate : ");
                double annualInterestRate = input.nextDouble();
                loan1.setAnnualInterestRate(annualInterestRate);

                Scanner input2 = new Scanner(System.in);
                System.out.print("Enter number of years : ");
                int numberofYear = input2.nextInt();
                loan1.setNumberOfYears(numberofYear);

                Scanner input3 = new Scanner(System.in);
                System.out.print("Enter loan amount : ");
                double loanAmount = input3.nextDouble();
                loan1.setLoanAmount(loanAmount);

                System.out.println("The loan was created on " + loan1.date);
                System.out.println("The monthly payment is " + loan1.getMonthlyPayment());
                System.out.println("The total payment is " + loan1.getTotalPayment());
                input.close();
                input2.close();
                input3.close();
            }
        }

       
    
        }



   

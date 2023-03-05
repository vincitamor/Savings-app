import java.util.Scanner;

public class savingsProj {
    public static void main(String [] args) {
        calculateHowMuchToSave(0, 0, 0, 365, 1,
                0, 0, 0);
    }//end main


    public static double calculateHowMuchToSave(int yearDifference, double howMuchToSave, double age, int daysInAYear, int oneYear, int ageGoal,
                                                double amountDesiredToSave, double weeklyAmount) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("How old are you? (Years):\t");
            age = input.nextInt();//takes in user age
            System.out.println();

            System.out.print("Enter the exact amount you make weekly:\t");
            weeklyAmount = input.nextDouble();//takes in weekly income of user
            if(weeklyAmount <= 0) {
                System.out.print("Please enter a valid amount:\t");
                weeklyAmount = input.nextDouble();//takes in weekly income of user

            }//end if

            System.out.println();

            System.out.print("Enter the amount of money you'd like to save:\t");
            amountDesiredToSave = input.nextDouble();
            if (amountDesiredToSave <= 0) {
                System.out.print("Please enter a valid amount:\t");
                amountDesiredToSave = input.nextDouble();
            }//end if

            System.out.println();

            System.out.print("By what age would you like to save that amount?:\t");
            ageGoal = input.nextInt();//takes in user input for desired amount to save
        }
        if (age <= 0) {
            System.out.print("Please enter a valid age:\t");
            return 2;
        }//end if
        if(age > 0) {
            double monthlyAmount = weeklyAmount * 4;//to calculate monthly income
            double goalAge = ageGoal - age;//find age gap room available to save
            double goalAmount = amountDesiredToSave / goalAge;//finds total amount divided by goalAge to find yearly needed savings
            double monthlyGoalAmount = goalAmount / 12;//finds monthly amount needed to save by dividing yearly savings by 12 months
            double yearlyAmountSavings = monthlyGoalAmount * 12;//redeclared variable name to better fit its use

            System.out.println();
            System.out.println("You make " + monthlyAmount + " a month.");

            System.out.println();

            System.out.println("You would need to save " + yearlyAmountSavings + " a year, or " + monthlyGoalAmount + " a month ");
          

        }
        return 2;
        

    }//end calculateHowMuchToSave
    
}
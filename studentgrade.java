import java.util.*;
public class Studentgrade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("            ----------------------------------------");
        System.out.println("                       STUDENT MARK SHEET           ");
        System.out.println("            ----------------------------------------");
        System.out.println("Enter the mark1: ");
        int m1 = sc.nextInt();
        System.out.println("Enter the mark2: ");
        int m2 = sc.nextInt();
        System.out.println("Enter the mark3: ");
        int m3 = sc.nextInt();
        System.out.println("Enter the mark4: ");
        int m4 = sc.nextInt();
        System.out.println("Enter the mark5: ");
        int m5 = sc.nextInt();
        int total = m1+m2+m3+m4+m5;
        System.out.println("The total Marks is "+total);
        float avg = total/5;
        System.out.println("The average is "+avg);
        Studentgrade( total, avg);
        System.out.println();
        System.out.println("            ----------------------------------------");
    }
    public static void Studentgrade(int total,float avg){
        System.out.println("            ----------------------------------------");
        System.out.println("                         STUDENT GRADE              ");
        System.out.println("            ----------------------------------------");
        System.out.println("                TOTAL MARKS : "+total);
        System.out.println("                AVERAGE PERCENTAGE : "+avg+"%");
        if(avg>=90)
        System.out.println("                GRADE = A");
        else if(avg>=80 && avg<90)
        System.out.println("                GRADE = B");
        else if(avg>=70 && avg<80)
        System.out.println("                GRADE = C");
        else if(avg>=60 && avg<70)
        System.out.println("                GRADE = D");
        else if(avg>=50 && avg<60)
        System.out.println("                GRADE = E");
        else
        System.out.println("                GRADE = Fail");
        System.out.println("            ----------------------------------------");
    }
}
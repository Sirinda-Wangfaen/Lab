package ex1;

public class Ex1 {
    public static void main(String[] args) {
        int population=312032486;
        int yearSecond = 365*24*60*60;
        int yearIncreasePop;
        yearIncreasePop = (yearSecond/7)-(yearSecond/13)+(yearSecond/45);
        System.out.println("Year 1: " + (population+(yearIncreasePop*1)));
        System.out.println("Year 2: " + (population+(yearIncreasePop*2)));
        System.out.println("Year 3: " + (population+(yearIncreasePop*3)));
        System.out.println("Year 4: " + (population+(yearIncreasePop*4)));
        System.out.println("Year 5: " + (population+(yearIncreasePop*5)));
    }
}

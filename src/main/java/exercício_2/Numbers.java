package exercício_2;

public class Numbers {

    public boolean isPrime(int number){
        if (number <= 1)
            return false;

        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;

        return true;
    }

    public boolean isEven(int number){
        return (number % 2) == 0;
    }

    public boolean isMultiple(int number, int divisor){
        return number % divisor == 0;
    }
}

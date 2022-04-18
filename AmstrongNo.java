public class AmstrongNo {
    
    public static void main(String[] args) {
        
        int number = 4536 , realnumber, remainder, result = 0 ,n = 0;

        realnumber = number;

        for (;realnumber != 0; realnumber /= 10 , ++n);

        realnumber = number ;

        for (;realnumber != 0; realnumber /= 10 )
        {
            remainder = realnumber % 10 ;
            result += Math.pow (remainder, n);
        }

        if(result == number)
            System.out.println(number + "is Amstrong Number.");

        else
            System.out.println(number + "is not Amstrong Number.");
    }
}

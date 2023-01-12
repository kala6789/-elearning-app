package in.ashokit;

/**
 * Hello world!
 * Testing App and also changing in kala repository
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


        System.out.println("I love Java" + "its very beautiful" + "I am addicted to it");


        //2nd program
        //find the reminder
        int number = 34;
        int reminder = number % 10;

        System.out.println(reminder);

        //prime number



        int number =2;
        int flag = 0;

        if(number == 2)
        {
            System.out.println("prime number");
            System.exit(0);
        }
        else
        {

            for(int i = 2; i < number; i++)
            {
                // System.out.println(i);

                if(number % i == 0)
                {
                    flag = 1;
                }

            }
        }


        if(flag == 0)
        {
            System.out.println("prime number");
        }



    }
}

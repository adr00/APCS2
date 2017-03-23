package March.Assignment6;


import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        boolean go = true;
        String temp;

        while(go)
        {
            System.out.println("Enter a name: ");
            temp = scan.nextLine();
            if(temp.toUpperCase().compareTo("END") == 0)
                go = false;
            else if(temp.toUpperCase().compareTo("END") != 0)
            {
                temp = titleCase(temp);
                names.add(temp);
            }
        }
        System.out.println(names);
    }

    public static String titleCase(String s)
    {
        s = s.toLowerCase();
        s = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();

        return s;
    }
}

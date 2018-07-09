package colect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class Main {

    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
//        Scanner num = new Scanner(System.in);

        
        List<String> list = new ArrayList<>();
        list.add(text.nextLine());
        list.add(text.nextLine());
        list.add(text.nextLine());

for (int i = list.size()-1; i >=0; i--)
        System.out.println(list.get(i));

    }

}

package HomeWork_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaskB_stack {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text[] = reader.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();

        while(!text[0].equals("exit")) {


            switch(text[0]) {
                case "push":
                    list.add(Integer.parseInt(text[1]));
                    System.out.println("ok");
                    break;

                case "pop":
                    if(list.isEmpty()){
                        System.out.println("error");
                    } else {
                        System.out.println(list.remove(list.size() - 1));
                    }
                    break;

                case "back":
                    if(list.isEmpty()){
                        System.out.println("error");
                    } else {
                        System.out.println(list.get(list.size() - 1));
                    }
                    break;

                case "size":
                    System.out.println(list.size());
                    break;

                case "clear":
                    list.clear();
                    System.out.println("ok");
                    break;
            }
            text = reader.readLine().split(" ");
        }
        System.out.println("bye");
    }
}

package HomeWork_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaskD_Queue {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = "";

        while(!text.equals("exit")) {
            text = reader.readLine();
            String words[] = text.split(" ");
            switch (words[0]) {
                case "push":
                    list.add(Integer.parseInt(words[1]));
                    System.out.println("ok");
                    break;

                case "pop":
                    System.out.println(list.remove(0));
                    break;

                case "front":
                    System.out.println(list.get(0));
                    break;

                case "size":
                    System.out.println(list.size());
                    break;

                case "clear":
                    list.clear();
                    System.out.println("ok");
            }
        }
        System.out.println("bye");
    }
}

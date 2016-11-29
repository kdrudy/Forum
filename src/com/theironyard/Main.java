package com.theironyard;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	    ArrayList<Post> posts = new ArrayList<>();

	    File f = new File("posts.txt");
	    Scanner fileScanner = new Scanner(f);
        while(fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] columns = line.split("\\|");
            Post p = new Post(columns[1], columns[2], Integer.parseInt(columns[0]));
            posts.add(p);
        }

        Scanner consoleScanner = new Scanner(System.in);

        int replyId = -1;
        while(true) {
            int id = 0;
            for(Post p: posts) {
                if(p.replyId == replyId) {
                    System.out.printf("(%d) %s by %s\n", id, p.text, p.author);
                }
                id++;
            }

            System.out.println("Type the id you want to see replies to:");
            replyId = Integer.parseInt(consoleScanner.nextLine());
        }
    }
}

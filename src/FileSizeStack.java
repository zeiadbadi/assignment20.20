import java.io.File;
import java.util.Scanner;
import java.util.Stack;


public class FileSizeStack {

    public static void main(String[] args) {

        System.out.print("Enter a directory file: ");

        Scanner keyboard = new Scanner(System.in);

        String myDirectory = keyboard.nextLine();

        long dirSize;

        File myFiles = new File(myDirectory);

        dirSize = getSize(myFiles);

        System.out.println(dirSize + " bytes");

    }

    public static long getSize(File myFiles) {

        long size = 0;

        Stack myStack = new Stack();

        myStack.push(myFiles);

        while (!myStack.empty()) {

            File tempFile = (File) myStack.pop();

            if (tempFile.isDirectory()) {

                File[] subFiles = tempFile.listFiles();

                for (File f : subFiles) {
                    myStack.push(f);
                }
            } else {

                size += tempFile.length();
            }
        }

        return size;

    }

}

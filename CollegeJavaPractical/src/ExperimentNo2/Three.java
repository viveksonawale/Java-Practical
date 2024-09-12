package ExperimentNo2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Three  {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader stringBuffer = new BufferedReader(inputStreamReader);
        System.out.println("Enter your name :\t");
        String name = stringBuffer.readLine();
        System.out.println("Your Name is:"+name);
    }
}

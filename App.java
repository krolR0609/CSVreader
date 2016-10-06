import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.Math.*;

public class App {

	public static void main(String[] args) throws IOException {
		Scanner s = null;
		PrintWriter output = null;
		String separator = ";"; //Символ, выбранный в кач-ве разделителя
		String part = " ";
		int x;
		int y;
		try{
			s = new Scanner(new BufferedReader(new FileReader("note.txt")));
			output = new PrintWriter(new FileWriter("out.txt"));
            while (s.hasNext()) {
            	if (s.hasNext()){
            		part = s.next();
            		x = Integer.parseInt(part.split(separator)[0]);
            		y = Integer.parseInt(part.split(separator)[1]);
            		//System.out.println("x = "+x+" y = "+y); вывод x,y для проверки
            		System.out.println("3 * "+x+"^3 + Pi * "+y+"^2"+" = "+pow(x,3)+PI*sqrt(y));
            		output.println("3 * "+x+"^3 + Pi * "+y+"^2"+" = "+pow(x,3)+PI*sqrt(y));
            	}else{
            		s.next();
            	}
            }
		}finally{
			if (s != null) {
				s.close();
			}
			if (output != null) {
                output.close();
            }
		}
	}
}
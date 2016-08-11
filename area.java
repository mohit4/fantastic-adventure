import java.util.*;

public class area {

	static double distance(int x1,int y1,int x2,int y2){
		return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
	}

	static double herons(double a,double b,double c){
		double S = (a+b+c)/2.0;
		return Math.sqrt(S*(S-a)*(S-b)*(S-c));
	}

	static int round(double d){
		return (int)(d+0.5);
	}

	public static void main(String[] args) {
		int x1,x2,x3,y1,y2,y3;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 coordinates : ");
		x1 = s.nextInt();
		y1 = s.nextInt();
		x2 = s.nextInt();
		y2 = s.nextInt();
		x3 = s.nextInt();
		y3 = s.nextInt();
		s.close();
		double A,B,C;
		A = distance(x1,y1,x2,y2);
		B = distance(x2,y2,x3,y3);
		C = distance(x3,y3,x1,y1);
		double Area = herons(A,B,C);
		System.out.println("Area of triangle is "+round(Area));
	}

}
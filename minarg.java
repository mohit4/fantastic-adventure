public class minarg{
	public static void main(String[] args) {
		int a=5,b=4,res;
		res=fun(a,b);
		System.out.println(res);
		res=fun(1,5,a,b,7,99,100);
		System.out.println(res);
	}

	//overloaded functions goes here
	static int fun(int a,int b,int c,int d,int e,int f,int g){
		if(a<b&&a<c&&a<d&&a<e&&a<f&&a<g)
			return a;
		if(b<c&&b<d&&b<e&&b<f&&b<g)
			return b;
		if(c<d&&c<e&&c<f&&c<g)
			return c;
		if(d<e&&d<f&&d<g)
			return d;
		if(e<f&&e<g)
			return e;
		if(f<g)
			return f;
		return g;
	}

	static int fun(int a,int b){
		return (a>b)?b:a;
	}
}
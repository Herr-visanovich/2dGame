
public class Calculator {
	
	private int y,a,b,c,d,e,g,h,j,k,m,r,n,p;
	
	public void setY(int year) {
		y = year;
		return;
	}
	public int getY() {
		return y;
	}
	
	public String calculateEaster(double year) {
		a = y % 19;
		b = y / 100;
		c = y % 100;
		d = b / 4;
		e = b % 4;
		g = ((8 * b) + 13) / 25;
		h = ((19 * a) + b - d - g + 15) % 30;
		j = c / 4;
		k = c % 4;
		m = (a + (11 * h)) / 319;
		r = (2 * e + 2 * j - k - h + m + 32) % 7;
		n = (h - m + r + 90) / 25;
		p = (h - m + r + n + 19) % 32;
		String easter = ("Easter in " + y + ", is on day: " + p + ", of month: " + n);
		return easter;	
	}	

}

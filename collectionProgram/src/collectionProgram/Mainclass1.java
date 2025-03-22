package collectionProgram;
class Product{
	int pid;
	double price;
	Product(int pid, double price){
		this.pid=pid;
		this.price=price;
		}
	@Override
	public String toString() {
		return "[pid:"+pid+",price: "+price+"]";
	}
}
public class Mainclass1 {
 public static void main(String[] args) {
 Product[] kart = new Product[5];
 kart[0] = new Product(101,3500.0);
 kart[1] = new Product(102,3900.0);
 kart[2] = new Product(121,4500.0);
 kart[3] = new Product(131,7500.0);
 kart[4] = new Product(141,3600.0);
 for(int i=0;i<kart.length;i++) {
   System.out.println(kart[i]);

 }
}
}

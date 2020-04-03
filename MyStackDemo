package K;
import java.util.Random;
import java.util.UUID;
//Jahreiss, Kevin; Karasz, David; Urban, Melanie; 
public class MyStackDemo {
	
	public static void main(String[] args) {
		//Integer Stack test 
		DynStack<Integer> popo = new DynStack<>();
		//String Stack test 
		DynStack<String> popo1 = new DynStack<>();

		
		//Integer
		System.out.println("Integer: ");
		System.out.println(popo.contains(3));
		System.out.println(popo.amountOf(3));
		System.out.println(popo.isEmpty());
		System.out.println(popo.size());
		
		
		popo.push(1);
		popo.push(2);
		popo.push(3);
		
		System.out.println(popo.amountOf(2));
		System.out.println(popo.contains(5));
		System.out.println(popo.contains(1));
		
		popo.pop();
		popo.pop();
		popo.pop();
		
		
		//String
		System.out.println();
		System.out.println("String: ");
		System.out.println(popo1.contains("a"));
		System.out.println(popo1.amountOf("b"));
		System.out.println(popo1.isEmpty());
		System.out.println(popo1.size());
		
		popo1.push("aa");
		popo1.push("bb");
		popo1.push("cc");
		
		System.out.println(popo1.amountOf("aaa"));
		System.out.println(popo1.contains("bbb"));
		System.out.println(popo1.contains("ccc"));
		
		popo1.pop();
		popo1.pop();
		popo1.pop();
		
		
		System.out.println();
		System.out.println("Integer Radnom: ");
		//Fill the Stack with 1000 Random Integer Elements and run them with 1000 different random push pop peek functions
		for(int i = 0; i < 1000; i++) {
			popo.push(new Random().nextInt(1000));
		}
		System.out.println(popo.toString());
		for(int i = 0; i < 1000; i++) {
			int n = new Random().nextInt(5);
			if(n >= 3) {
				popo.push(new Random().nextInt(1000));
				System.out.println("push wird ausgefuhrt.");
			}
			if(n >= 1 && n < 3) {
				popo.pop();
				System.out.println("pop wird ausgefuhrt.");
			}
			if(n == 0) {
				popo.peek();
				System.out.println("peek wird ausgefuhrt.");
			}
		}
		System.out.println(popo.toString());
		System.out.println(popo.size());
		System.out.println(popo.pop());
		System.out.println(popo.pop());
		System.out.println(popo.pop());
		
		System.out.println();
		System.out.println("String Radnom: ");
		//Fill the Stack with 1000 Random String Elements and run them with 1000 different random push pop peek functions
		for(int i=0;i<=1000;i++){
			String n = generateString();
			popo1.push(n);
			if(i>1000){
				System.out.println(popo1.peek());
			}
		}
		System.out.println();
		for(int i=0;i<=1000;i++){
			Random rand=new Random();
			int n = rand.nextInt(5)+1;
			if(n==1||n==2){
				String n1 = generateString();
				popo1.push(n1);
			}else if(n==3||n==4){
				popo1.pop();
			}else if(n==5){
				popo1.peek();
			}
			if(i>990){
				System.out.println(popo1.peek());
			}
		}
		
	}
	
	
	// Make a random String and
		public static String generateString(){
			String uuid = UUID.randomUUID().toString();
			return uuid;
		}

}

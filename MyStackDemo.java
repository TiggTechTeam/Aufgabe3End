public class MyStackDemo {
	
	public static void main(String[] args) {
		//Integer Stack test 
		DynStack<Integer> intStack = new DynStack<>();
		//String Stack test 
		DynStack<String>strStack = new DynStack<>();

		
		//Integer
		System.out.println("Integer: ");
		System.out.println(intStack.contains(3));
		System.out.println(intStack.isEmpty());
		System.out.println(intStack.size());
		
		
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		
		System.out.println(intStack.contains(5));
		System.out.println(intStack.contains(1));
		
		intStack.pop();
		intStack.pop();
		intStack.pop();
		
		
		//String
		System.out.println();
		System.out.println("String: ");
		System.out.println(strStack.contains("a"));
		System.out.println(strStack.isEmpty());
		System.out.println(strStack.size());
		
		strStack.push("aa");
		strStack.push("bb");
		strStack.push("cc");
		
		System.out.println(strStack.contains("bbb"));
		System.out.println(strStack.contains("ccc"));
		
		strStack.pop();
		strStack.pop();
		strStack.pop();
		
		
		System.out.println();
		System.out.println("Integer Radnom: ");
		//Fill the Stack with 1000 Random Integer Elements and run them with 1000 different random push pop peek functions
		for(int i = 0; i < 1000; i++) {
			intStack.push(new Random().nextInt(1000));
		}
		System.out.println(intStack.toString());
		for(int i = 0; i < 1000; i++) {
			int n = new Random().nextInt(5);
			if(n >= 3) {
				intStack.push(new Random().nextInt(1000));
				System.out.println("push wird ausgefuhrt.");
			}
			if(n >= 1 && n < 3) {
				intStack.pop();
				System.out.println("pop wird ausgefuhrt.");
			}
			if(n == 0) {
				intStack.peek();
				System.out.println("peek wird ausgefuhrt.");
			}
		}
		System.out.println(intStack.toString());
		System.out.println(intStack.size());
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		
		System.out.println();
		System.out.println("String Radnom: ");
		//Fill the Stack with 1000 Random String Elements and run them with 1000 different random push pop peek functions
		for(int i=0;i<=1000;i++){
			String n = generateString();
			strStack.push(n);
			if(i>1000){
				System.out.println(strStack.peek());
			}
		}
		System.out.println();
		for(int i=0;i<=1000;i++){
			Random rand=new Random();
			int n = rand.nextInt(5)+1;
			if(n==1||n==2){
				String n1 = generateString();
				strStack.push(n1);
			}else if(n==3||n==4){
				strStack.pop();
			}else if(n==5){
				strStack.peek();
			}
			if(i>990){
				System.out.println(strStack.peek());
			}
		}
		
	}
	
	
	// Make a random String and
		public static String generateString(){
			String uuid = UUID.randomUUID().toString();
			return uuid;
		}

}

class Lab4Ex1{

public static void main(String args[]){
	
	System.out.println("String:"+args[0]);
	
	System.out.println("Integer:"+args[1]);
	int a = Integer.parseInt(args[1]);
	
    System.out.println("Float:"+args[2]);
	float b = Float.parseFloat(args[2]);
	
	if(a>b){
	System.out.println("Integer value is greater than Float value.Max:"+a);	
    }else{
		System.out.println("Integers less than float.Max:"+b);
	}
	
	
}

}
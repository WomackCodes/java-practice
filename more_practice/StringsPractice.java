package more_practice;

public class StringsPractice {
    		
	public static void main(String[] args) {
		
//		
//		String str = "ABCD";
//		
//		String extractedString = str.substring(1,3);
//		
//		System.out.println(extractedString);
		
		String a = "hello";
		String b = "goodbye";
		
		
		// if (!a.equals("hello")){
		// 	System.out.println("Something is wrong with A");
		// } else {
		// 	System.out.println("Yep, a equals 'hello'.");
		// }
		
		// if (!b.equals("goodbye")) {
		// 	System.out.println("Something is wrong with B");
		// } else {
		// 	System.out.println("Yep, b equals 'goodbye'.");
        // }
        
        // System.out.println(a.charAt(0));
		// System.out.println(a.charAt(1));
		// System.out.println(a.charAt(2));
		// System.out.println(a.charAt(3));
        // System.out.println(a.charAt(4));
        
        // System.out.println("Goodbye " + b.charAt(0));

		String c = "Listening to some great music... like great";
		
		String d = "But wait there's more";

		int i = c.indexOf("great", 20);
		int i2 = d.indexOf("wait");
		int i3 = c.indexOf("to");
        System.out.println(i);
        System.out.println(i2);
		System.out.println(i3);

	}
}


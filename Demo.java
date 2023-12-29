class OuterClass {			//start of OuterClass
    String msg = "I am Asjad";

    static class StaticNestedClass {
        public void display() {
        OuterClass outerObject = new OuterClass();
        System.out.println(outerObject.msg+" displayed by Non-static Method of Nested Class");
        }
    }

}						//end of Outer Class
    
class staticNestedDemo1 {
    public static void main(String[] args) {
		OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
		nestedObject.display();	
	
		}
}

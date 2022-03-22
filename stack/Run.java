package stack;

public class Run {

public static void main(String[] args) {
	MinStack2017 mn = new MinStack2017();
	mn.push(22);
	mn.push(2);
	mn.push(21);
	mn.push(2);
	mn.push(2);
	mn.pop();
	System.out.println(mn.min);
	System.out.println(mn.top());
}

}

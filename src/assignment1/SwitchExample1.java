package assignment1;
public class SwitchExample1 {
	public static void main(String[] args) {
		int num=-1;
	     switch(num+2)
	     {
	    case 1:
		  System.out.println("Case1: \nValue is: "+num);
		  break;
		case 2:
		  System.out.println("Case2: \nValue is: "+num);
		  break;
		case 3:
		  System.out.println("Case3: \nValue is: "+num);
		  break;
	    default:
		  System.out.println("Default: \nValue is: "+num);
	     }
	}
}

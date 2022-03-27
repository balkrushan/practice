package exercise;

public class RemoveSpace {

	public static void main(String[] args) {
     String a ="try   to  remove space  ";
           String b=  a.replaceAll("\\s","");
            System.out.println(b);

	}

}

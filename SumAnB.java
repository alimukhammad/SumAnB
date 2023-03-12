
public class SumAnB{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter integer value A: ");
        Integer A = Integer.parseInt(sc.nextLine());

        System.out.println("Enter integer value B: ");
        Integer B = Integer.parseInt(sc.nextLine());
        
        System.out.println(A + " + " + B " = " (A+B));
    }
}
package basics;

public class BranchingStatements {
    public static void main(String[] args) {
        // Break
        for (int i = 0; i <10; i++) {
            System.out.println("Hello world");
            if (i == 1) {
              break;
            }
        }
        //Continue
        for (int i = 0; i < 10; i++){
            if(i == 8){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}

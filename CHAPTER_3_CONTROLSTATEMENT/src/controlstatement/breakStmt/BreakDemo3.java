package controlstatement.breakStmt;

public class BreakDemo3 {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            System.out.println("i : "+i);
            for(int j=1;j<=3;j++){
                System.out.println("j : "+j);
                if(j==2){
                    break;
                }
            }
        }
    }
}

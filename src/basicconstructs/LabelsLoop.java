package basicconstructs;

public class LabelsLoop {

    public static void main(String[] args) {
        int x = 0;
        loop: for (int i = 1; i < 5; i++){
            for (int j = 1; j < 5; j++){
                System.out.println(i);
                if (x == 0) {  continue loop;  }
                System.out.println(j);
            }
        }

        int c = 0;
        boolean flag = true;
        for(int i = 0; i < 3; i++){
            while(flag){
                c++;
                if(i>c || c>5) flag = false;
            }
        }
        System.out.println(c);

        int assign = 1;
        System.out.println(assign = 3);


        int xa  = 0;
        labelA:   for (int i=10; i>=0; i--){
            int j = 0;
            labelB:
            while (j < 10){
                if (j > i) break labelB;
                if (i == j){
                    xa++;
                    continue labelA;
                }
                j++;
            }
            xa--;
        }
        System.out.println(xa);

    }
}

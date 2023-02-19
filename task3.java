import java.util.Arrays;
 
public class task3 {
    public static void main(String[] args) {
        int [] mas = new int [100];
       
        for (int i = 0; i < mas.length; i++) {
             mas[i] = (int)(Math.random()*100)+1;
        }
        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) {
          if (i < 0) array[i] = i * -1; 
          else array[mas] = i;
        }
        System.out.println(Arrays.toString(mas));
    }
}
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] arr = new int[20];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("moi nhap phan tu thu "+ i+" cua mang");
            arr[i]= scanner.nextInt();
        }

        System.out.println("truoc khi hoan doi");
        for (int a:arr
             ) {
            System.out.print(a+" ");
        }
        System.out.println("\n sau khi hoan doi");
        int first,last;
        first =0;
        last = arr.length -1;
        while (first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        for (int a:arr
        ) {
            System.out.print(a+" ");
        }

    }
}

// BAEKJOON 2750
// https://www.acmicpc.net/problem/2750
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int size = scanner.nextInt();
    int[] num_list = new int[size];
    for (int i=0; i<size; i++){
      num_list[i] = scanner.nextInt();
    }
    
    for (int i=size-1;i>=0;i--){
      for (int j=0; j<i;j++){
        if(num_list[j]>num_list[j+1]){
          int tmp = num_list[j];
          num_list[j] = num_list[j+1];
          num_list[j+1] = tmp;
        }
      }
    }
    
    
    for (int e: num_list){
      System.out.println(e);
    }
    
  }
}

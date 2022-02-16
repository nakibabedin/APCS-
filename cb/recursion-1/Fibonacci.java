/*
TNPG: NARG |Nakib Abedin; Russel Goychayev
APCS pd07
HW64 -- Coding Bat Recursion
2022-02-14

*/
public class Fibonacci{
  public int fibonacci(int n) {
  if (n == 0){
    return 0;
  }else if (n==1){
    return 1;
  }else{
    return fibonacci(n-2) + fibonacci(n-1);
  }
}

}

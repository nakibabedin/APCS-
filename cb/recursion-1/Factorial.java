/*
TNPG: NARG |Nakib Abedin; Russel Goychayev
APCS pd07
HW64 -- Coding Bat Recursion
2022-02-14

*/
public class Factorial{
  public int factorial(int n) {
  if (n == 1){
    return 1;
  }else{
    return n * factorial(n-1);
  }
}
}

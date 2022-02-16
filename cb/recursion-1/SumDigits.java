/*
TNPG: NARG |Nakib Abedin; Russel Goychayev
APCS pd07
HW64 -- Coding Bat Recursion
2022-02-14

*/
public class SumDigits{
  public int sumDigits(int n) {
  if (n < 10){
    return n;
  }else{
    return (n % 10) + sumDigits(n / 10);
  }
}

}

/*
TNPG: NARG |Nakib Abedin; Russel Goychayev
APCS pd07
HW64 -- Coding Bat Recursion
2022-02-14

*/

public class BunnyEars{
  public int bunnyEars(int bunnies) {
  if (bunnies == 0){
    return 0;
  }else{
    return 2 + bunnyEars(bunnies-1);
  }
}
}

/*
TNPG: NARG |Nakib Abedin; Russel Goychayev
APCS pd07
HW64 -- Coding Bat Recursion
2022-02-14

*/
public class Triangle{
  public int triangle(int rows) {
  if (rows == 0){
    return 0;
  }else{
    return rows + triangle(rows-1);
  }
}

}

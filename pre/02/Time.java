public class Time {

  public static void main(String[] args) {
    int hour = 21;
    int minute = 01;
    int second = 13;
    int secsSinceMidnight = ((hour * 3600) + (minute * 60) + second);

    // Variables Defined


    System.out.println("Time now: " + hour + ":" + minute + ":" + second);
    System.out.println("Seconds since midnight: " + secsSinceMidnight);
    System.out.println("Seconds remaining in the day: " + ((24 * 3600) - secsSinceMidnight));
    System.out.println("Percent of the day passed: "+ (secsSinceMidnight * 100) / (24 * 3600));

    // Print Commands

    hour = 21;
    minute = 30;
    second = 35;
    int newTime = ((hour * 3600) + (minute * 60) + second);
    System.out.println(newTime - secsSinceMidnight + " seconds have passed");

    // Prints out time that elapsed since beginning
  }
}

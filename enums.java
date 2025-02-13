 enum DAY
        {MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY ,SATURDAY,SUNDAY
        }
class enums
  {
    public static void main(String[] args)
    {
     
      DAY day = DAY.MONDAY;
      if(day == DAY.SUNDAY || day == DAY.SATURDAY)
      {
       System.out.println("WEEKEND");
      }
     else
     {
      System.out.println("WEEKDAY");
     }
  }
}

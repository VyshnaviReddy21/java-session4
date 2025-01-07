public class Day4_Conditional {
        public static void main(String[] args) {
    
            Day4_Conditional session = new Day4_Conditional();
            System.out.println(session.cigarParty(50, false));  
            System.out.println(session.cigarParty(30, true));   
        }
      
        
        public boolean cigarParty(int cigars, boolean isWeekend) {
            if (isWeekend) {
                return cigars >= 40;
            } else {
                return cigars >= 40 && cigars <= 60;
            }
        }
    }


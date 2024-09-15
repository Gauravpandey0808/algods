package trees;


public enum Enumration {

   AE000("AE000","0","SUCCESS" );

   private final String code;

   private final String status;

   private final String description;

   Enumration(String code , String status , String description ) {
       this.code = code ;
       this.status=status;
       this.description=description;
   }
}

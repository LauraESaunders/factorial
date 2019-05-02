public class PreconditionException extends Exception{
    public PreconditionException(String description){   //constructor function
        super("Precondition failed: " + description);     //calls the parent construction with an error message
    }
}
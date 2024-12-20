import java.util.*;
import java.io.*;
import java.util.function.*;
public class NotValidAgeException extends  Exception{
    public NotValidAgeException(){
        super();
    }
    public NotValidAgeException(String message){
        super(message);
    }

    public String getMessage(){
        return 'Age must be over 18';
    }
}

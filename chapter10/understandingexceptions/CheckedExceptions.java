package chapter10.understandingexceptions;

import java.io.IOException;
//using throwa
public class CheckedExceptions {
    void fall(int distance) throws IOException {  //it might throw an IOException depending on distance
        if(distance > 10) {
            throw new IOException();  // it will throw this exception if distancee is > 10
        }
    }

}

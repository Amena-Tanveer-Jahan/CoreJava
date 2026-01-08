package strings;

import java.util.logging.Logger;

public class Basic {
    private static final Logger logger= Logger.getLogger(Basic.class.getName());
    public static void main(String[] args){
        String str="Tanveer";
        str.concat(" Jahan");// It will not concatenate Jahan to Tanveer
        str=str.concat(" Jahan");//it will create a new object in string constant pool
        logger.info(str);

    }
}

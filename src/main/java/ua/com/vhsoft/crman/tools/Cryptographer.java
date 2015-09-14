package ua.com.vhsoft.crman.tools;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.log4j.Logger;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
public class Cryptographer {

    public static final Logger LOGGER = Logger.getLogger(Cryptographer.class);

    /**
     * MD5 generator
     *
     * @param bytesOfMessage
     * @return
     */
    public static String getMD5Hash(byte[] bytesOfMessage) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            LOGGER.error("Crypt error: {0}", ex);
        }
        md.reset();
        md.update(bytesOfMessage);
        byte[] digest = md.digest();
        BigInteger bigInt = new BigInteger(1, digest);
        String hashtext = bigInt.toString(16);
        return hashtext;
    }

    /**
     * double MD5 generator
     *
     * @param bytesOfMessage
     * @return
     */
    public static String getDoubleMD5Hash(byte[] bytesOfMessage) {

        String hashtext = getMD5Hash(bytesOfMessage); //1st
        hashtext = getMD5Hash(hashtext.getBytes());   //2nd

        return hashtext;
    }
}

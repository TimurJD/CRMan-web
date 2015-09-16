package ua.com.vhsoft.crman.tools;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.log4j.Logger;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
public class Cryptographer implements PasswordEncoder {

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

    /**
     * Encode double md5 hash
     * @param cs
     * @return 
     */
    @Override
    public String encode(CharSequence cs) {
        return getDoubleMD5Hash(cs.toString().getBytes());
    }

    @Override
    public boolean matches(CharSequence cs, String string) {
        if (encode(cs).equals(string)){
            return true;
        }
        return false;
    }
}

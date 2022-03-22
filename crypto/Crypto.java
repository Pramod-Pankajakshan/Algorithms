package crypto;

import java.io.File; 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.security.*;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.apache.commons.codec.binary.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.xml.bind.DatatypeConverter;
public class Crypto {
	
/**
 * 
 *  "d6c6d31fd4c49e005f456fe1a6fa58446bfd2661419c160371afc0d1": {
    "messgae": "0x91762c7dd25d243a0dde486b14150d1b0bf0a52a3de1df10e12c553e52baff2d14a9da3039395c26b65d036e6dc2a8139b9eb987ae29e22c51f2c18a2ffb4cc004fce40d9cdc9d0a0e0d15cc1357d1d9ca8da8cd4117dad079291cdd58ff175c6e6d6549881cb5edda23cb324b385753fe17fca2bbd81f877b8c17ceddeb47f", 
    "e": "0x10001", 
    "d": "0x48b434fad594aa2d787ea209b8c7b931d11dd7a67e682ca801265f5964d4da3f42f01cbcdfda71b9c3cb2a8a8ed20e9eadb7b6ef8ec76a3dc17029cb3ac6262e2af2ed51e3fdddaa26565acadc698f072754676046ba3c2da529491ecfd0bbf89f20ed85bf086a92b9312e640f0fe238f602b23bcca512d036cdc3304300aa15", 
    "N": "0xaeab4877b1fdc3a3de845d35d3ecd62b3f29f7201add5f2b839f0b3ff505be7a7a9cb310d02df61c56323105a7226d2faf941593d9a9fdbd6c5cb63433b3eb5d0f048d3f3f5f46b98edb3a92829c279fdb917bf44098213d34b27a1cbd13a61022662d12ff182c6c7d32f8419351f8e4ee3427d8d6d81656d9334eecd185e675"
  }, 	
 * @param arg
 */
	private Cipher cipher;  
	
	public static byte[] toByteArray(String s) {
	    return DatatypeConverter.parseHexBinary(s);
	}
	public Crypto() throws NoSuchAlgorithmException, NoSuchPaddingException{
		this.cipher = Cipher.getInstance("RSA");
	}
	//https://docs.oracle.com/javase/8/docs/api/java/security/spec/PKCS8EncodedKeySpec.html
	public PrivateKey getPrivate(String filename) throws Exception {
	   String privateKeyd= "48b434fad594aa2d787ea209b8c7b931d11dd7a67e682ca801265f5964d4da3f42f01cbcdfda71b9c3cb2a8a8ed20e9eadb7b6ef8ec76a3dc17029cb3ac6262e2af2ed51e3fdddaa26565acadc698f072754676046ba3c2da529491ecfd0bbf89f20ed85bf086a92b9312e640f0fe238f602b23bcca512d036cdc3304300aa15"; 
	   String e= "AA";
	   byte[] k=  toByteArray(privateKeyd);
	   System.out.println(Long.valueOf(new String(k)));
		
	//	byte[] keyBytes = Files.readAllBytes(new File(filename).toPath());
		PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(k);
		KeyFactory kf = KeyFactory.getInstance("RSA");
		return kf.generatePrivate(spec);
	}
	//https://docs.oracle.com/javase/8/docs/api/java/security/spec/X509EncodedKeySpec.html
	public PublicKey getPublic(String filename) throws Exception {
		byte[] keyBytes = Files.readAllBytes(new File(filename).toPath());
		X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
		KeyFactory kf = KeyFactory.getInstance("RSA");
		return kf.generatePublic(spec);
	}
	
	public void encryptFile(byte[] input, File output, PrivateKey key) throws IOException, GeneralSecurityException {
		this.cipher.init(Cipher.ENCRYPT_MODE, key);
		writeToFile(output, this.cipher.doFinal(input));
    }
	
	public void decryptFile(byte[] input, File output, PublicKey key) throws IOException, GeneralSecurityException {
		this.cipher.init(Cipher.DECRYPT_MODE, key);
		writeToFile(output, this.cipher.doFinal(input));
    }
	
	private void writeToFile(File output, byte[] toWrite) throws IllegalBlockSizeException, BadPaddingException, IOException{
		FileOutputStream fos = new FileOutputStream(output);
		fos.write(toWrite);
		fos.flush();
		fos.close();
	}
	
	public String encryptText(String msg, PrivateKey key) throws NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException{
		this.cipher.init(Cipher.ENCRYPT_MODE, key);
		return Base64.encodeBase64String(cipher.doFinal(msg.getBytes("UTF-8")));
	}
	
	public String decryptText(String msg, PublicKey key) throws InvalidKeyException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException{
		this.cipher.init(Cipher.DECRYPT_MODE, key);
		return new String(cipher.doFinal(Base64.decodeBase64(msg)), "UTF-8");
	}
	
	public byte[] getFileInBytes(File f) throws IOException{
		FileInputStream fis = new FileInputStream(f);
		byte[] fbytes = new byte[(int) f.length()];
		fis.read(fbytes);
		fis.close();
		return fbytes;
	}

	public static void main(String[] args) throws Exception {
		Crypto ac = new Crypto();
		PrivateKey privateKey = ac.getPrivate("/Users/pramod/Documents/workspace1/PREPAREFORBIG/src/crypto/privateKey");
		//PublicKey publicKey = ac.getPublic("/Users/pramod/Documents/workspace1/PREPAREFORBIG/src/crypto/publicKey");
//		
//		String msg = "Cryptography is fun!";
//		String encrypted_msg = ac.encryptText(msg, privateKey);
//		String decrypted_msg = ac.decryptText(encrypted_msg, publicKey);
//		System.out.println("Original Message: " + msg + "\nEncrypted Message: " + encrypted_msg + "\nDecrypted Message: " + decrypted_msg);
//		
//		if(new File("KeyPair/text.txt").exists()){
//			ac.encryptFile(ac.getFileInBytes(new File("KeyPair/text.txt")), new File("KeyPair/text_encrypted.txt"), privateKey);
//			ac.decryptFile(ac.getFileInBytes(new File("KeyPair/text_encrypted.txt")), new File("KeyPair/text_decrypted.txt"), publicKey);
//		}else{
//			System.out.println("Create a file text.txt under folder KeyPair");
//		}
	}



}


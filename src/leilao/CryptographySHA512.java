/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leilao;

/**
 *
 * @author Ortiz
 */
import java.security.NoSuchAlgorithmException;
 
 public class CryptographySHA512 extends CryptographyGeneric implements Cryptography {
 
   public String encrypt(String value) throws NoSuchAlgorithmException {
     return encryptByAlgorithm("SHA-512", value);
   }
 
 }
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
 
 public interface Cryptography {
 
   String encrypt(String value) throws NoSuchAlgorithmException;
 
 }
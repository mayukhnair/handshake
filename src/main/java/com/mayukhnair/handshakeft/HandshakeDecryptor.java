/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mayukhnair.handshakeft;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

/**
 *
 * @author nairm_000
 */
public class HandshakeDecryptor {
   public String decryptFriendKey(String friendKey){
       String fk=friendKey;
       StandardPBEStringEncryptor e2=new StandardPBEStringEncryptor();
       String poison="GoKissTheWorldYouGoddamnFatArse";
       e2.setPassword(poison);
       String intermediate=e2.decrypt(friendKey);
       StringBuffer AntidoteX=new StringBuffer(intermediate);
       return(AntidoteX.reverse().toString());
   }
}

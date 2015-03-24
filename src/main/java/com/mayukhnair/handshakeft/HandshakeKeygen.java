/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.mayukhnair.handshakeft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

/**
 *
 * @author nairm_000
 */
public class HandshakeKeygen {
    
    public String GetHandshakeKey() throws IOException{
        URL myip=new URL("http://icanhazip.com");
        BufferedReader input=new BufferedReader(new InputStreamReader(myip.openStream()));
       StringBuffer rev=new StringBuffer(input.readLine().toString());
       String reactant=rev.reverse().toString();
       String catalyst="GoKissTheWorldYouGoddamnFatArse";
       StandardPBEStringEncryptor e1=new StandardPBEStringEncryptor();
       e1.setPassword(catalyst);
       return(e1.encrypt(reactant));
    }
    
}

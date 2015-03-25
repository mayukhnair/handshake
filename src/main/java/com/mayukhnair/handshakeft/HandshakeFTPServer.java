/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mayukhnair.handshakeft;

import org.apache.ftpserver.FtpServer;
import org.apache.ftpserver.FtpServerFactory;
import org.apache.ftpserver.listener.ListenerFactory;

/**
 *
 * @author nairm_000
 */
public class HandshakeFTPServer {
    public void StartFTPServer(){
    FtpServerFactory ftpservfact=new FtpServerFactory();
    ListenerFactory ear=new ListenerFactory();
    ear.setPort(2964);
    ftpservfact.addListener("default", ear.createListener());
    FtpServer ftpserv=ftpservfact.createServer();
    System.out.println("FTP server started at localhost:2964");
    }
}

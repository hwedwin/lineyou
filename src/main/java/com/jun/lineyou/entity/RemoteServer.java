package com.jun.lineyou.entity;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * 远程服务器
 *
 * @author Jun
 * @date 2020-07-09 11:07
 */
public class RemoteServer {

    private SimpleStringProperty remoteHost = new SimpleStringProperty();
    private SimpleIntegerProperty remotePort = new SimpleIntegerProperty();

    public String getRemoteHost() {
        return remoteHost.get();
    }

    public void setRemoteHost(String remoteHost) {
        this.remoteHost.set(remoteHost);
    }

    public SimpleStringProperty remoteHostProperty() {
        return remoteHost;
    }

    public int getRemotePort() {
        return remotePort.get();
    }

    public void setRemotePort(int remotePort) {
        this.remotePort.set(remotePort);
    }

    public SimpleIntegerProperty remotePortProperty() {
        return remotePort;
    }

    @Override
    public String toString() {
        return "RemoteServer{" +
                "remoteHost=" + remoteHost +
                ", remotePort=" + remotePort +
                '}';
    }
}

package com.example.webrtctest.bean;

public class UserInfo {
    public String ip;

    public String port;

    public String name;

    public String password;

    public String called;

    public UserInfo(String ip, String port, String name, String password, String called) {
        this.ip = ip;
        this.port = port;
        this.name = name;
        this.password = password;
        this.called = called;
    }

    public UserInfo() {
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "ip='" + ip + '\'' +
                ", port='" + port + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", called='" + called + '\'' +
                '}';
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCalled() {
        return called;
    }

    public void setCalled(String called) {
        this.called = called;
    }
}

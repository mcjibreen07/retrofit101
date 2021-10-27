package com.projects.msimplefintech;

import com.google.gson.annotations.SerializedName;

public class Model {
    @SerializedName("account_name")
    private String account;
    @SerializedName("Bank_name")
    private String Bank_name;
    @SerializedName("status")
    private String status;

    public Model(String account, String bank_name, String status) {
        this.account = account;
        Bank_name = bank_name;
        this.status = status;
    }

    public String getBank_name() {
        return Bank_name;
    }

    public void setBank_name(String bank_name) {
        Bank_name = bank_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}

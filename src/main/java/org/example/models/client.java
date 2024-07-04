package org.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class client {
    @JsonProperty
    private int clientId;
    @JsonProperty
    private String clientName;
    @JsonProperty
    private String clientAddress;
    @JsonProperty
    private String clientPhoneNumber;

    public client(final int clientId, final String clientName,
                  final String clientAddress,
                  final String clientPhoneNumber) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.clientPhoneNumber = clientPhoneNumber;
    }


    public int getClientId() {
        return clientId;
    }

    public void setClientId(final int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(final String clientName) {
        this.clientName = clientName;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(final String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setClientPhoneNumber(final String clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }
}

package com.springai.enums;

import lombok.Getter;

@Getter
public enum HistoryType {
   CHAT("chat"),SERVICE("service"),PDF("pdf");
   private final String type;
    HistoryType(String type) {
        this.type=type;
    }
    public String getType(){return type;}
}

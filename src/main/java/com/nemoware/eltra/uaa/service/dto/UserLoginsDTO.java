package com.nemoware.eltra.uaa.service.dto;

import java.util.List;

public class UserLoginsDTO {
    private List<String> logins;

    public List<String> getLogins() {
        return logins;
    }

    public void setLogins(List<String> logins) {
        this.logins = logins;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        boolean first = true;
        for(String login : logins){
            if(!first){
                result.append(", ");
            }
            result.append(login);
            first = false;
        }
        return result.toString();
    }
}

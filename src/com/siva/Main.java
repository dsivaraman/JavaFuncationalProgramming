package com.siva;

import java.util.Objects;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        UserType userType = new UserType();

//        Optional.ofNullable(userType.getPartNumber()).filter(s -> {
//            System.out.println("-- inside filter");
//            return !s.trim().isEmpty();}).ifPresent(s -> System.out.println("ABC"+ s.trim().length()));

        Optional.ofNullable(userType.getPartNumber())
                .filter(s -> !s.trim().isEmpty())
                .ifPresent(s -> {
                    System.out.println("inside if present");
                    userType.setCopyPartNumber(userType.getPartNumber());
                });
        System.out.println("copyPartNumber - "+ userType.copyPartNumber);
    }

    static class UserType {
        String partNumber = "";
        String copyPartNumber;

        public String getCopyPartNumber() {
            return copyPartNumber;
        }

        public void setCopyPartNumber(String copyPartNumber) {
            this.copyPartNumber = copyPartNumber;
        }

        public String getPartNumber() {
            return partNumber;
        }

        public void setPartNumber(String partNumber) {
            this.partNumber = partNumber;
        }
    }
}

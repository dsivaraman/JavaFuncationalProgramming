package com.siva;

public class FuelType {
    public static void main(String[] args) {

FuelType fuelType = new FuelType();

    String didval = "B782";
    String vin = "LVSHPCHB6MS102065";

       String fuelTypeValue = fuelType.getDidDeterminationCode(didval.substring(0, 4),1,3,4,vin);

        System.out.println("fuelTypeValue = " + fuelTypeValue);

    }

    public String getDidDeterminationCode(String cfgValue, int byteNum, int bitPos, int bitLen,String vin) {
        String METHOD_NAME="getDidDeterminationCode";
        String determinationCode = null;
        try {

            if (cfgValue != null && cfgValue.length() > 0) {
                int num = Integer.parseInt(cfgValue, 16);
                String binary = Integer.toBinaryString(num);
                // Convert the config value into Binary format Ex:01100010
                String cfgBit = binary.substring((byteNum*8)-8, byteNum*8);
                // Add the Leftpadding zero
                String addZero = String.format("%08d",Integer.parseInt(cfgBit));
                if (addZero != null && addZero.length() > 0 && (7-bitPos)+bitLen<=8) {
                    // Split the binary value from right to left by bitPossition and Bits in length
                    String position = addZero.substring(7-bitPos,(7-bitPos)+bitLen);
                    int dec = Integer.parseInt(position, 2);
                    // 	001 Convert back to Hex to determine region code Ex:1
                    determinationCode = Integer.toHexString(dec);
                    System.out.println("DeterminationCode : "+determinationCode);
                }
            }
        } catch (NumberFormatException numEx) {
            String msg="WiFi Hotspot - Error occurred while determining the DID for Vin "+vin;
        } catch (Exception ex) {
            String msg="WiFi Hotspot - Error occurred while determining the DID for Vin "+vin;
        }
        return determinationCode;
    }
}

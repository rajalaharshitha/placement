public class IPAddressValidator {
    public static boolean validateIPAddress(String ipAddress) {
        if (ipAddress == null || ipAddress.isEmpty()) {
            return false;
        }
        String[] parts = ipAddress.split("\\.");
        if (parts.length != 4) {
            return false;
        }
        for (String part : parts) {
            if (part.isEmpty()) {
                return false;
            }
            try {
                int num = Integer.parseInt(part);
                if (num < 0 || num > 255) {
                    return false;
                }
                if (part.startsWith("0") && part.length() > 1) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String ip1 = "222.111.111.111";
        String ip2 = "5555..555";
        String ip3 = "0.0.0.255";
        String ip4 = "0.0.0.0255";
        System.out.println(ip1 + ": " + validateIPAddress(ip1)); 
        System.out.println(ip2 + ": " + validateIPAddress(ip2));
        System.out.println(ip3 + ": " + validateIPAddress(ip3));
        System.out.println(ip4 + ": " + validateIPAddress(ip4));

    }
}
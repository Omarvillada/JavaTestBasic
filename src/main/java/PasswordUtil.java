public class PasswordUtil {
    public enum SecurityLevel{
        WEAK,MEDIUM,STRONG
    }
    public  static SecurityLevel assessPassword(String password){
        // si es menor a 8 caracteres es debil
        if(password.length() < 8) {
            return SecurityLevel.WEAK;
        }
        //Si contiene solo letras
        if (password.matches("[a-zA-Z]+")){
            return SecurityLevel.WEAK;
        }
        //Si contiene letras y numeros
        if (password.matches("[a-zA-Z0-9]+")) {
            return SecurityLevel.MEDIUM;
        }
        return SecurityLevel.STRONG;
    }
}

package conversors;

import java.util.HashMap;
import java.util.Map;

public class ConversorDolar {

    Map<String, String> listaIps = new HashMap<>();

    public void addIp(String ip, String endereco){
        if (validateIp(ip)){
            listaIps.put(ip, endereco);
        }
        else {
            System.out.println("Ip Invalido");
        }
    }

    private boolean validateIp(String ip){
        String[] pieces = ip.split(".");
        return pieces.length == 4;
    }


}

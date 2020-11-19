import com.sun.org.apache.bcel.internal.generic.Instruction;
import conversors.ConversorDolar;
import conversors.ConversorLibras;
import conversors.ConversorTemperatura;
import conversors.Convertible;

import java.util.ArrayList;
import java.util.List;

public class InstructionBatchConverter {

    public double BachExecute(Convertible exe, Double value){
        return exe.execute(value);
    }

    public List<Double> executeBatchConversion(){
        List<Double> retornos = new ArrayList<Double>();
        Convertible moeda = new ConversorDolar();
        Convertible temperatura = new ConversorTemperatura();
        Convertible peso = new ConversorLibras();

        retornos.add(BachExecute(moeda, 6.5));
        retornos.add(BachExecute(temperatura, 5.7));
        retornos.add(BachExecute(peso,7.0));

        return retornos;
    }
}

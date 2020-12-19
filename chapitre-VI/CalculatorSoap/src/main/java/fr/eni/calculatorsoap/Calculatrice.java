package fr.eni.calculatorsoap;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author rlemo
 */
@WebService
public interface Calculatrice {
    
    @WebMethod
    Long add(Long premierOperande, Long secondOperande);
    
}

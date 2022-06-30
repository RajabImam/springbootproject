/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.springbootproject.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

/**
 *
 * @author RAJAB IMAM
 */
@Aspect
@Component
@Slf4j
public class ErrorAspect {

    @AfterThrowing(value = "execution(* *..*..*(..)) &&" + "(bean(*Controller) || bean(*Service) || bean(*Repository))", throwing = "ex")
    public void throwingNull(DataAccessException ex) {
        // Exception handling (log output)
        log.error("DataAccessException has occurred");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.springbootproject.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author RAJAB IMAM
 */
@Configuration
public class JavaConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}

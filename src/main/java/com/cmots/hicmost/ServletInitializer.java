/**
 * @author: cmots
 * @date: 2020/1/9 23:54
 * @description: used to replace DD
 */
package com.cmots.hicmost;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.swing.*;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder){
        return springApplicationBuilder.sources(HicmostApplication.class);
    }
}

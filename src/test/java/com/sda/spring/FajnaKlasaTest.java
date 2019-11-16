package com.sda.spring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ContextConfiguration("/spring-config.xml")
@ExtendWith(SpringExtension.class)
class FajnaKlasaTest {

    @Autowired
    private FajnaKlasa fajnaKlasa;

    @Test
    public void test() {
        assertNotNull(fajnaKlasa.getAbbaFatima());
    }
}
package com.pagoda.service.purorder;

import com.pagoda.api.*;
import com.pagoda.api.purorder.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author PagodaGenerator
 * @generated
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PurOrderHeadServiceTest {

  @Autowired PurOrderHeadService service;

  @Test
  public void testFindBy() {
    System.out.println(service);
  }
}

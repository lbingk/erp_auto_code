package com.pagoda.service.purorgven;

import com.pagoda.api.*;
import com.pagoda.api.purorgven.*;
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
public class PurOrgVenServiceTest {

  @Autowired PurOrgVenService service;

  @Test
  public void testFindBy() {
    System.out.println(service);
  }
}

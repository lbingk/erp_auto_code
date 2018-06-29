package com.pagoda.service.salconsignreturn;

import static com.pagoda.domain.salconsignreturn.sql.SalConsignReturnHeadDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.pagoda.api.*;
import com.pagoda.api.dto.salconsignreturn.*;
import com.pagoda.api.salconsignreturn.*;
import com.pagoda.domain.salconsignreturn.*;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.repo.salconsignreturn.*;
import com.pagoda.service.salconsignreturn.base.*;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * 退货单头表服务实现类SalConsignReturnHeadServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class SalConsignReturnHeadServiceImpl extends BaseSalConsignReturnHeadServiceImpl {}

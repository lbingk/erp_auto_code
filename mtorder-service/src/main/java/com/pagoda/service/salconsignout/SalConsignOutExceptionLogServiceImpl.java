package com.pagoda.service.salconsignout;

import static com.pagoda.domain.salconsignout.sql.SalConsignOutExceptionLogDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.pagoda.api.*;
import com.pagoda.api.dto.salconsignout.*;
import com.pagoda.api.salconsignout.*;
import com.pagoda.domain.salconsignout.*;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.repo.salconsignout.*;
import com.pagoda.service.salconsignout.base.*;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * 发货出库异常记录表(每次出库异常插入新记录)服务实现类SalConsignOutExceptionLogServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class SalConsignOutExceptionLogServiceImpl extends BaseSalConsignOutExceptionLogServiceImpl
    implements SalConsignOutExceptionLogService {}

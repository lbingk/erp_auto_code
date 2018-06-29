package com.pagoda.service.purapplyorder;

import static com.pagoda.domain.purapplyorder.sql.PurApplyDetailDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.pagoda.api.*;
import com.pagoda.api.dto.purapplyorder.*;
import com.pagoda.api.purapplyorder.*;
import com.pagoda.domain.purapplyorder.*;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.repo.purapplyorder.*;
import com.pagoda.service.purapplyorder.base.*;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * 采购请购单明细表服务实现类PurApplyDetailServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class PurApplyDetailServiceImpl extends BasePurApplyDetailServiceImpl {}

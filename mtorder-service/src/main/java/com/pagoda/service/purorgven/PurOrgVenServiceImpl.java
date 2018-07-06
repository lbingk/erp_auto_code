package com.pagoda.service.purorgven;

import static com.pagoda.domain.purorgven.sql.PurOrgVenDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.pagoda.api.*;
import com.pagoda.api.dto.purorgven.*;
import com.pagoda.api.purorgven.*;
import com.pagoda.domain.purorgven.*;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.repo.purorgven.*;
import com.pagoda.service.purorgven.base.*;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * 供应商机构服务实现类PurOrgVenServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class PurOrgVenServiceImpl extends BasePurOrgVenServiceImpl implements PurOrgVenService {}
